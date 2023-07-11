SUMMARY = "Class for MatematicaC3 textbooks"
DESCRIPTION = "The class is a development of memoir, with additions \
(specifically, mathematical extensions) that provide support \
for writing the books for the Matematica C3 project to produce \
free mathematical textbooks for use in Italian high schools."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn35773"

RPM_NAME = "texlive-matc3mem-2023.208.1.1svn35773-53.1.noarch.rpm"
RPM_HASH = "34fe277e38c3bbf6cb60f42b9b558bc2187bbc7a2dd4677e49bdc60baf8f911ad9050004f95eaa864ca4af1594f81b45238f9e529a97efbbb65511d20fa5911f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-matc3mem.cls \
texlive-matc3mem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-shadethm.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
