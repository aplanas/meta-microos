SUMMARY = "A follow the mouse X demo"
DESCRIPTION = "Xeyes watches what you do and reports to the Boss."
LICENSE = "X11"

PV = "1.2.0"

RPM_NAME = "xeyes-1.2.0-2.2.aarch64.rpm"
RPM_HASH = "f94ffa408c1f7d8a5bae9b2fd74bdbaeadbd26a867f8e4f859900b14f9ee7b57601dc5e34bc0a2cf3319cab4970797b2372f1cf3685cbe48bf08fc9587667f3c"

RPROVIDES:${PN} += "xeyes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXmu.so.6 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libxcb-damage.so.0 \
libxcb-present.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
