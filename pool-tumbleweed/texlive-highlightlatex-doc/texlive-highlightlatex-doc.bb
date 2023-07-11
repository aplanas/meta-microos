SUMMARY = "Documentation for texlive-highlightlatex"
DESCRIPTION = "This package includes the documentation for texlive-highlightlatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58392"

RPM_NAME = "texlive-highlightlatex-doc-2023.201.svn58392-53.2.noarch.rpm"
RPM_HASH = "01681f1f160af457ba82189a32cb653193ae4a9daac6c355f4ef38316ecb253c986cfc76d76eb298f1e61918dd1ab669f5fec5b324dabea34fa61b85a5ea9c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-highlightlatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
