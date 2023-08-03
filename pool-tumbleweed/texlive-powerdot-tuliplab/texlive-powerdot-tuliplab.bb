SUMMARY = "A style package for Powerdot to provide the design of TULIP Lab"
DESCRIPTION = "powerdot-tuliplab is the LaTeX package used in TULIP Lab for \
presentation drafting. It comes with several sample .tex files \
so that you can quickly start working with it."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn47963"

RPM_NAME = "texlive-powerdot-tuliplab-2023.209.1.0.0svn47963-53.1.noarch.rpm"
RPM_HASH = "9418107f995e47b4e8bce954c50ce8397ef5e50044197b9777e3625f9dd19bb68340f46a7f0aaa7174b5bf02e17d628f35ad231a72244cade96f6194e4dc22dd"
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
