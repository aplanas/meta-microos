SUMMARY = "Documentation for texlive-frankenstein"
DESCRIPTION = "This package includes the documentation for texlive-frankenstein"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-frankenstein-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "a250e2d5f17c2cd472e43d6f21745e8ae858885801c252bda36e144d1ff87930bccffa4c9243a11d2613152abec2034a985d4fd785682a179193da664e8514e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frankenstein-doc"

RDEPENDS:${PN} += ""

inherit rpm
