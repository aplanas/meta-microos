SUMMARY = "An overview of the development of TeX"
DESCRIPTION = "The document gives a short overview of TeX and its children, as \
well as the macro packages LaTeX and ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn41403"

RPM_NAME = "texlive-tex-overview-2023.201.0.0.2svn41403-54.1.noarch.rpm"
RPM_HASH = "16bba32a4931b449adbaf592ac3ece1fd6aeed529dfdc2f5aa0d9c8fd452995c32bebc325807bffdfd3441a9057f0cfb9042d061a59f09467e5f41a869e6b2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-overview"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
