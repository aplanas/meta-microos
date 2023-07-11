SUMMARY = "Measure restriction symbol in LaTeX"
DESCRIPTION = "This package provides a simple macro \\resmes that prints the \
measure restriction symbol."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65375"

RPM_NAME = "texlive-resmes-2023.201.1.0svn65375-53.2.noarch.rpm"
RPM_HASH = "c157bd8b53d6c4286729a33d310eceef58f08ed201d70db3a9f392480aec6ae30e2e281c9e02181f60286321a1cfc364bc8d6284803db2d3c7aa1c60b1111ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resmes.sty \
texlive-resmes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
