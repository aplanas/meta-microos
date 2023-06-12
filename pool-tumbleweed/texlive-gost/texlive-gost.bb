SUMMARY = "BibTeX styles to format according to GOST"
DESCRIPTION = "BibTeX styles to format bibliographies in English, Russian or \
Ukrainian according to GOST 7.0.5-2008 or GOST 7.1-2003. Both \
8-bit and Unicode (UTF-8) versions of each BibTeX style, in \
each case offering a choice of sorted and unsorted. Further, a \
set of three styles (which do not conform to current standards) \
are retained for backwards compatibility."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2lsvn57616"

RPM_NAME = "texlive-gost-2023.201.1.2lsvn57616-53.1.noarch.rpm"
RPM_HASH = "2d32fd2013a42a56018e9279f10406c99622b6e0ad47388bc4a38374dd4de938f5e4d10a6f4bdefae928b2d9961f3f0743ffc3e7cb1ea7ff5f74e451f86c303a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gost"
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
