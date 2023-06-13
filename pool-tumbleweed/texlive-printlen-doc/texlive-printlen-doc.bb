SUMMARY = "Documentation for texlive-printlen"
DESCRIPTION = "This package includes the documentation for texlive-printlen"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn19847"

RPM_NAME = "texlive-printlen-doc-2023.201.1.1asvn19847-52.1.noarch.rpm"
RPM_HASH = "d7272b3a7df2d414a50f2548cb5bc15ecc4d01d9362737e9f86d062f3e303d5d1249085a4e2e4f3160f7628c2f0e333ba90343b83e4da4d87a7853f08f657e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-printlen-doc"

RDEPENDS:${PN} += ""

inherit rpm
