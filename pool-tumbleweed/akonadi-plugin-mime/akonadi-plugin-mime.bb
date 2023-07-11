SUMMARY = "MIME email parser for KDE PIM - runtime plugins"
DESCRIPTION = "This package provides plugins required by PIM applications read and write parsed \
email data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-plugin-mime-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "9d13b00f037835fc7ffde32f7dc1e320ad9d7b7cf155886769fe60412bcd48e70908876772443702e1d8673a1eaf1e62c685c6aa99045117a3d46400fdbd08a2"

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
