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

RPM_NAME = "libt3window-devel-0.4.1-1.5.aarch64.rpm"
RPM_HASH = "c377221e6f1e11a92870a6ae37376e7d811a9dd50b54010820107986b1bf16d975e2546b03956dbae36d0db53e77b2031d0d2615ac5b50e4e1922966921897f5"

RPROVIDES:${PN} += "libt3window-devel \
libt3window-devel(aarch-64) \
pkgconfig(libt3window)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libt3window0 \
pkgconfig(libtranscript) \
pkgconfig(tinfo)"

inherit rpm
