SUMMARY = "Documentation for texlive-gu"
DESCRIPTION = "This package includes the documentation for texlive-gu"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-gu-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "6831f78857018565828c62d8758d71517059cbbb66c9f81ea8b24d0e58003e49e740bb895a8383e76067869a46ec98eeb40f72fc94689d5c6a66431e89a81812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-gu-doc:de) \
texlive-gu-doc"
RDEPENDS:${PN} += ""

inherit rpm
