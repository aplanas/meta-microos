SUMMARY = "A style package for Powerdot to provide the design of TULIP Lab"
DESCRIPTION = "powerdot-tuliplab is the LaTeX package used in TULIP Lab for \
presentation drafting. It comes with several sample .tex files \
so that you can quickly start working with it."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn47963"

RPM_NAME = "texlive-powerdot-tuliplab-2023.201.1.0.0svn47963-52.1.noarch.rpm"
RPM_HASH = "88a974b6fb9280f7317ebc3aee1b1789f6c030c64c99ba058f5d3227dc72ac96efa543dbb4cdd53ce7d5413975fe67d11674a90e7efa7e78b802c9380d9a8536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-powerdot-tuliplab.sty \
texlive-powerdot-tuliplab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pifont.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
