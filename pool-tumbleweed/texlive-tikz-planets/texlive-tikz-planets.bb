SUMMARY = "Illustrate celestial mechanics and the solar system"
DESCRIPTION = "This TikZ-package makes it easy to illustrate celestial \
mechanics and the solar system. You can use it to draw sketches \
of the eclipses, the phases of the Moon, etc. The package \
requires the standard packages TikZ, xcolor, xstring, and \
pgfkeys."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn55002"

RPM_NAME = "texlive-tikz-planets-2023.201.1.0.2svn55002-52.1.noarch.rpm"
RPM_HASH = "68a399640db739914353b20f634a8e0d03e82baf10d9c99a315df09085fea7ecc72bacf017f38ce51103a62811a4efc3e81f1762e8991eee10fcb50287b56606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-planets.sty \
texlive-tikz-planets"

RDEPENDS:${PN} += "/bin/sh \
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
