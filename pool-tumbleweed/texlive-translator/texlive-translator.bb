SUMMARY = "Easy translation of strings in LaTeX"
DESCRIPTION = "This LaTeX package provides a flexible mechanism for \
translating individual words into different languages. For \
example, it can be used to translate a word like 'figure' into, \
say, the German word 'Abbildung'. Such a translation mechanism \
is useful when the author of some package would like to \
localize the package such that texts are correctly translated \
into the language preferred by the user. This package is not \
intended to be used to automatically translate more than a few \
words."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12dsvn59412"

RPM_NAME = "texlive-translator-2023.209.1.12dsvn59412-53.1.noarch.rpm"
RPM_HASH = "874cc726e27dfd92e6d46dabb9ecb1f19ed2a86ac62eecc7ee48dd01f9eba72bb4161d1544727c062e7a4e21b66d3cc317daa4adfe5b365a8429d1fac219fe94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-translator.sty \
texlive-translator"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
