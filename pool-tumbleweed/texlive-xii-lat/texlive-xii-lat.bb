SUMMARY = "Christmas silliness (Latin)"
DESCRIPTION = "This is the plain TeX file xii-lat.tex. Call 'pdftex \
xii-lat.tex' to produce a (perhaps) surprising typeset \
document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45805"

RPM_NAME = "texlive-xii-lat-2023.201.svn45805-52.1.noarch.rpm"
RPM_HASH = "feea5c793f2ed42cfa7b012f6100d12991da3063ddf4818b579e6b2a7b06f832a47ff4ab53c8422bad39b0eca377aa4cc632211827b9d9bd64967c2578e9e7c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xii-lat"

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
