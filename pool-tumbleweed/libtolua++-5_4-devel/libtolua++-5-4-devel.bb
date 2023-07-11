SUMMARY = "Development headers for tolua++"
DESCRIPTION = "This package provides development headers for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_4-devel-1.0.93-10.3.aarch64.rpm"
RPM_HASH = "f28f665c5ecdf8bc7294ca2b0684fba4f88b9acc8f7a794245f3cbb1bd003806e2bfeba88e8de28812dd5e7ebb51143eee794be02ffe4ac44a0f5505ccb67762"

RPROVIDES:${PN} += "libtolua++-5-4-devel \
pkgconfig-tolua++ \
toluapp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
toluapp-5.4"

inherit rpm
