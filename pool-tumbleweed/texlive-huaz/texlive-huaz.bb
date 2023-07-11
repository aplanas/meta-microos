SUMMARY = "Automatic Hungarian definite articles"
DESCRIPTION = "In Hungarian there are two definite articles, 'a' and 'az', \
which are determined by the pronunciation of the subsequent \
word. The definite article is 'az', if the first phoneme of the \
pronounced word is a vowel, otherwise it is 'a'. The huaz \
package helps the user to insert automatically the correct \
definite article for cross-references and other commands \
containing text."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn64723"

RPM_NAME = "texlive-huaz-2023.208.1.0svn64723-53.1.noarch.rpm"
RPM_HASH = "1560ae45ad63dcbc3c228293c488fdf8ab2fbb38b276fb12197be5cd8887d68bdb289a40986b1f9b931e021ec0f6b2edb1b07781ea3893b204a109cc06b4dcf8"
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
