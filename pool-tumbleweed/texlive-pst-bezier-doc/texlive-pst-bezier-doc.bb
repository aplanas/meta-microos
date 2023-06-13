SUMMARY = "Documentation for texlive-pst-bezier"
DESCRIPTION = "This package includes the documentation for texlive-pst-bezier"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn41981"

RPM_NAME = "texlive-pst-bezier-doc-2023.201.0.0.03svn41981-52.1.noarch.rpm"
RPM_HASH = "9d400a886834ea1719923c6aa2f65d494137f0b49bf8d826678f91ba466404e8c4784f01287ebf596f5e6772eea9871b0cb794920b7077cc2bd1e54dc5db0d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-bezier-doc"

RDEPENDS:${PN} += ""

inherit rpm
