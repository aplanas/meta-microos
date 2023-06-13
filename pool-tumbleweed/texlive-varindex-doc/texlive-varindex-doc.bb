SUMMARY = "Documentation for texlive-varindex"
DESCRIPTION = "This package includes the documentation for texlive-varindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn32262"

RPM_NAME = "texlive-varindex-doc-2023.201.2.3svn32262-53.1.noarch.rpm"
RPM_HASH = "4fdf4ddb13f91c9790c17f47df6444bbb33ebc4b4f451902b68f9f7972f88103ff9ad780c5795a794dd65abf56268eb1ffe5bcfd19039992b2e259a067d4ea45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
