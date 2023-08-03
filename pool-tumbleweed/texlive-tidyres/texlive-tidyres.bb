SUMMARY = "Create formal resumes easily"
DESCRIPTION = "This LaTeX package aims to provide users with a simple \
interface to create multi-column formal resumes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn65789"

RPM_NAME = "texlive-tidyres-2023.209.1.0.0svn65789-55.1.noarch.rpm"
RPM_HASH = "ba44125adb875cf4c352bb15e1559b87ef4a9c867c8af292de763515fe6bea945be1cfa1329b15ee18c1dc69238447632d27e43f58b906d8b2524631e8b7c888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tidyres.sty \
texlive-tidyres"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-enumitem.sty \
tex-fontawesome.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-paracol.sty \
tex-setspace.sty \
tex-tabularray.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
