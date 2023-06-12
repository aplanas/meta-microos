SUMMARY = "Documentation for texlive-smflatex"
DESCRIPTION = "This package includes the documentation for texlive-smflatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn58910"

RPM_NAME = "texlive-smflatex-doc-2023.201.1.6svn58910-57.1.noarch.rpm"
RPM_HASH = "381a31f4af2dc57b97b3e4f1f418c280c86df390c19bf93c4bd0fa391b08401f4881dcc4b1f852512823b017e3462644941503768a8844bbcd0ac3b5d03a9a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-smflatex-doc:fr) \
texlive-smflatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
