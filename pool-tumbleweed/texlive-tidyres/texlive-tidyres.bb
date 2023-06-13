SUMMARY = "Create formal resumes easily"
DESCRIPTION = "This LaTeX package aims to provide users with a simple \
interface to create multi-column formal resumes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn65789"

RPM_NAME = "texlive-tidyres-2023.201.1.0.0svn65789-54.1.noarch.rpm"
RPM_HASH = "3c7257bd5dfa6380f150567083e879ebdd79a191e38ffa64af28b6d4e80fa0c08e75d7769e8182815d4900b7fc7db8be6ff5b43d2769bd8f53a8810ac48c67f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tidyres.sty) \
texlive-tidyres"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(enumitem.sty) \
tex(fontawesome.sty) \
tex(hologo.sty) \
tex(hyperref.sty) \
tex(paracol.sty) \
tex(setspace.sty) \
tex(tabularray.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
