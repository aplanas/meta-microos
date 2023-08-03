SUMMARY = "Documentation for texlive-colorframed"
DESCRIPTION = "This package includes the documentation for texlive-colorframed"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9bsvn64551"

RPM_NAME = "texlive-colorframed-doc-2023.209.0.0.9bsvn64551-54.1.noarch.rpm"
RPM_HASH = "0808a9efe89b23392666b92df98eb63fa9d50fc78d502042568fc962eca4a542786ef1af015146fa4c3c6907f61ab85fafa5af5e52435d586915c0f6f8b70d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorframed-doc"

RDEPENDS:${PN} += ""

inherit rpm
