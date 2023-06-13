SUMMARY = "Development files for the X11 keyboard file manipulation library"
DESCRIPTION = "libxkbfile is used by the X servers and utilities to parse the XKB \
configuration data files. \
 \
This package contains the development headers for the library found \
in libxkbfile1."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "libxkbfile-devel-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "5b886c514425168cc235599ee6dfc8c5a75f6a21b77d911600f9d5a952f9a4bf1a7080bcbe2ba47b53dee0f0ec7e2768121b0b3f78f14f2bc33b9f982da253a8"

RPROVIDES:${PN} += "libxkbfile-devel \
libxkbfile-devel(aarch-64) \
pkgconfig(xkbfile) \
xorg-x11-libxkbfile-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbfile1 \
pkgconfig(kbproto) \
pkgconfig(x11)"

inherit rpm
