SUMMARY = "Extract bits of a LaTeX source for output"
DESCRIPTION = "The package is a free-standing part of the preview-latex \
bundle. The package provides the support preview-latex needs, \
when it chooses the matter it will preview. The output may \
reasonably be expected to have other uses, as in html \
translators, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.13.1svn62130"

RPM_NAME = "texlive-preview-2023.201.13.1svn62130-52.1.noarch.rpm"
RPM_HASH = "2bdaf28c35f46530a4d7a5354094e9e329f0a57a981d52cdf8ea3deef255303df8a195d31a5192c8488486d2de99e1daf01ed93f74c01a561333175ae911ad22"
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
