SUMMARY = "Little style to create a standard titlepage for diploma thesis"
DESCRIPTION = "Yet another thesis titlepage style: support of Fachhochschule \
Aachen (Standort Juelich)"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-thesis-titlepage-fhac-2023.209.0.0.1svn15878-55.1.noarch.rpm"
RPM_HASH = "80d9a4720ea742e32411c76611c9add29d6f367742951804e2c844d6c7ed155e96f8061039f7f801f260bd83f197a5eb3e203ff3cfd69e0930c322cd166769ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fhACtitlepage.cfg \
tex-fhACtitlepage.sty \
tex-figbib-add.sty \
tex-gloss-add.sty \
texlive-thesis-titlepage-fhac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-figbib.sty \
tex-gloss.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
