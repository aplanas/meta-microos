SUMMARY = "Documentation for texlive-plweb"
DESCRIPTION = "This package includes the documentation for texlive-plweb"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn15878"

RPM_NAME = "texlive-plweb-doc-2023.209.3.0svn15878-53.1.noarch.rpm"
RPM_HASH = "37702685bac1e5bb7bd432782ff659efcd1d621dcd3ff36250c077ac34f657543e76b3cf46120d16439d5ad11c476471adb71424f9f85fe88a84ace2d3c7382b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plweb-doc"

RDEPENDS:${PN} += ""

inherit rpm
