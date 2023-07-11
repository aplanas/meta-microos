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

RPM_NAME = "plotutils-2.6-29.4.aarch64.rpm"
RPM_HASH = "68ad73bdac8b79bc2de61e8d07dbf6ce494998a11ebe506130e503ce2c384c481252410d8166e0effacfbaf281981e5a17c934b8baf6bc43d87d54ca84567ed3"

RPROVIDES:${PN} += "plotutils"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libplot.so.2 \
libstdc++.so.6 \
perl"

inherit rpm
