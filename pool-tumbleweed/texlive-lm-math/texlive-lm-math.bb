SUMMARY = "OpenType maths fonts for Latin Modern"
DESCRIPTION = "Latin Modern Math is a maths companion for the Latin Modern \
family of fonts, in OpenType format. For use with LuaLaTeX or \
XeLaTeX, support is available from the unicode-math package."
LICENSE = "LPPL-1.3c"

PV = "2023.209.1.959svn36915"

RPM_NAME = "texlive-lm-math-2023.209.1.959svn36915-55.1.noarch.rpm"
RPM_HASH = "7de6baa1f07ac8a21a426917176294744351fdc6138d9301c26042d569c5420d94056d17cfc714f408b8a73bcc06ad24a157a470b46a2ea58b01010ef8a7075d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lm-math"

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
texlive-lm-math-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
