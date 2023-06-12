SUMMARY = "Development package for libtcmu"
DESCRIPTION = "Development header(s) and lib(s) for developing against libtcmu."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "libtcmu-devel-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "7c009f6bb61608c3f64fc94a72f6fe2fbd08340c302a679fd3707721e3ed128e1ea20d6269ee756f6790d7801e635e40e86bb681c9d41007eac781f702143348"

RPROVIDES:${PN} += "libtcmu-devel \
libtcmu-devel(aarch-64)"
RDEPENDS:${PN} += "libtcmu2 \
tcmu-runner"

inherit rpm
