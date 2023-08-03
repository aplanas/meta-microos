SUMMARY = "Documentation for texlive-booklet"
DESCRIPTION = "This package includes the documentation for texlive-booklet"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7bsvn15878"

RPM_NAME = "texlive-booklet-doc-2023.209.0.0.7bsvn15878-53.1.noarch.rpm"
RPM_HASH = "227d1195d28574a31d46b99a068c6a992e85d34353ca23bc14b2cc3d304d68a654fdb6ffd0deee4d034615bb5d1ff9dc530d8d87daaee393e66c1c8e928eed23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-booklet-doc"

RDEPENDS:${PN} += ""

inherit rpm
