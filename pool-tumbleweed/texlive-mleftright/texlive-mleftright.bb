SUMMARY = "Variants of delimiters that act as maths open/close"
DESCRIPTION = "The package defines variants \\mleft and \\mright of \\left and \
\\right, that make the delimiters act as \\mathopen and \
\\mathclose. These commands address spacing difficulties in \
subformulas."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn53021"

RPM_NAME = "texlive-mleftright-2023.209.1.2svn53021-55.1.noarch.rpm"
RPM_HASH = "543371cde98066c086a94fe27167571c487a87d64849693907c0382b3c4fd5b7d83fe148464bfa80441feee830786b428fecacc9be4635dc20a0b048cb9add9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mleftright.sty \
texlive-mleftright"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
