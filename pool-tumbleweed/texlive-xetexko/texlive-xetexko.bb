SUMMARY = "Typeset Korean with Xe(La)TeX"
DESCRIPTION = "The package supports typesetting Korean documents (including \
old Hangul texts), using XeTeX. It enhances the existing \
support, in XeTeX, providing features that provide quality \
typesetting. This package requires the cjk-ko package for its \
full functionality."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn64894"

RPM_NAME = "texlive-xetexko-2023.201.4.2svn64894-52.2.noarch.rpm"
RPM_HASH = "04170a79b5be924e819d1ca069af3acf5dab8040d090ab29824b82711d58750971064e7e30cb957ea4d4f320fde6a62d148ee7726935afd5aec174cfaf13c8e0"
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
