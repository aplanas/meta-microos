SUMMARY = "MailImporter Akonadi based library for kdepim"
DESCRIPTION = "This package provides the mailimporter library for Akonadi based functions, \
used by KDE PIM applications to import data from other mail formats \
(such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5MailImporterAkonadi5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e3546f1629dc31321311e5704cb8d98723d1bbbbece5865cb4da77e134b9d256e6bfd0417977b471766622e482262343894c822e97019f894c1e14c8de3f8371"

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
