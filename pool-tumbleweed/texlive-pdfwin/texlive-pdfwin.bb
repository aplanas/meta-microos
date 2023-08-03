SUMMARY = "Customizable windows for screen viewing of TeX documents"
DESCRIPTION = "Inspired by the pdfscreen package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-pdfwin-2023.209.svn54074-52.1.noarch.rpm"
RPM_HASH = "032ac4a0753edeaf5d7141be9b696b345756203e3765b3dac284ffe4c3540d38562027feb61fa819ec68ae16b086e40b01232243a7d168e105f05b3f1e4525ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfwin.cfg \
tex-pdfwin.sty \
texlive-pdfwin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-color.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-truncate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
