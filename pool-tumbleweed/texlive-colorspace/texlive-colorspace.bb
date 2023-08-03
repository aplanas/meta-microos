SUMMARY = "Provides PDF color spaces"
DESCRIPTION = "The package provides PDF color spaces. Currently, only spot \
colors and overprinting are supported. It requires xcolor, and \
supports pdfTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn50585"

RPM_NAME = "texlive-colorspace-2023.209.1.3svn50585-54.1.noarch.rpm"
RPM_HASH = "37f8ccb4160926c27c37b6d57701b6097da08954cb88f51cf83837036081ec1bf7f7ff2f17be7c0024b34c9d5de5fef8dc65c6532f4c78eaef9e9a01882f77f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorspace.sty \
texlive-colorspace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
