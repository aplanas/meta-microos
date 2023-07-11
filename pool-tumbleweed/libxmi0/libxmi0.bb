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

RPM_NAME = "libxmi0-2.6-29.4.aarch64.rpm"
RPM_HASH = "3c1cb278f88cbe50e38851e5abd4c1333099f57ec62769ec65823ce74af8a6ad73ca3c957ca7341b4460c5c968520f3d75aa46aa3e0c371f5ea4719c77c6f383"

RPROVIDES:${PN} += "libxmi.so.0 \
libxmi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
