SUMMARY = "Typeset dropped capitals"
DESCRIPTION = "The lettrine package supports various dropped capitals styles, \
typically those described in the French typographic books. In \
particular, it has facilities for the paragraph text's left \
edge to follow the outline of capitals that have a regular \
shape (such as 'A' and 'V')."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.30svn64511"

RPM_NAME = "texlive-lettrine-2023.201.2.30svn64511-54.1.noarch.rpm"
RPM_HASH = "88c6cf24d8e0d7aef3d1853989d89e07ffe39b8c6a53bd2aaebf81c91fc8dae29b32d5ef45ac9e0f9eb4ad0f6222406ffcefdda7559ae36af346c895578f0465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lettrine-2006-03-17.sty \
tex-lettrine-2015-08-31.sty \
tex-lettrine-2018-08-18.sty \
tex-lettrine.cfg \
tex-lettrine.sty \
texlive-lettrine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-minifp.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
