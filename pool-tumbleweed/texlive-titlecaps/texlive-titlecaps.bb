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

PV = "2023.209.1.3svn63020"

RPM_NAME = "texlive-titlecaps-2023.209.1.3svn63020-53.1.noarch.rpm"
RPM_HASH = "b4e161a5ce9359f476a61a990e914f096629301b0b825024ccee3e00ccf41a781e718886580f791fda683d460358ed391663d4fbf074a140971ea392f67fefc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titlecaps.sty \
texlive-titlecaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifnextok.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
