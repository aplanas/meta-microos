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

RPM_NAME = "libplotter2-2.6-29.3.aarch64.rpm"
RPM_HASH = "799fa9674e76d708dec99cdd41cd43fcd2de1105af7af26dd7c74baa50844a418381cc8b10eb746d4b6428f31c3bc1998894aacafe116655c2f485f04d6af704"

RPROVIDES:${PN} += "libplotter.so.2 \
libplotter2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXt.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
