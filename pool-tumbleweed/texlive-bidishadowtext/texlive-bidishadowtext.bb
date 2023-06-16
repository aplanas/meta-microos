SUMMARY = "Bidi-aware shadow text"
DESCRIPTION = "This package allows you to typeset bidi-aware shadow text. It \
is a re-implementation of the shadowtext package adding bidi \
support."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn34633"

RPM_NAME = "texlive-bidishadowtext-2023.201.0.0.1svn34633-53.1.noarch.rpm"
RPM_HASH = "3e588bb9cd66965dd7ef6b06ab53aa1b6c30d7e2321daf3143f7f63b51aadc50dcc90b0da99dd92121e080ef8712d8a770dc44cf742ac0fae35f78021c40d258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidishadowtext.sty \
texlive-bidishadowtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
