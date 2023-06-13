SUMMARY = "Documentation for texlive-scholax"
DESCRIPTION = "This package includes the documentation for texlive-scholax"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.033svn61836"

RPM_NAME = "texlive-scholax-doc-2023.201.1.033svn61836-53.1.noarch.rpm"
RPM_HASH = "44f71c6f78d28077711df67d45781df9d5b8bf1a7d99e8f34ea9d87f17796bf879259004a4d3b56f23a3d7c0f32a5b95d41ad64d91d6619c2b0a1d622d4232b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scholax-doc"

RDEPENDS:${PN} += ""

inherit rpm
