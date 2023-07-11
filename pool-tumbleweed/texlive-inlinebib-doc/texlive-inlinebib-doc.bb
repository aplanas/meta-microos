SUMMARY = "Documentation for texlive-inlinebib"
DESCRIPTION = "This package includes the documentation for texlive-inlinebib"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn22018"

RPM_NAME = "texlive-inlinebib-doc-2023.208.svn22018-53.1.noarch.rpm"
RPM_HASH = "7d877efdce4a64dd93e8ef8131b82bded3cc0c31bcfd2a6a70a5480e03ed33c09ab3c259e81f1889dffeff45cbe7275ed1ad5356323e21e669ec0515995d5150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinebib-doc"

RDEPENDS:${PN} += ""

inherit rpm
