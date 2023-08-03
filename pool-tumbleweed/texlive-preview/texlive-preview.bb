SUMMARY = "Extract bits of a LaTeX source for output"
DESCRIPTION = "The package is a free-standing part of the preview-latex \
bundle. The package provides the support preview-latex needs, \
when it chooses the matter it will preview. The output may \
reasonably be expected to have other uses, as in html \
translators, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.13.1svn62130"

RPM_NAME = "texlive-preview-2023.209.13.1svn62130-53.1.noarch.rpm"
RPM_HASH = "c220b83a5700cc4ea8edc9caa1c2b853488acc425dd75319d156d44fcd5b1b55d7ee61ab8c3735f1efb2b46e6d93b5f479792906a825f2519ab0f3bdf97f6130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prauctex.cfg \
tex-prauctex.def \
tex-prcounters.def \
tex-preview.sty \
tex-prfootnotes.def \
tex-prlyx.def \
tex-prshowbox.def \
tex-prshowlabels.def \
tex-prtightpage.def \
tex-prtracingall.def \
texlive-preview"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatex85.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
