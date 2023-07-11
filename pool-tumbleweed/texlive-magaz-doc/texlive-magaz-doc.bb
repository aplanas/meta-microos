SUMMARY = "Documentation for texlive-magaz"
DESCRIPTION = "This package includes the documentation for texlive-magaz"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4svn24694"

RPM_NAME = "texlive-magaz-doc-2023.208.0.0.4svn24694-53.1.noarch.rpm"
RPM_HASH = "f7c3bcde5f4a896760e95d8f385bf93d6b0854a4b1d93774e2e2f794b4b9445dd1e384c95995f27ee735d42796128c3af0e5c4a610f87d1de3a96124cead0ca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-magaz-doc"

RDEPENDS:${PN} += ""

inherit rpm
