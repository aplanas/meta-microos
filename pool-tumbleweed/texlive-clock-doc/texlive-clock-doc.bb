SUMMARY = "Documentation for texlive-clock"
DESCRIPTION = "This package includes the documentation for texlive-clock"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-clock-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "3fad4f9e304452079fda8dcb6ee05e1a6b58739000a26b8d3d2733215bc7c66bb3a6c78e0db01bed810fed95e1bf40dc20248f91d8d0a32432418b9fd13c4a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clock-doc"
RDEPENDS:${PN} += ""

inherit rpm
