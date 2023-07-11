SUMMARY = "Display bibitem tags in the margins"
DESCRIPTION = "The package redefines the 'thebibliography' environment to \
place the citation key into the margin."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.0csvn15878"

RPM_NAME = "texlive-margbib-2023.208.1.0csvn15878-53.1.noarch.rpm"
RPM_HASH = "972110e0ce6579ccddd4cf50350c65fba799a96fab5f64440bc3a1ae36e38178f4c46271736ed7131b6c120b8b7d42be85024316834aa45e828ac1cea8419660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-margbib.sty \
texlive-margbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
