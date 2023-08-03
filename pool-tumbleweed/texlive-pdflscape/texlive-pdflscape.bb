SUMMARY = "Make landscape pages display as landscape"
DESCRIPTION = "The package adds PDF support to the landscape environment of \
package lscape, by setting the PDF /Rotate page attribute. \
Pages with this attribute will be displayed in landscape \
orientation by conforming PDF viewers."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn64851"

RPM_NAME = "texlive-pdflscape-2023.209.0.0.13svn64851-52.1.noarch.rpm"
RPM_HASH = "fe9fabcf82e525f13ece8c7138fcfbf5f9aa28a43a12691b2c601b5ef500898994d4aba2dacf38607d02afc9e6fbc2f4476e78322e300d3dfd581be12275a1b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdflscape-nometadata.sty \
tex-pdflscape.sty \
texlive-pdflscape"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-lscape.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
