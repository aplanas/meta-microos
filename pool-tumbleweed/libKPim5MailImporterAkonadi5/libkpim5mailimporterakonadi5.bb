SUMMARY = "MailImporter Akonadi based library for kdepim"
DESCRIPTION = "This package provides the mailimporter library for Akonadi based functions, \
used by KDE PIM applications to import data from other mail formats \
(such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5MailImporterAkonadi5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "4abea0375dcf9c43313f8cbcf90ea4343dd48616014fc2e148dd9d645829066e5589b78829fc2f1330712d896fb97530703764a1d2ea31f41520fc631719a318"

RPROVIDES:${PN} += "libKPim5MailImporterAkonadi.so.5 \
libKPim5MailImporterAkonadi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5MailImporter.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
mailimporter"

inherit rpm
