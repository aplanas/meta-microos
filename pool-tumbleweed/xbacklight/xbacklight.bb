SUMMARY = "Utility to adjust the screen backlight brightness"
DESCRIPTION = "Xbacklight is used to adjust the backlight brightness where supported. \
It uses the RandR extension to find all outputs on the X server \
supporting backlight brightness control and changes them all in the \
same way."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "xbacklight-1.2.3-2.3.aarch64.rpm"
RPM_HASH = "03663eace9d771cd32b4db2d8b0d29f9f8c8d406506dcbcbef301d533a07b3d458a1fcdd52dfac899a7f8a0dfaf7e6b80d0a647d9aa92c9adea367192aa788ae"

RPROVIDES:${PN} += "xbacklight"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
