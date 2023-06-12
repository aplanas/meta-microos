SUMMARY = "Documentation for texlive-plates"
DESCRIPTION = "This package includes the documentation for texlive-plates"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-plates-doc-2023.201.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "2662f6cdd9c3fd4e64edd4de4cb4bea44fd8a920d474fe2373d8144a9aac1f4a3c0d0b83d6571d65ba6f55db0542f0932c600ffa8a63c07c99a27d0ffd6330e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plates-doc"
RDEPENDS:${PN} += ""

inherit rpm
