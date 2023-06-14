SUMMARY = "MailImporter Akonadi based library for kdepim"
DESCRIPTION = "This package provides the mailimporter library for Akonadi based functions, \
used by KDE PIM applications to import data from other mail formats \
(such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5MailImporterAkonadi5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "09e98d799326fea087323dc6672b00d7d7cadfd819af44be82263509f7871336969f28edf7eb4d80a9eb489d469e7899b5ae8aebf89569deff15189e7fcc2ddd"

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
