SUMMARY = "A Polish version of 'lorem ipsum...' in the form of a LaTeX package"
DESCRIPTION = "This is a polish version of the classic pseudo-Latin 'lorem \
ipsum dolor sit amet...'. It provides access to several \
paragraphs of pseudo-Polish generated with Hidden Markov Models \
and Recurrent Neural Networks trained on a corpus of Polish."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44371"

RPM_NAME = "texlive-bredzenie-2023.209.1.0svn44371-53.1.noarch.rpm"
RPM_HASH = "6014d107f9ab3e7a0d9311f47b190cbd676e998db498a2915ec6ee285ee59be97b599876218af8d1e9bd3fd0df3bad8a16c1e7cbd06e34444ffd7711d70cdd39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bredzenie.sty \
texlive-bredzenie"

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
