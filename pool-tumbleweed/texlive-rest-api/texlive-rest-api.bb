SUMMARY = "Describing a rest api"
DESCRIPTION = "This LaTeX package provides macros to describe rest apis for \
documentation purposes. The endpoints can hold the following \
information: method description path parameter request body and \
content type response body, content type and status code"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn57068"

RPM_NAME = "texlive-rest-api-2023.201.1.4svn57068-53.1.noarch.rpm"
RPM_HASH = "5ecc595bbfb682b71010ffb402a6ad980d87642704ff6fcf8bc48c5a417d95c64d9934d07b4edbf98ba73aa8706a7fe3fbf3485ecb9a8aba002c270d5a78c30e"
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
