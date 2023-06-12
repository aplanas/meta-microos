SUMMARY = "Documentation for texlive-wordcount"
DESCRIPTION = "This package includes the documentation for texlive-wordcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn46165"

RPM_NAME = "texlive-wordcount-doc-2023.201.1.7svn46165-53.1.noarch.rpm"
RPM_HASH = "46f9309f2af7ec3362c945fd4bf05905d6dc744084d37d4f5559684083e8a2b53c7bf167c690d9a1d302cb32cb237f41100549bc4f606c0d0517b6de7a864338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wordcount-doc"
RDEPENDS:${PN} += ""

inherit rpm
