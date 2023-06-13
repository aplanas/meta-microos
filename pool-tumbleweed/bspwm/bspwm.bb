SUMMARY = "A tiling window manager based on binary space partitioning"
DESCRIPTION = "A tiling window manager based on binary space partitioning. \
* It only responds to X events, and the messages it receives on a dedicated socket. \
* bspc is a program that writes messages on bspwm's socket. \
* bspwm doesn't handle any keyboard or pointer inputs: a third party program (e.g. \
sxhkd) is needed in order to translate keyboard and pointer events to bspc invocations."
LICENSE = "BSD-2-Clause"

PV = "0.9.10"

RPM_NAME = "bspwm-0.9.10-1.11.aarch64.rpm"
RPM_HASH = "54962d315ecac9957f49b132c3769661f5b7ed1ebe15fd945dfc432a0549f8ee766587e31ff87a0f39fa1f0ab40dde3cbc23dfad74b014a7ba22dc3f362e085f"

RPROVIDES:${PN} += "bspwm \
bspwm(aarch-64) \
config(bspwm)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libxcb-ewmh.so.2()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb-keysyms.so.1()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-shape.so.0()(64bit) \
libxcb-util.so.1()(64bit) \
libxcb-xinerama.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
