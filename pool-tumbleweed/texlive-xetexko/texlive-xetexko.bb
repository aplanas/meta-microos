SUMMARY = "Typeset Korean with Xe(La)TeX"
DESCRIPTION = "The package supports typesetting Korean documents (including \
old Hangul texts), using XeTeX. It enhances the existing \
support, in XeTeX, providing features that provide quality \
typesetting. This package requires the cjk-ko package for its \
full functionality."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn64894"

RPM_NAME = "texlive-xetexko-2023.209.4.2svn64894-53.1.noarch.rpm"
RPM_HASH = "4c9757daaf76738936cc4c3ed434e77bb38ab9cd79c6bbe3f7c021c3578b624b882a1a51fe3d7edbdfe09ebd7c6822c84e1f8a2157773c6bfdad2427ddb6e1d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xetexko-font.sty \
tex-xetexko-hanging.sty \
tex-xetexko-josa.sty \
tex-xetexko-space.sty \
tex-xetexko-vertical.sty \
tex-xetexko.sty \
texlive-xetexko"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-kolabels-utf.sty \
tex-konames-utf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
