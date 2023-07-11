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

RPM_NAME = "plotutils-devel-2.6-29.4.aarch64.rpm"
RPM_HASH = "4db84d6e7b1c71a362103c3235922b1e926614c72304d533859c92203415b8a0673dbfc20a0999f4f9de28b30c8278910cc93de4442f9666fbff04a46860f588"

RPROVIDES:${PN} += "plotutils-devel"

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
pkgconfig-x11 \
pkgconfig-xaw7 \
pkgconfig-xext \
pkgconfig-xt \
plotutils"

inherit rpm
