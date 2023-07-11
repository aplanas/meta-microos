SUMMARY = "HW video decode support for VDPAU platforms"
DESCRIPTION = "VDPAU Backend for Video Acceleration (VA) API HW video decode support."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.4"

RPM_NAME = "libva-vdpau-driver-0.7.4-7.12.aarch64.rpm"
RPM_HASH = "4897504a68955366c06a032a691fe0e4dd562a4a77409f4fc279c6d683f1e72b1ed71fc53b765bb555853410eb1e87ef7374b944d13a7e4876878e300ccedf30"

RPROVIDES:${PN} += "config-libva-vdpau-driver \
libva-vdpau-driver \
vdpau-video"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libvdpau.so.1"

inherit rpm
