SUMMARY = "Build tested documentation"
DESCRIPTION = "This package contains documentation files for python39-manuel."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python39-manuel-doc-1.12.4-4.1.noarch.rpm"
RPM_HASH = "5fa3450bf21eb76cbf4bf9d874d1d1da621f9ea24f15e0ed43d208e847d766236409450e5beca4d451ff7d342a44629f0884fd97286ba48f13af253dc988328b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-manuel-doc"

RDEPENDS:${PN} += ""

inherit rpm
