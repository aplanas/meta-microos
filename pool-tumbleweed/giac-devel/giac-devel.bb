SUMMARY = "Development files for giac"
DESCRIPTION = "This package contains header files and libraries needed to develop \
application that use the GIAC computer algebra system."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "giac-devel-1.9.0.27-4.6.aarch64.rpm"
RPM_HASH = "0e77994d5212305e84dc7b9ee2cd3d68cd43c2194e1387b7c1c411689a3f5816a34a650284b129a4b34cf938d89046509f851268d3c7e91fd6a3f361556ae23e"

RPROVIDES:${PN} += "giac-devel"

RDEPENDS:${PN} += "fltk-devel \
libgiac0 \
mpfi-devel \
mpfr-devel \
ntl-devel \
pkgconfig-gsl"

inherit rpm
