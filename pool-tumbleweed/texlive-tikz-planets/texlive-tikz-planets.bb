SUMMARY = "Illustrate celestial mechanics and the solar system"
DESCRIPTION = "This TikZ-package makes it easy to illustrate celestial \
mechanics and the solar system. You can use it to draw sketches \
of the eclipses, the phases of the Moon, etc. The package \
requires the standard packages TikZ, xcolor, xstring, and \
pgfkeys."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn55002"

RPM_NAME = "texlive-tikz-planets-2023.209.1.0.2svn55002-53.1.noarch.rpm"
RPM_HASH = "1cb16cd4ca944c2b83c7e27b39a30fe60c0d9a24681f7e8cc44dc3ffe9b90d271554614d713bc7b38be42c41d497065223c180d89f29b4282c4e0240ce61da6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-planets.sty \
texlive-tikz-planets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
