SUMMARY = "A beamer theme that incorporates colours and fonts of Saint Petersburg State University"
DESCRIPTION = "This minimalistic beamer theme incorporates Saint Petersburg \
State University colours and fonts. It is suitable for both \
presentations and posters."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45877"

RPM_NAME = "texlive-beamertheme-saintpetersburg-2023.201.svn45877-53.1.noarch.rpm"
RPM_HASH = "13986f5df5e140a133317884bb00c98fb0e98da641e19d91079ccf55a9786a663b2de78c4f4d5a6d73f48e6f592388a1f28747597586b670e653c8afac26542b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeSaintPetersburg.sty \
tex-beamerfontthemeSaintPetersburg.sty \
tex-beamerthemeSaintPetersburg.sty \
texlive-beamertheme-saintpetersburg"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraMono.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-ifxetex.sty \
tex-opensans.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
