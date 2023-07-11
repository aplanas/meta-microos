SUMMARY = "Development package for libtcmu"
DESCRIPTION = "Development header(s) and lib(s) for developing against libtcmu."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "libtcmu-devel-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "07d48a26a6f288c2ba3d7fc87fbdc5f9734497603bae49c16063fb5f49301d7b5384aedd49b8ab91911e5cab4e1de8e1733a834f4b90952610e7ec0d4a9145d1"

RPROVIDES:${PN} += "libtcmu-devel"

RDEPENDS:${PN} += "libtcmu2 \
tcmu-runner"

inherit rpm
