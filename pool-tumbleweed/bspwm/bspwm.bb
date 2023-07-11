SUMMARY = "A tiling window manager based on binary space partitioning"
DESCRIPTION = "A tiling window manager based on binary space partitioning. \
* It only responds to X events, and the messages it receives on a dedicated socket. \
* bspc is a program that writes messages on bspwm's socket. \
* bspwm doesn't handle any keyboard or pointer inputs: a third party program (e.g. \
sxhkd) is needed in order to translate keyboard and pointer events to bspc invocations."
LICENSE = "BSD-2-Clause"

PV = "0.9.10"

RPM_NAME = "bspwm-0.9.10-1.12.aarch64.rpm"
RPM_HASH = "59ca1092b1feba34a77f5076e422410bb316cd4687ebb86f4003ffd13bcbcfb7a37bcefa8dd8c9c9c7e4818f2226fbe7aec3f56192b70fe5d01b148a5ffccd9b"

RPROVIDES:${PN} += "bspwm \
config-bspwm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-ewmh.so.2 \
libxcb-icccm.so.4 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-shape.so.0 \
libxcb-util.so.1 \
libxcb-xinerama.so.0 \
libxcb.so.1"

inherit rpm
