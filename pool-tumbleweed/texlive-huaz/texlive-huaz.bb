SUMMARY = "Automatic Hungarian definite articles"
DESCRIPTION = "In Hungarian there are two definite articles, 'a' and 'az', \
which are determined by the pronunciation of the subsequent \
word. The definite article is 'az', if the first phoneme of the \
pronounced word is a vowel, otherwise it is 'a'. The huaz \
package helps the user to insert automatically the correct \
definite article for cross-references and other commands \
containing text."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64723"

RPM_NAME = "texlive-huaz-2023.209.1.0svn64723-54.1.noarch.rpm"
RPM_HASH = "4d6516044be530625499bf4a5a5a92cccb28cd82a93966bce6f54d656d75e5265400a2abb5d41b2940f62d1e2c69b01e9c434d39fc91eca217dc43042771e135"
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
