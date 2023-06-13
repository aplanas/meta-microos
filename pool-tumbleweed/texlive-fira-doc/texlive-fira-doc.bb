SUMMARY = "Documentation for texlive-fira"
DESCRIPTION = "This package includes the documentation for texlive-fira"
LICENSE = "OFL-1.1"

PV = "2023.201.4.3svn64422"

RPM_NAME = "texlive-fira-doc-2023.201.4.3svn64422-52.1.noarch.rpm"
RPM_HASH = "feac89b58f9043f4760806ef28b1437ec22823d197fad7b909ec6f8105aef14ff83d259f91d0f84d35a334eb217dc7dd85a0ce65eff52e3b511fae744d8d3213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fira-doc"

RDEPENDS:${PN} += ""

inherit rpm
