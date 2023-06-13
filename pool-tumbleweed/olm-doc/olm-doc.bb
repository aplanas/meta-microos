SUMMARY = "Documentation files for olm"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Documentation files for olm"
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "olm-doc-3.2.14-1.5.noarch.rpm"
RPM_HASH = "ceb2503ae14e5cd23467aae90c75bf1870bed6e1fb0da57a47e8100fd3d58f8831cfdf89ed1e92aaa1ae2828752e032513574e807d695c0300522c3f1c5b6e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "olm-doc"

RDEPENDS:${PN} += ""

inherit rpm
