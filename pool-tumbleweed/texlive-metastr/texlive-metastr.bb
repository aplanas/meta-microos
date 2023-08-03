SUMMARY = "Store and compose strings"
DESCRIPTION = "This is a package to store and compose strings in a structured \
way. This can serve various purposes, for example: manage and \
write document metadata; use templates for formatting document \
data; assist in assembling and displaying document license \
information; facilitate basic internationalisation and \
localisation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn56246"

RPM_NAME = "texlive-metastr-2023.209.1.1.2svn56246-55.1.noarch.rpm"
RPM_HASH = "86919d73de1abae992d255abeb15f33c8aa07ca53b6e07cba941690d1a5776b26a9a2358eabe8bed0a55ded34441fce6e46f559eaa9a63460f3d1166965679a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metastr.sty \
texlive-metastr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
