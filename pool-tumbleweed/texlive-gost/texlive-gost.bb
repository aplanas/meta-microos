SUMMARY = "BibTeX styles to format according to GOST"
DESCRIPTION = "BibTeX styles to format bibliographies in English, Russian or \
Ukrainian according to GOST 7.0.5-2008 or GOST 7.1-2003. Both \
8-bit and Unicode (UTF-8) versions of each BibTeX style, in \
each case offering a choice of sorted and unsorted. Further, a \
set of three styles (which do not conform to current standards) \
are retained for backwards compatibility."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2lsvn57616"

RPM_NAME = "texlive-gost-2023.209.1.2lsvn57616-54.2.noarch.rpm"
RPM_HASH = "853c55589c6d7b7da0242b2f5287746e1b1010ac732d8283d16cffc84f0f162b7f202438ffed631b3bed9ced6a4a9c9c671a2f865d5bd6a562bd05f91f420d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gost"

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
