SUMMARY = "Draw Nassi-Shneiderman charts"
DESCRIPTION = "Even in the age of OOP one must develop algorithms. \
Nassi-Shneiderman charts are a well known tool to describe an \
algorithm in a graphical way. The package offers some macros \
for generating those charts in a LaTeX document. The package \
provides the most important elements of a Nassi-Shneiderman \
charts, including processing blocks, loops, mapping conventions \
for alternatives, etc. The charts are drawn using the picture \
environment (using pict2e for preference)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3c_0_g7d3fc5bsvn47931"

RPM_NAME = "texlive-struktex-2023.209.2.3c_0_g7d3fc5bsvn47931-58.1.noarch.rpm"
RPM_HASH = "9d96d3f4aac94b9f7c9647ca784963a034cd7877b7edb0fc6e6ee8b87a94b564b2e05715f50cb2b2b680bdfc688f1242cda94c30a2d5c7d818a27aefb7344049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-strukdoc.sty \
tex-struktex.sty \
tex-struktxf.sty \
tex-struktxp.sty \
texlive-struktex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-curves.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-nameref.sty \
tex-pict2e.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
