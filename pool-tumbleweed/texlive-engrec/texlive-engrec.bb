SUMMARY = "Enumerate with lower- or uppercase Greek letters"
DESCRIPTION = "This package provides two macros \\engrec and \\EnGrec to convert \
number arguments to lower case or upper case greek letters. \
They have the syntax of \\alph, i.e. \\engrec{a_counter}, \
\\EnGrec{a_counter}. Options are provided to work with the \
upgreek and fourier packages. Requires amstext."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-engrec-2023.209.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "464f7994a2899a0b43d55f00a93094ae20e7db8d3d83a97ccb13b1e59891f424c89ed2f6d3eddf2fc26061614a80846af93286585e9846a3b3ba4e9573a67d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engrec.sty \
texlive-engrec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-upgreek.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
