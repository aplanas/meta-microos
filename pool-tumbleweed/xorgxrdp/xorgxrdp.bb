SUMMARY = "Xorg drivers for xrdp"
DESCRIPTION = "This package contains Xorg driver modules for xrdp"
LICENSE = "X11"

PV = "0.9.19"

RPM_NAME = "xorgxrdp-0.9.19-1.3.aarch64.rpm"
RPM_HASH = "f5121f9a446082a6040fb719ee724a4c5104c93a794dbd1cdd2b353ae67947e5108ee25b5f6e685ac20763e2a0af3ec0d19b8017168cf369b5738118a1f58240"

RPROVIDES:${PN} += "config-xorgxrdp \
libxorgxrdp.so \
xorgxrdp"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
xrdp"

inherit rpm
