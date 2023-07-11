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

RPM_NAME = "plotutils-doc-2.6-29.4.noarch.rpm"
RPM_HASH = "dfecaefed3a5b12df325614bd8dd7b0b6d206de0e8ed4cca8ae5f6453415bee0231a646f8b392d5267196bdfa780110720f06c56f006f29135333a7325a61148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plotutils-/usr/share/doc/packages/plotutils/README \
plotutils-doc"

RDEPENDS:${PN} += "plotutils"

inherit rpm
