SUMMARY = "Flexible typesetting of table and figure floats using key/value directives"
DESCRIPTION = "Provides commands to typeset centered, left- or right-aligned \
table and (multiple-)figure floats, with footnotes. Instead of \
an environment, a command with 4 arguments is used; the first \
is optional and is used for key,value pairs generating \
variations on the defaults and offering a route for future \
extensions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.31svn38672"

RPM_NAME = "texlive-ctable-2023.209.1.31svn38672-55.1.noarch.rpm"
RPM_HASH = "e0f7c703213b609a78adb11bdc243cbefacb10952d87760c08b4dc90a19885ee67bcf80475d735a46a503b7adec328e5f00b7cf3e0cb3bebfe3fb049eeb5dcf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctable.sty \
texlive-ctable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-etoolbox.sty \
tex-ifpdf.sty \
tex-rotating.sty \
tex-tabularx.sty \
tex-transparent.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
