SUMMARY = "Improved citation handling in LaTeX"
DESCRIPTION = "The package supports compressed, sorted lists of numerical \
citations, and also deals with various punctuation and other \
issues of representation, including comprehensive management of \
break points. The package is compatible with both hyperref and \
backref. The package is (unsurprisingly) part of the cite \
bundle of the author's citation-related packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.5svn36428"

RPM_NAME = "texlive-cite-2023.201.5.5svn36428-53.1.noarch.rpm"
RPM_HASH = "7b94f093fc07d463de2313e7e6a0db1be181dba62f370b71669cb515ecf2b2ac2a574b40640329d0b849709792043b22e6d2f0802f230667e64d944eed064d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chapterbib.sty \
tex-cite.sty \
tex-drftcite.sty \
tex-overcite.sty \
texlive-cite"

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
