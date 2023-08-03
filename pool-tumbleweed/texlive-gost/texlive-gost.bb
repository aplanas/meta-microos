SUMMARY = "BibTeX styles to format according to GOST"
DESCRIPTION = "BibTeX styles to format bibliographies in English, Russian or \
Ukrainian according to GOST 7.0.5-2008 or GOST 7.1-2003. Both \
8-bit and Unicode (UTF-8) versions of each BibTeX style, in \
each case offering a choice of sorted and unsorted. Further, a \
set of three styles (which do not conform to current standards) \
are retained for backwards compatibility."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2lsvn57616"

RPM_NAME = "texlive-gost-2023.209.1.2lsvn57616-54.1.noarch.rpm"
RPM_HASH = "a21e95f9b29f5e2254b6487daeba05cbe54d750723383c04d37229d130770c8746500b1b86b94b224c5ca396ccb30de8c7b25b74dec45ebd8e2e2e2fd2140cd5"
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
