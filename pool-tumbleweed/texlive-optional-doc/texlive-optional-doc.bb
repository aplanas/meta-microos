SUMMARY = "Documentation for texlive-optional"
DESCRIPTION = "This package includes the documentation for texlive-optional"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2bsvn18131"

RPM_NAME = "texlive-optional-doc-2023.209.2.2bsvn18131-55.1.noarch.rpm"
RPM_HASH = "dab56fa6794d64cb859465db92f0af3c3c63092a3e8be39e561506c5b77ed890a78011a124bf4a674f1fe9b11141a942132989160eb571ee8d76e7369df5488f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optional-doc"

RDEPENDS:${PN} += ""

inherit rpm
