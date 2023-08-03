SUMMARY = "LaTeX support for the eiad font"
DESCRIPTION = "The package provides macros to support use of the eiad fonts in \
OT1 encoding. Also offered are a couple of Metafont files \
described in the font package, but not provided there."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-eiad-ltx-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "97faa75240171c99607ddaf754754efddc921a8a2801987e5aa2b705a117b0788881ba4f91bef997cd125c06c698cc5809718be3758b0f5aa444b06b3e6cf289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eiad.sty \
texlive-eiad-ltx"

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
