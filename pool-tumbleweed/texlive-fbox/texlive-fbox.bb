SUMMARY = "Extended \\fbox macro from standard LaTeX"
DESCRIPTION = "This package redefines \\fbox to allow an optional argument for \
different frames. It can be any combination of l)eft, r)ight, \
t)op, and b)ottom, for example: \\fbox[lt]{foo}. Using uppercase \
letters or a combination of lowercase and uppercase is also \
possible."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.06svn62126"

RPM_NAME = "texlive-fbox-2023.209.0.0.06svn62126-53.1.noarch.rpm"
RPM_HASH = "6ce06d06566b22a56403b3462a2a67bd2bfe97cb5139c57008886ff2d3181ec9786dc34b56f66b417704e18c1deac5ac9519faf9f52d32562c0e677048b8c0b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fbox.sty \
texlive-fbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
