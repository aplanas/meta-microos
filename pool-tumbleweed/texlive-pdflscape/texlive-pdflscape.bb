SUMMARY = "Make landscape pages display as landscape"
DESCRIPTION = "The package adds PDF support to the landscape environment of \
package lscape, by setting the PDF /Rotate page attribute. \
Pages with this attribute will be displayed in landscape \
orientation by conforming PDF viewers."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn64851"

RPM_NAME = "texlive-pdflscape-2023.201.0.0.13svn64851-51.1.noarch.rpm"
RPM_HASH = "76b05a18c65411ff22824a93045b350c4ab9bbd7da851a179d3b9ddbca0aee5a68a0a96382837ed47f1d8c538877982df1eccd3cf85197b3b084dad12b60b89a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdflscape-nometadata.sty) \
tex(pdflscape.sty) \
texlive-pdflscape"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(lscape.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
