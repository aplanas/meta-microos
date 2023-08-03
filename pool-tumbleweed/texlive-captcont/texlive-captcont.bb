SUMMARY = "Retain float number across several floats"
DESCRIPTION = "The captcont package provides the ability to continue the \
numbering in your float environment (figure, table, etc.) with \
minimal overhead. This package adds three commands: \\caption*, \
\\captcont, and \\captcont*. Along with the \\caption command, \
these give full control over the caption numbering, caption \
text and the entries in the list-of pages. The \\caption and \
\\captcont commands generate list-of page entries. The \\caption \
and \\caption* commands increment the figure or table counter. \
Captcont also fully supports the subfigure package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-captcont-2023.209.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "042a289d26a94e38f148d4591669e9e3cfdaa303714a802a110021e7808b6e7787e34955b2df7b6dc49ed2025e32b447b7323512a111b2144206f3dec46c1564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-captcont.sty \
texlive-captcont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
