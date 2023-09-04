SUMMARY = "Enumerate with lower- or uppercase Greek letters"
DESCRIPTION = "This package provides two macros \\engrec and \\EnGrec to convert \
number arguments to lower case or upper case greek letters. \
They have the syntax of \\alph, i.e. \\engrec{a_counter}, \
\\EnGrec{a_counter}. Options are provided to work with the \
upgreek and fourier packages. Requires amstext."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-engrec-2023.209.1.1svn15878-54.2.noarch.rpm"
RPM_HASH = "7be9232a0deabfe7adaf08f1919118dbef5e11cf2eca995225fec3becc621c6e7eff9351f5e2ea3bde86d2698148be2db33c09c976d270cf4ddfe61953ca04e5"
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
