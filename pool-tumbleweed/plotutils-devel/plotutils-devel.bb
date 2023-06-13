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

RPM_NAME = "plotutils-devel-2.6-29.3.aarch64.rpm"
RPM_HASH = "d923199ea930aa6010ac244a15d2496906364cc51f21e548cc08986a7e07eb163d0875f5978697529ddb1f916d82127ff633e27902bb15e4aad20a74735c5e03"

RPROVIDES:${PN} += "plotutils-devel \
plotutils-devel(aarch-64)"

RDEPENDS:${PN} += "bison \
flex \
fontpackages-devel \
gcc-c++ \
libplot2 \
libplotter2 \
libpng-devel \
libstdc++-devel \
libtool \
libxmi0 \
pkgconfig \
pkgconfig(x11) \
pkgconfig(xaw7) \
pkgconfig(xext) \
pkgconfig(xt) \
plotutils"

inherit rpm
