SUMMARY = "Documentation for texlive-orkhun"
DESCRIPTION = "This package includes the documentation for texlive-orkhun"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-orkhun-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "b99e6bbcb3a2a2eed28ef1bc8d64d37ae7a3483b7805e90c8978f469917315ffe3dd48501697114a4ecda044a42d26fb09ccfd21cadbedfe3e1ced42f57e4a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-orkhun-doc"

RDEPENDS:${PN} += ""

inherit rpm
