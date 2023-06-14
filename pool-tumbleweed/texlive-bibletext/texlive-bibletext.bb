SUMMARY = "Insert Bible passages by their reference"
DESCRIPTION = "The package allows to insert Bible texts in a document by \
specifying references."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.2svn45196"

RPM_NAME = "texlive-bibletext-2023.201.0.0.1.2svn45196-53.1.noarch.rpm"
RPM_HASH = "b5425fbf433d4a2f7167aaa8d2f932ff8f54d5c3d47f5b0739e5e81344fa55645915a38b6fb036be60051b7814abb33024c12cf554b0690342adb5b09d25610e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibletext.sty \
texlive-bibletext"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
