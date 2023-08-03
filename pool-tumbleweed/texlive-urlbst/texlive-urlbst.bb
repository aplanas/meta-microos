SUMMARY = "Web support for BibTeX"
DESCRIPTION = "Supports a new BibTeX 'webpage' entry type and 'url', \
'lastchecked', and 'eprint' and 'DOI' fields. The Perl script \
urlbst can be used to add this support to an arbitrary .bst \
file which has a reasonably conventional structure. The result \
is meant to be robust rather than pretty."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9.1svn65694"

RPM_NAME = "texlive-urlbst-2023.209.0.0.9.1svn65694-54.1.noarch.rpm"
RPM_HASH = "169c32a0d33514acce568bb0d4139b2022466e0ffb454f4c403de31e9edecb8450322de79220c69d00cf9e88b9f44eee198934f314204f23b10271a238a0015b"
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
