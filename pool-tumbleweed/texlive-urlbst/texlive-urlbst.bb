SUMMARY = "Web support for BibTeX"
DESCRIPTION = "Supports a new BibTeX 'webpage' entry type and 'url', \
'lastchecked', and 'eprint' and 'DOI' fields. The Perl script \
urlbst can be used to add this support to an arbitrary .bst \
file which has a reasonably conventional structure. The result \
is meant to be robust rather than pretty."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.9.1svn65694"

RPM_NAME = "texlive-urlbst-2023.201.0.0.9.1svn65694-53.1.noarch.rpm"
RPM_HASH = "facb599a785e7bace8973b7ae61ec75d92b1fde2f432ec6d0ef710ced9f2ff9bd4089fc36d89186ba199d1ac0625c053389ac720e7926638d0b2ac9def06db1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urlbst"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
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
texlive-scripts-bin \
texlive-urlbst-bin"

inherit rpm
