SUMMARY = "Examples for the GNU Scientific Library"
DESCRIPTION = "This package contains examples for GSL"
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-examples-2.7.1-1.3.noarch.rpm"
RPM_HASH = "750a6a9fad15158c5d698be39eb3cbc3217418a8538c0aa35fe7cdcbcf14d0070d19b7829a3b7665dc215241bb8b1e6122482898c0eff983c29799c1cf3bbae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-examples"

RDEPENDS:${PN} += ""

inherit rpm
