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

RPM_NAME = "plotutils-2.6-29.3.aarch64.rpm"
RPM_HASH = "28c120eba148fdb74810f0ac7fbb92587e521782cfdb83a0ae99342f715baaa67bd930759f66deda497f46f2d9dbb8bb7349980a64f2c8600a01ba59b7498d1c"

RPROVIDES:${PN} += "plotutils \
plotutils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libplot.so.2()(64bit) \
libstdc++.so.6()(64bit) \
perl"

inherit rpm
