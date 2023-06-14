SUMMARY = "Fortran library for fast updates of QR and Cholesky decompositions"
DESCRIPTION = "qrupdate is a Fortran library for fast updates of QR and Cholesky decompositions"
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "qrupdate-1.1.2-3.31.aarch64.rpm"
RPM_HASH = "a38ab2739db1e5626ff82c410f61b517ee55d9e502795d96ed6b2403b5f537b1f9ea5c0978e77431751ba13e86c30d2f1562a7d6b847edca9d0464f8a5304cbe"

RPROVIDES:${PN} += "qrupdate"

RDEPENDS:${PN} += ""

inherit rpm
