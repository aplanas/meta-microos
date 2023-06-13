SUMMARY = "OpenType maths fonts for Latin Modern"
DESCRIPTION = "Latin Modern Math is a maths companion for the Latin Modern \
family of fonts, in OpenType format. For use with LuaLaTeX or \
XeLaTeX, support is available from the unicode-math package."
LICENSE = "LPPL-1.3c"

PV = "2023.201.1.959svn36915"

RPM_NAME = "texlive-lm-math-2023.201.1.959svn36915-54.1.noarch.rpm"
RPM_HASH = "0838f9f0200cdf505d763f9348bb72eb103abe75a7ed1cfb6605b070e7c1671dbe2dc80aa9264b502b822175244b587504681d3a8356cdb0a8634775097f464a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lm-math"

RDEPENDS:${PN} += "/bin/sh \
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
