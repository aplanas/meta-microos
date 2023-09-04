SUMMARY = "Typeset Korean with Xe(La)TeX"
DESCRIPTION = "The package supports typesetting Korean documents (including \
old Hangul texts), using XeTeX. It enhances the existing \
support, in XeTeX, providing features that provide quality \
typesetting. This package requires the cjk-ko package for its \
full functionality."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn64894"

RPM_NAME = "texlive-xetexko-2023.209.4.2svn64894-53.2.noarch.rpm"
RPM_HASH = "b7d7d751963c77efbdc6f0f93104ff548aea9895a8892ba86d4b02f800ca4bbe083fa07083836da7a6691f04c6520faffb5914d37adf715d259d01e35a8234d9"
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
