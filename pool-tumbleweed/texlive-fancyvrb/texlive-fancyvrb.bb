SUMMARY = "Sophisticated verbatim text"
DESCRIPTION = "Flexible handling of verbatim text including: verbatim commands \
in footnotes; a variety of verbatim environments with many \
parameters; ability to define new customized verbatim \
environments; save and restore verbatim text and environments; \
write and read files in verbatim mode; build 'example' \
environments (showing both result and verbatim source)."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.5asvn65585"

RPM_NAME = "texlive-fancyvrb-2023.209.4.5asvn65585-53.1.noarch.rpm"
RPM_HASH = "80df9912a778b88cd610773c98241f8113ec0b0a8442d461df9ae75f26e5c02dbdc517b096698db22751eaa66692584e012ca1dff7aa4d0862cdfd7a3bd8febd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyvrb-ex.sty \
tex-fancyvrb.sty \
tex-hbaw.sty \
tex-hcolor.sty \
texlive-fancyvrb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-pstricks.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
