SUMMARY = "Enumerate with lower- or uppercase Greek letters"
DESCRIPTION = "This package provides two macros \\engrec and \\EnGrec to convert \
number arguments to lower case or upper case greek letters. \
They have the syntax of \\alph, i.e. \\engrec{a_counter}, \
\\EnGrec{a_counter}. Options are provided to work with the \
upgreek and fourier packages. Requires amstext."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-engrec-2023.201.1.1svn15878-53.2.noarch.rpm"
RPM_HASH = "fe8aa91f3f278116e7a0cae4fd87fbd9d2bc2110a7fc5726dd5839e90df29a3f830155b437a005b029c4af1f5d1cba88c54f87961601c862df21a2f3efca712a"
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
