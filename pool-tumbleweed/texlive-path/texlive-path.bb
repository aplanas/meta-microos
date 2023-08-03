SUMMARY = "Typeset paths, making them breakable"
DESCRIPTION = "Defines a macro \\path|...|, similar to the LaTeX \\verb|...|, \
that sets the text in typewriter font and allows hyphen-less \
breaks at punctuation characters. The set of characters to be \
regarded as punctuation may be changed from the package's \
default."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.05svn22045"

RPM_NAME = "texlive-path-2023.209.3.05svn22045-52.1.noarch.rpm"
RPM_HASH = "b1c1512a1578833311ccade02aad1d33199d18ddbc2f6123bf01b5be337024f0c4ee4376e4bdb98e1462b5bceccb5774fa112f79f195950534b1fa4222d8926d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-path.sty \
texlive-path"

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
