SUMMARY = "Describing a rest api"
DESCRIPTION = "This LaTeX package provides macros to describe rest apis for \
documentation purposes. The endpoints can hold the following \
information: method description path parameter request body and \
content type response body, content type and status code"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn57068"

RPM_NAME = "texlive-rest-api-2023.209.1.4svn57068-54.1.noarch.rpm"
RPM_HASH = "fabb38eea780248ea787bff12a155a7e8516a411250837341edabcb106cf12b92e5a40c639b3f959c1a053018d3451b96673a0b9098308119045f8d915104db2"
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
