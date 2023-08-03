SUMMARY = "BibLaTeX style for the Ecole nationale des chartes (Paris)"
DESCRIPTION = "This package provides a citation and bibliography style for use \
with BibLaTeX. It conforms to the bibliographic standards used \
at the Ecole nationale des chartes (Paris), and may be suitable \
for a more general use in historical and philological works. \
The package was initially derived from historische-zeitschrift, \
with the necessary modifications."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44627"

RPM_NAME = "texlive-biblatex-enc-2023.209.1.0svn44627-54.1.noarch.rpm"
RPM_HASH = "7b0a8d81edfddb4350921e385793d7156074dd488cec2c49f9b4151144448488c55f965c4be5ff3a8dfb1aa0b14b916d15d5999b71c0d5cb418fee3e0778ed99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enc.bbx \
tex-enc.cbx \
texlive-biblatex-enc"

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
