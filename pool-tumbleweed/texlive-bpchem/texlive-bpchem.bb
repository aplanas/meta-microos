SUMMARY = "Typeset chemical names, formulae, etcetera"
DESCRIPTION = "The package provides support for typesetting simple chemical \
formulae, those long IUPAC compound names, and some chemical \
idioms. It also supports the labelling of compounds and \
reference to labelled compounds."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn45120"

RPM_NAME = "texlive-bpchem-2023.201.1.1svn45120-52.1.noarch.rpm"
RPM_HASH = "be08ec5dc59ac3bd963844ec7e4eb255ec233b394d836f6a7939dd9d556c97ad98b5ba32b61b5da23485be8059587d5ac0e99e58cb0b98726319f684c5a5a80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bpchem.sty) \
texlive-bpchem"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(lgrenc.def) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
