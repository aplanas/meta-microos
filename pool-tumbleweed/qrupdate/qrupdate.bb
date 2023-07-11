SUMMARY = "Fortran library for fast updates of QR and Cholesky decompositions"
DESCRIPTION = "qrupdate is a Fortran library for fast updates of QR and Cholesky decompositions"
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "qrupdate-1.1.2-3.32.aarch64.rpm"
RPM_HASH = "00ce21986823235d6c4deb833ecdc5be5f73dae8fd77143757bee5fbd44518054b6a9c6d3852d79b3abbaf0303022de792c3c8313db0d918e59d36ec7f3e6628"

RPROVIDES:${PN} += "qrupdate"

RDEPENDS:${PN} += ""

inherit rpm
