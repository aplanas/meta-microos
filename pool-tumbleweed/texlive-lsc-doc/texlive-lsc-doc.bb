SUMMARY = "Documentation for texlive-lsc"
DESCRIPTION = "This package includes the documentation for texlive-lsc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-lsc-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "d77fbd582ec44bea81ebc91e771ffe039df1f6f21b9f9361e26b0d96c26edbe4b59187e0a3674fae00918bfd02cf40195ccba3195ab563037c7cbdcaa12a7d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lsc-doc"

RDEPENDS:${PN} += ""

inherit rpm
