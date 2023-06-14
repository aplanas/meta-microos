SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64le-gcc7-icecream-backend-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "c47c1946f288462b2b48ee18d195e09212e7f0665369688a5ccad0dbdf657ad0035ac8a4bf3377c7fe35716390a24e7fa2d6f352d631eeb504f652a52dedab15"

RPROVIDES:${PN} += "cross-ppc64le-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
