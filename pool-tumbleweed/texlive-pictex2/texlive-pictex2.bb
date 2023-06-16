SUMMARY = "Adds relative coordinates and improves the \\plot command"
DESCRIPTION = "Adds two user commands to standard PiCTeX. One command uses \
relative coordinates, thus eliminating the need to calculate \
the coordinate of every point manually as in standard PiCTeX. \
The other command modifies \\plot to use a rule instead of dots \
if the line segment is horizontal or vertical."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pictex2-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "c5620eb92d20d6aa68f639b2c71c2cba17dcd43c85446fb5396e038d390f9ddf3fc36dacc84901e3e439026b06eb2917dbd7ebe949de55d244ed4aca8ebe9d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pictex2.sty \
texlive-pictex2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pictex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
