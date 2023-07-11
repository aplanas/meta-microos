SUMMARY = "Development files for libt3window, a library for window-based terminal drawing"
DESCRIPTION = "libt3window library provides functions for manipulating the terminal \
and for creating (possibly overlapping) windows on a terminal. \
libt3window can be used instead of (n)curses for drawing on the \
terminal. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3window."
LICENSE = "GPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "libt3window-devel-0.4.1-1.6.aarch64.rpm"
RPM_HASH = "540c5436194e09cc04bf354852aa5fdf96a11a83853e9c9a6e7dc33603c93a15738a8ac33c912896ae916fdc641df853bc8636fac1643cf08e8196f80f376915"

RPROVIDES:${PN} += "libt3window-devel \
pkgconfig-libt3window"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libt3window0 \
pkgconfig-libtranscript \
pkgconfig-tinfo"

inherit rpm
