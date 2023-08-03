SUMMARY = "Documentation for texlive-sffms"
DESCRIPTION = "This package includes the documentation for texlive-sffms"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-sffms-doc-2023.209.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "69cb071bd2cc31bdaa95eb2a8f4006e926f4ea5babdbfd254647250a1c3c389139d3aa2320f83a9a9f66575ad479a78ea3c448b7de55ce41f9508b4ac066e7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sffms-doc"

RDEPENDS:${PN} += ""

inherit rpm
