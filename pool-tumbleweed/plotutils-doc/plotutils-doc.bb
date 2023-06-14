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

RPM_NAME = "plotutils-doc-2.6-29.3.noarch.rpm"
RPM_HASH = "bcff016931ac67d3926564bea2687e4c330e65e0ef3fdefb02eff9aac65bdcbe776c5537e598f2ae179960083af11145c8db67b4a4defc417f95c23b9cd7388b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plotutils-/usr/share/doc/packages/plotutils/README \
plotutils-doc"

RDEPENDS:${PN} += "plotutils"

inherit rpm
