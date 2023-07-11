SUMMARY = "Examples for jzlib"
DESCRIPTION = "Examples for jzlib."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "jzlib-demo-1.1.3-5.7.noarch.rpm"
RPM_HASH = "d6089a7323bb021e5d1e64d488a6ec004cc84c5e03f60071e65ec0f24809cb94a4552b90b49e2ebe329f26d7e5384625d4f1f28ab33e63db757befd80036e591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jzlib-demo"

RDEPENDS:${PN} += "jzlib"

inherit rpm
