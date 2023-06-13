SUMMARY = "Documentation for texlive-clearsans"
DESCRIPTION = "This package includes the documentation for texlive-clearsans"
LICENSE = "Apache-1.0"

PV = "2023.201.svn64400"

RPM_NAME = "texlive-clearsans-doc-2023.201.svn64400-53.1.noarch.rpm"
RPM_HASH = "d2a7af0ce523088596a2d9cdad063f5d24fd62dcba4843679eb400abb00acf5ff4807e22521f3b6c3cfd7d767c6ca8a20694ce89b98bfde7ae0347834a3ca7cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clearsans-doc"

RDEPENDS:${PN} += ""

inherit rpm
