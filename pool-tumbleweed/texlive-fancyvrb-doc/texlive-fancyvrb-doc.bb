SUMMARY = "Documentation for texlive-fancyvrb"
DESCRIPTION = "This package includes the documentation for texlive-fancyvrb"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.5asvn65585"

RPM_NAME = "texlive-fancyvrb-doc-2023.209.4.5asvn65585-53.1.noarch.rpm"
RPM_HASH = "cb5845e811253266614b99ef1a96b6e5307a75a1e80af6c4764be176dc8b951396f5a110fa78795aa7f5c59be8f21a5ad594cfb0eb5e9ea60506dcba8cf95c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyvrb-doc"

RDEPENDS:${PN} += ""

inherit rpm
