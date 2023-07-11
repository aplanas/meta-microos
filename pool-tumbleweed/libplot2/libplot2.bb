SUMMARY = "GNU Plotting Utilities"
DESCRIPTION = "The GNU plotting utilities consist of seven command line programs: the \
graphics programs `graph', `plot', `tek2plot', and `plotfont', and the \
mathematical programs `spline', `ode', and `double'.  GNU `libplot' is \
distributed with these programs; it is the library on which the \
graphics programs are based. `Libplot' is a function library for \
device-independent two-dimensional vector graphics, including vector \
graphics animations under the X Window System."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.6"

RPM_NAME = "libplot2-2.6-29.4.aarch64.rpm"
RPM_HASH = "fe7b4644760f5798ae1b381d78cc5264c0c594a582818715f37eebc84694b7fc20ee5bc6745fffa65c0d8fd49f879c85438cee73539c9d31811cc34d6c3994e9"

RPROVIDES:${PN} += "libplot.so.2 \
libplot2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
