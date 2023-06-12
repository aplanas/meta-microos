SUMMARY = "Class for MatematicaC3 textbooks"
DESCRIPTION = "The class is a development of memoir, with additions \
(specifically, mathematical extensions) that provide support \
for writing the books for the Matematica C3 project to produce \
free mathematical textbooks for use in Italian high schools."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn35773"

RPM_NAME = "texlive-matc3mem-2023.201.1.1svn35773-52.1.noarch.rpm"
RPM_HASH = "2bb5a79b6d51dae7e1237213d1de605ce2cfd06bc283645fe4e0a90f4098f0856f9cd3272fe863d889fcbf3a8452be9fb65d920a205721dd1e5d503f0910d72d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(matc3mem.cls) \
texlive-matc3mem"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsthm.sty) \
tex(shadethm.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
