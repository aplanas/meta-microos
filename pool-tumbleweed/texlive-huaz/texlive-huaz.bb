SUMMARY = "Automatic Hungarian definite articles"
DESCRIPTION = "In Hungarian there are two definite articles, 'a' and 'az', \
which are determined by the pronunciation of the subsequent \
word. The definite article is 'az', if the first phoneme of the \
pronounced word is a vowel, otherwise it is 'a'. The huaz \
package helps the user to insert automatically the correct \
definite article for cross-references and other commands \
containing text."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64723"

RPM_NAME = "texlive-huaz-2023.201.1.0svn64723-52.1.noarch.rpm"
RPM_HASH = "2f3166f039e97752452e59f7f0c5dbb8fb3cc919061efa046c5cee2441dfea800b7eca83660efbe1b0c4bc55d3f108cfa220dbb2c47f2a024c94c46060c9e3f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-huaz.sty \
texlive-huaz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-refcount.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
