SUMMARY = "Wrapping text around stuff"
DESCRIPTION = "This package provides another implementation of text wrapping. \
Its implementation benefits from the paragraph hooks available \
since LaTeX 2021-06-01."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn64058"

RPM_NAME = "texlive-wrapstuff-2023.209.0.0.3svn64058-53.2.noarch.rpm"
RPM_HASH = "9252a8a5340fb4cf99f67c015404da68e6a92156151e5b222128758657775ca7fee15fd7dd05faa8f2ef7fec5cc51125f80a8fdc3e76e95c588abd1249968fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wrapstuff.sty \
texlive-wrapstuff"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
