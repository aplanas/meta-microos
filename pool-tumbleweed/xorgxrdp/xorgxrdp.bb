SUMMARY = "Xorg drivers for xrdp"
DESCRIPTION = "This package contains Xorg driver modules for xrdp"
LICENSE = "X11"

PV = "0.9.19"

RPM_NAME = "xorgxrdp-0.9.19-1.2.aarch64.rpm"
RPM_HASH = "a4988778d252032b886590adcd38b7d6efa5beccbf3790a2fe92ffbefa780137088c4598761bb5b70ed9b401b9161ca55f3d8b9d57c2b6e428c0e4059dd31def"

RPROVIDES:${PN} += "config-xorgxrdp \
libxorgxrdp.so \
xorgxrdp"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
xrdp"

inherit rpm
