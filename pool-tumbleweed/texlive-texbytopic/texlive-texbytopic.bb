SUMMARY = "Freed version of the book TeX by Topic"
DESCRIPTION = "An invaluable book, originally published by Addison-Wesley (who \
have released their copyright -- their version of the book went \
out of print in the 1990s). The book describes itself as 'a \
TeXnician's reference', and covers the way TeX (the engine) \
works in as much detail as most ordinary TeX programmers will \
ever need to know. A printed copy of the book may be had (for a \
modest price) via lulu.com (see the package home page for \
details)."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-texbytopic-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "eae8fbe3aeb8cc0b68cd1272048e5b2f8e0e6325a248e2865bc53d020bf570a233834bad794ea14b4ee4e0372c532a38a1526a38300085bbe74cfdafda616aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texbytopic"
RDEPENDS:${PN} += "/bin/sh \
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
