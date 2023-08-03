SUMMARY = "Typesetting academic works according to ABNT rules"
DESCRIPTION = "The ABNT package provides a clean and practical implementation \
of the ABNT rules for academic texts. Its purpose is to be as \
simple and user-friendly as possible."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55471"

RPM_NAME = "texlive-abnt-2023.209.svn55471-55.1.noarch.rpm"
RPM_HASH = "5b23b663e233bc8909ace3be9ea54db857f5964ce7ae2acf443f15b6426e5ce9596afab16d5927eb50bf6dbeb6490e521b29bfe6a0753e68d97bd637d3122d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abnt.sty \
texlive-abnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-chngcntr.sty \
tex-emptypage.sty \
tex-enumerate.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-newfloat.sty \
tex-scrlayer-scrpage.sty \
tex-setspace.sty \
tex-tocbasic.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
