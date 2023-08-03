SUMMARY = "Create tabular cells spanning multiple rows"
DESCRIPTION = "The package has a lot of flexibility, including an option for \
specifying an entry at the 'natural' width of its text. The \
package is distributed with the bigdelim and bigstrut packages, \
which can be used to advantage with \\multirow cells."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.8svn58396"

RPM_NAME = "texlive-multirow-2023.209.2.8svn58396-55.1.noarch.rpm"
RPM_HASH = "4c6f27c765b897452a00bab4c33c6d5564985da4f40298b6fbd13c250399bd26fdc1b22907659bd64a9e363415dce3663cc971824dd64aa16f7a1103649adf53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bigdelim.sty \
tex-bigstrut.sty \
tex-multirow.sty \
texlive-multirow"

RDEPENDS:${PN} += "/usr/bin/sh \
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
