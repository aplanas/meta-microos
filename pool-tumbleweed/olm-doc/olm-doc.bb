SUMMARY = "Documentation files for olm"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Documentation files for olm"
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "olm-doc-3.2.14-1.6.noarch.rpm"
RPM_HASH = "62a9ac1c2a6b50ef24fc8dc457b573c7f99f2003e197a7dcca88b633c3e0ae7bf4663e8a5a702cf66a4e9fbde78ad112a06dd7ce1ab6d75440ef77f974850113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "olm-doc"

RDEPENDS:${PN} += ""

inherit rpm
