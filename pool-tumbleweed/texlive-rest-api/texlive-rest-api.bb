SUMMARY = "Describing a rest api"
DESCRIPTION = "This LaTeX package provides macros to describe rest apis for \
documentation purposes. The endpoints can hold the following \
information: method description path parameter request body and \
content type response body, content type and status code"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn57068"

RPM_NAME = "texlive-rest-api-2023.209.1.4svn57068-54.2.noarch.rpm"
RPM_HASH = "ffece375e357d43da12979bc45a405cb1d67b400612791e7f07e38856ac1b0cfa08d0f6abcba67cc92ccc60dedb6249fa6be52191693fcffd73c0e0fdeaad2a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rest-api.sty \
texlive-rest-api"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-color.sty \
tex-colortbl.sty \
tex-fontenc.sty \
tex-listings.sty \
tex-mdframed.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-transparent.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
