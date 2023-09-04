SUMMARY = "Documentation files for olm"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Documentation files for olm"
LICENSE = "Apache-2.0"

PV = "3.2.15"

RPM_NAME = "olm-doc-3.2.15-1.1.noarch.rpm"
RPM_HASH = "6d5daf1f9c093ee0ebdbc62f0316282964b1e88d76520e56da43af98772c4adb23e50d7c1314152734af3dd8e9da8c2e17a8fe6760f1678c5cad8b206a205628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "olm-doc"

RDEPENDS:${PN} += ""

inherit rpm
