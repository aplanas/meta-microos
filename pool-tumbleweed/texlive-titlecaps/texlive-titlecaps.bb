SUMMARY = "Setting rich-text input into Titling Caps"
DESCRIPTION = "The package is intended for setting rich text into titling \
capitals (in which the first character of words are \
capitalized). It automatically accounts for diacritical marks \
(like umlauts), national symbols (like 'ae'), punctuation, and \
font changing commands that alter the appearance or size of the \
text. It allows a list of predesignated words to be protected \
as lower-cased, and also allows for titling exceptions of \
various sorts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn63020"

RPM_NAME = "texlive-titlecaps-2023.201.1.3svn63020-52.1.noarch.rpm"
RPM_HASH = "f89e3208f9b77387478a946b829b3de72c27dcad51956cc505e5cf8bb6b88abd07fb72155900b64c3502a1264905906a882a2be9c6b4484a2d2b6cce9eac3869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(titlecaps.sty) \
texlive-titlecaps"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifnextok.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
