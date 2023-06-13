SUMMARY = "Documentation for texlive-mathastext"
DESCRIPTION = "This package includes the documentation for texlive-mathastext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3ysvn64930"

RPM_NAME = "texlive-mathastext-doc-2023.201.1.3ysvn64930-52.1.noarch.rpm"
RPM_HASH = "f7c9bcf5f9a1ded9e17e50eedc1ebe5eb3dfe708726c5facac4339f345be5ce0cfe7e5a0dd6615c46ab626324a53d470bd4b9bbd630132a879cececced0e9221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathastext-doc"

RDEPENDS:${PN} += ""

inherit rpm
