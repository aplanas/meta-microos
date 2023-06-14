SUMMARY = "Development files for giac"
DESCRIPTION = "This package contains header files and libraries needed to develop \
application that use the GIAC computer algebra system."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "giac-devel-1.9.0.27-4.5.aarch64.rpm"
RPM_HASH = "48b534afb8213a5aa37158d4b1374401a6c3e2332172d6a406f2e230dccb06ab9e239dcbe571d027c67efc6b4f86a378bed123916481f651d3befa97b6cf2bd9"

RPROVIDES:${PN} += "giac-devel"

RDEPENDS:${PN} += "fltk-devel \
libgiac0 \
mpfi-devel \
mpfr-devel \
ntl-devel \
pkgconfig-gsl"

inherit rpm
