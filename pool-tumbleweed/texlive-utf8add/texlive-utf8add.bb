SUMMARY = "Additional support for UTF-8 encoded LaTeX input"
DESCRIPTION = "This bundle contains the LaTeX packages utf8add.sty and \
utf8hax.sty. The utf8add package provides additional support \
for the use of UTF-8 encoded input. This is intended for making \
LaTeX input more readable. The utf8hax package is using UTF-8 \
characters for easier access to math in LaTeX, however making \
the LaTeX input less readable."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn61074"

RPM_NAME = "texlive-utf8add-2023.209.svn61074-54.1.noarch.rpm"
RPM_HASH = "9f959635a00a217d45af1d6775b62dcc624e24fae1af2fc6bd102a6198c2c3d42325ea8b72b4f50b132b2f10af46512c79f0e93cd0a73b76ed444bdd84812124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-utf8add.sty \
tex-utf8hax.sty \
texlive-utf8add"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-gensymb.sty \
tex-inputenc.sty \
tex-nicefrac.sty \
tex-upgreek.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
