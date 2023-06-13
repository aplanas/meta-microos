SUMMARY = "Documentation for texlive-sansmathaccent"
DESCRIPTION = "This package includes the documentation for texlive-sansmathaccent"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53628"

RPM_NAME = "texlive-sansmathaccent-doc-2023.201.svn53628-53.1.noarch.rpm"
RPM_HASH = "cb3aab54819df44006e3a6d5a394f0f22b0a7aa1b062c3049cf24c023392ec532e3361c0753f1f95d779a51a362f87922ebefd64d6eb23d21b8ba238c6514faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sansmathaccent-doc"

RDEPENDS:${PN} += ""

inherit rpm
