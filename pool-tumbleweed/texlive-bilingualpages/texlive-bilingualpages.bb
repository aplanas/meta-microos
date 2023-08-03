SUMMARY = "Typeset two columns in parallel"
DESCRIPTION = "This is a simple wrapper for the paracol package for setting \
two-column parallel text."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn59643"

RPM_NAME = "texlive-bilingualpages-2023.209.1.0.0svn59643-54.1.noarch.rpm"
RPM_HASH = "b03d311a08e3509875a0224a93ab6d7b1f5a15f5552738296b3f5d3b28800de22b8635c39329082735fb877afe8e01bcb766daf395191c1470cc2cf98fd81c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bilingualpages.sty \
texlive-bilingualpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-paracol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
