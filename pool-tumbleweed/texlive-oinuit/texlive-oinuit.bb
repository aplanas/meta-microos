SUMMARY = "LaTeX Support for the Inuktitut Language"
DESCRIPTION = "The package provides a set of Lambda (Omega LaTeX) typesetting \
tools for the Inuktitut language. Five different input methods \
are supported and with the necessary fonts are also provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28668"

RPM_NAME = "texlive-oinuit-2023.209.svn28668-55.1.noarch.rpm"
RPM_HASH = "3157020f2673987a8a5e2dd7fb98e6dcf58045dfc8e777817ea61f81204f64d4210191cabc058d35ed5104be303abc03abbdfa72552e5c410161aab18214862b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Inuit.tfm \
tex-Inuitb.tfm \
tex-Inuitbo.tfm \
tex-Inuito.tfm \
tex-litcmr.fd \
tex-litenc.def \
tex-oinuit.map \
tex-oinuit.sty \
texlive-oinuit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oinuit-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
