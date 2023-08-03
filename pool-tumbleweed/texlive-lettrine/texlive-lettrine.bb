SUMMARY = "Typeset dropped capitals"
DESCRIPTION = "The lettrine package supports various dropped capitals styles, \
typically those described in the French typographic books. In \
particular, it has facilities for the paragraph text's left \
edge to follow the outline of capitals that have a regular \
shape (such as 'A' and 'V')."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.30svn64511"

RPM_NAME = "texlive-lettrine-2023.209.2.30svn64511-55.1.noarch.rpm"
RPM_HASH = "d63aaa5a10de8a23b86590c0fb8cc139d8fa0cfa158399e79dc1c3dad03077be08fad65181f132c627b1905002e8f06896378987277a68b0ea28f83ed536dcad"
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
