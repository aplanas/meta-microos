SUMMARY = "Modification of inputenc for German"
DESCRIPTION = "If the inputenc is used and German umlauts are input directly, \
they are converted to the LICR representation \\'a (etc.). This \
breaks the sort algorithm of makeindex, for instance. Ginpenc \
converts umlauts and the sharp-s to the short forms defined by \
babel, e.g., 'a instead, if the text is typeset in German."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24980"

RPM_NAME = "texlive-ginpenc-2023.209.1.0svn24980-53.1.noarch.rpm"
RPM_HASH = "0f2798942d314c7ed5b9367c2cead4c65a23f33e5192c9b1ef1c5df20cfd8f70cdca34e368c1ad0e40827eb4f960a30e67a31954410f102bb3bddd7958d334fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ginpenc.sty \
texlive-ginpenc"

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
