SUMMARY = "Typeset paths, making them breakable"
DESCRIPTION = "Defines a macro \\path|...|, similar to the LaTeX \\verb|...|, \
that sets the text in typewriter font and allows hyphen-less \
breaks at punctuation characters. The set of characters to be \
regarded as punctuation may be changed from the package's \
default."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.05svn22045"

RPM_NAME = "texlive-path-2023.201.3.05svn22045-51.1.noarch.rpm"
RPM_HASH = "0ec841b090a43690d115bb1246774501b78e2abf1cc835ad7d4e7e7b58d049ed5ba885789afb5b923efbb00d19f76069aceef27c05a4ea23347c45b257723227"
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
