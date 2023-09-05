SUMMARY = "MIME email parser for KDE PIM - runtime plugins"
DESCRIPTION = "This package provides plugins required by PIM applications read and write parsed \
email data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-plugin-mime-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "8a3721c01547572e68e6c1ec10d20bfdd84dcea013f8c1e1c5eab302c38fce3edce6f9e92ffe82b12aafb50f903cc94476bd708bcff589cffe6a58a49b9cf701"

RPROVIDES:${PN} += "akonadi-plugin-mime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiMime5 \
libKPim5AkonadiPrivate.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
