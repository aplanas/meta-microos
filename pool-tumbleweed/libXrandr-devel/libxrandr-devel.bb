SUMMARY = "Development files for the X Resize-Rotate-Reflection library"
DESCRIPTION = "The X Resize, Rotate and Reflect Extension (RandR) allows clients to \
dynamically change X screens, so as to resize, to change the \
orientation and layout of the root window of a screen. \
 \
This package contains the development headers for the library found \
in libXrandr2."
LICENSE = "MIT"

PV = "1.5.3"

RPM_NAME = "libXrandr-devel-1.5.3-1.2.aarch64.rpm"
RPM_HASH = "24beabe394cf932d75d8937eab864daa3d3316a7c1faeed92d0f98e2a010834a87b2066294592fea389347fdcecd3852c6ad1591b1d20edb31447dee50bed440"

RPROVIDES:${PN} += "libXrandr-devel \
libXrandr-devel(aarch-64) \
pkgconfig(xrandr)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXrandr2 \
pkgconfig(randrproto) \
pkgconfig(x11) \
pkgconfig(xext) \
pkgconfig(xproto) \
pkgconfig(xrender)"

inherit rpm
