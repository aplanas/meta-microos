SUMMARY = "Kernel Documentation (HTML)"
DESCRIPTION = "These are HTML documents built from the current kernel sources. \
 \
Source Timestamp: 2023-06-22 03:53:43 +0000 \
GIT Revision: 0df701dd2c208f4843cf219b4b26b533ada9bd34 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-docs-html-6.3.9-1.1.noarch.rpm"
RPM_HASH = "4d49010b0b85e45b1eea4c5657385bf631d9e4f6549d79507deb3de04d5e49bfe0c7e24445e6b6063a5fdb6bb1e8a89baaed6f74f5616c31fc588ed845119ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
