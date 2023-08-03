SUMMARY = "Adds relative coordinates and improves the \\plot command"
DESCRIPTION = "Adds two user commands to standard PiCTeX. One command uses \
relative coordinates, thus eliminating the need to calculate \
the coordinate of every point manually as in standard PiCTeX. \
The other command modifies \\plot to use a rule instead of dots \
if the line segment is horizontal or vertical."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pictex2-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "b6e28125e62a2b985cfe9fceb8cdc1d99b4ce18321effe065ec9d7ebac9155ceb396efd4df67daf52bf4054775a93a88e6bcf0fbbcaee8a1ccd3ca12ab6974ac"
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
