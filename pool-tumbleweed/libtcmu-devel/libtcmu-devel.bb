SUMMARY = "Development package for libtcmu"
DESCRIPTION = "Development header(s) and lib(s) for developing against libtcmu."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "libtcmu-devel-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "ae959667beee4851e97a75dbd5366f71da57cf9838e5ed6c788eba3a52c6bc5985bceafd352683df09b71ae3d7b28f2224b3e58294b205e0a36363783594f940"

RPROVIDES:${PN} += "libtcmu-devel"

RDEPENDS:${PN} += "libtcmu2 \
tcmu-runner"

inherit rpm
