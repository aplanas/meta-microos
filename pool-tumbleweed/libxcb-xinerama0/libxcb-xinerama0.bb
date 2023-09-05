SUMMARY = "X11 Xinerama Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xinerama is an extension to the X Window System which enables \
multi-headed X applications and window managers to use two or more \
physical displays as one large virtual display."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-xinerama0-1.16-1.1.aarch64.rpm"
RPM_HASH = "51912a8a7c48c2be41c5d774f209532415277f74dc0aecf82878ba6247f84b04979065066cb3678f2185ff35fd0bf08b977fc62b4fe2103f6c4d5498d75991dc"

RPROVIDES:${PN} += "libxcb-xinerama.so.0 \
libxcb-xinerama0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
