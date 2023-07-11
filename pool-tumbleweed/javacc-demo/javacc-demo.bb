SUMMARY = "Examples for javacc"
DESCRIPTION = "Examples for javacc."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "javacc-demo-7.0.11-1.6.noarch.rpm"
RPM_HASH = "207eac7d8e3ce9d30c7d1fc72efd60aa89ee4e138f3f5edb26825d3bb538e2d5277adbef257e504be42889a2ba4bdd6e5abbada39a13ce1224c95f6c125cefd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-demo"

RDEPENDS:${PN} += "javacc"

inherit rpm
