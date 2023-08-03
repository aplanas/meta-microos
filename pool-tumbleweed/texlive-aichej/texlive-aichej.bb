SUMMARY = "Bibliography style file for the AIChE Journal"
DESCRIPTION = "The style was generated using custom-bib, and implements the \
style of the American Institute of Chemical Engineers Journal \
(or AIChE Journal or AIChE J or AIChEJ)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-aichej-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "1bed8dc60070404d19e56344c28e14f9ccbc92664a0ab09e183900ee53faa469624713906250081f3c6addc7545232a349196b6e7308786cd823ef50886de4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aichej"

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
