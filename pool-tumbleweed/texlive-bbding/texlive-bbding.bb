SUMMARY = "A symbol (dingbat) font and LaTeX macros for its use"
DESCRIPTION = "A symbol font (distributed as Metafont source) that contains \
many of the symbols of the Zapf dingbats set, together with an \
NFSS interface for using the font. An Adobe Type 1 version of \
the fonts is available in the niceframe fonts bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn17186"

RPM_NAME = "texlive-bbding-2023.209.1.01svn17186-54.1.noarch.rpm"
RPM_HASH = "17f17830dd7c3bbfa0e309d70b2b282701c9641fabb4649ff9613edac7ac4de07eaeaf9e86c198ce8b787606ea2186fdbc8af7769512f5464b2bcb4e6a0cafda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Uding.fd \
tex-bbding.sty \
tex-bbding10.tfm \
texlive-bbding"

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
