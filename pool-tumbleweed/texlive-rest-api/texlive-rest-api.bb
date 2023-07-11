SUMMARY = "Describing a rest api"
DESCRIPTION = "This LaTeX package provides macros to describe rest apis for \
documentation purposes. The endpoints can hold the following \
information: method description path parameter request body and \
content type response body, content type and status code"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn57068"

RPM_NAME = "texlive-rest-api-2023.201.1.4svn57068-53.2.noarch.rpm"
RPM_HASH = "6842a2740dc541580c7886d0b101b0a6c75c0fb7678e8760c491fe55cc5dd2eec7eba15bf64441126f916fe27dd301c614c70e20e85ce908392d4731cadc3f29"
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
