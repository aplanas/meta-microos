SUMMARY = "Qt5 bindings for AppStream"
DESCRIPTION = "The Qt5 bindings for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.2"

RPM_NAME = "libAppStreamQt2-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "490e21176e9a6dbdc1aecb21487ce6e7e7b7f8abad25fbd847764af1d035fef7142a9e48a7ac6569a7fa43bc53231eeb906d4cf5eb8d4c1fa777de437066c2d5"

RPROVIDES:${PN} += "libAppStreamQt.so.2 \
libAppStreamQt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libappstream.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
