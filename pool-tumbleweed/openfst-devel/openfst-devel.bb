SUMMARY = "Development files for OpenFST"
DESCRIPTION = "OpenFST is a library for constructing, combining, optimizing and \
searching weighted finite-state transducers (FSTs)."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "openfst-devel-1.8.2-1.2.aarch64.rpm"
RPM_HASH = "7ae1ed3521cd5237dcacf3263adc4783dd60622d17f114c6b39d7cad609462e6af95a62842ee3482fbb9ec884fff300905377efbacfb9b2c3b009c146dbe3ac1"

RPROVIDES:${PN} += "openfst-devel"

RDEPENDS:${PN} += "libfst25"

inherit rpm
