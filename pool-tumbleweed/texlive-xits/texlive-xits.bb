SUMMARY = "A Scientific Times-like font with support for mathematical typesetting"
DESCRIPTION = "XITS is a Times-like font for scientific typesetting with \
proper mathematical support for modern, Unicode and OpenType \
capable TeX engines, namely LuaTeX and XeTeX. For use with \
LuaLaTeX or XeLaTeX, support is available from the fontspec and \
unicode-math packages."
LICENSE = "OFL-1.1"

PV = "2023.201.1.302svn55730"

RPM_NAME = "texlive-xits-2023.201.1.302svn55730-52.1.noarch.rpm"
RPM_HASH = "64c1defbaa6f966905ccdeb637ef52584a1b075f2e69e36126f1403be088c5dbfa22ff67cf9df2d6a05101c00731718320e76fc351404275a4c2deb2b088bc78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xits"

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
texlive-scripts \
texlive-scripts-bin \
texlive-xits-fonts"

inherit rpm
