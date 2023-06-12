SUMMARY = "Documentation for texlive-beamerthemelalic"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemelalic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn58777"

RPM_NAME = "texlive-beamerthemelalic-doc-2023.201.1.0svn58777-53.1.noarch.rpm"
RPM_HASH = "0684a63cba17a8d2205f70a1177197ce27f7cb8255c25f7173c077ddb27e682a542161e96519babac02c926ddac74470fa40ac8c48c4b290e002dfc5ca036a46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemelalic-doc"
RDEPENDS:${PN} += ""

inherit rpm
