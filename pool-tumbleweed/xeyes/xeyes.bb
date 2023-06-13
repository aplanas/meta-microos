SUMMARY = "A follow the mouse X demo"
DESCRIPTION = "Xeyes watches what you do and reports to the Boss."
LICENSE = "X11"

PV = "1.2.0"

RPM_NAME = "xeyes-1.2.0-2.2.aarch64.rpm"
RPM_HASH = "f94ffa408c1f7d8a5bae9b2fd74bdbaeadbd26a867f8e4f859900b14f9ee7b57601dc5e34bc0a2cf3319cab4970797b2372f1cf3685cbe48bf08fc9587667f3c"

RPROVIDES:${PN} += "xeyes \
xeyes(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXi.so.6()(64bit) \
libXmu.so.6()(64bit) \
libXrender.so.1()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libxcb-damage.so.0()(64bit) \
libxcb-present.so.0()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
