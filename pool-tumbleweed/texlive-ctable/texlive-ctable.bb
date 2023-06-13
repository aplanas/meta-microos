SUMMARY = "Flexible typesetting of table and figure floats using key/value directives"
DESCRIPTION = "Provides commands to typeset centered, left- or right-aligned \
table and (multiple-)figure floats, with footnotes. Instead of \
an environment, a command with 4 arguments is used; the first \
is optional and is used for key,value pairs generating \
variations on the defaults and offering a route for future \
extensions."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.31svn38672"

RPM_NAME = "texlive-ctable-2023.204.1.31svn38672-54.1.noarch.rpm"
RPM_HASH = "bf06a1a0ed6391f939996c417094eda4413bd432b50f8645e74ab213281463221b9040b7f5f906e60e3c0dd9a0c8667aab7734eb6ab3a4da3a074f33b4d19b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ctable.sty) \
texlive-ctable"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(booktabs.sty) \
tex(etoolbox.sty) \
tex(ifpdf.sty) \
tex(rotating.sty) \
tex(tabularx.sty) \
tex(transparent.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
