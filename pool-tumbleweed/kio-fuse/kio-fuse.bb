SUMMARY = "Access KIO over the regular filesystem"
DESCRIPTION = "kio-fuse is a daemon which makes KIO URLs accessible to KIO unaware \
applications using FUSE."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.1"

RPM_NAME = "kio-fuse-5.0.1-3.8.aarch64.rpm"
RPM_HASH = "74437ad39c2761d33ba2695423c1d76985e8f8ad0dfee21324a45547324d511200a32a31078a079c9cf04cfb57a56bfe5a023c7804d371b1b2d2239e9732dfab"

RPROVIDES:${PN} += "kio-fuse"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libfuse3.so.3 \
libstdc++.so.6"

inherit rpm
