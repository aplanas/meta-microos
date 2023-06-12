SUMMARY = "oslo.privsep documentation"
DESCRIPTION = "Documentation for oslo.privsep"
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "python-oslo.privsep-doc-3.0.1-1.3.noarch.rpm"
RPM_HASH = "06e89e11e040f158e949bbe4a519f1c17d86462da2031a078692a395f8b5b5dc6f2e2f4472a2bc950a4a94d247531802e74fcbb7720192b7977336a4f552e5cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.privsep-doc"
RDEPENDS:${PN} += ""

inherit rpm
