SUMMARY = "Enumerate with lower- or uppercase Greek letters"
DESCRIPTION = "This package provides two macros \\engrec and \\EnGrec to convert \
number arguments to lower case or upper case greek letters. \
They have the syntax of \\alph, i.e. \\engrec{a_counter}, \
\\EnGrec{a_counter}. Options are provided to work with the \
upgreek and fourier packages. Requires amstext."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-engrec-2023.201.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "1a07a5c9d0ef1adc3f6d5256cfb3dc8f37d4c55c5f8d5ed90436fb488cc048c8376e44ceb9da6002a9330eb86839b5afcf1097da9205d9f9b1e01bce2a38112c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engrec.sty \
texlive-engrec"

RDEPENDS:${PN} += "/bin/sh \
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
