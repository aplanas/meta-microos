SUMMARY = "A LaTeX version of CWEB"
DESCRIPTION = "This bundle allows marking-up of CWEB code in LaTeX. The \
distribution includes the 'Counting Words' program distributed \
with CWEB, edited to run with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn28878"

RPM_NAME = "texlive-cweb-latex-2023.209.svn28878-55.1.noarch.rpm"
RPM_HASH = "7713e67a23f70f5027c47986a5da9623e8b3ba3ee90a6368dfe75c5ffd22532ca416e1fef8ccb4217bf889b98bcd62f0301790a10335f158cfc59dbfa38214bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cwbl-german.sty \
tex-cweb.cls \
tex-cwebarray.sty \
tex-cwebbase.tex \
tex-keyvald.sty \
texlive-cweb-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
