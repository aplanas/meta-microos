SUMMARY = "Typeset chemical names, formulae, etcetera"
DESCRIPTION = "The package provides support for typesetting simple chemical \
formulae, those long IUPAC compound names, and some chemical \
idioms. It also supports the labelling of compounds and \
reference to labelled compounds."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn45120"

RPM_NAME = "texlive-bpchem-2023.209.1.1svn45120-53.1.noarch.rpm"
RPM_HASH = "dd95fbfa6d854fe2666833bba07c2a2949a9a5b6fb1441fc4a785eb97cc19769f239d865e75b8283dd5a886af46f027e3b02cc8dde7bd6ebf4cf253379c100ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bpchem.sty \
texlive-bpchem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lgrenc.def \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
