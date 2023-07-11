SUMMARY = "A Scientific Times-like font with support for mathematical typesetting"
DESCRIPTION = "XITS is a Times-like font for scientific typesetting with \
proper mathematical support for modern, Unicode and OpenType \
capable TeX engines, namely LuaTeX and XeTeX. For use with \
LuaLaTeX or XeLaTeX, support is available from the fontspec and \
unicode-math packages."
LICENSE = "OFL-1.1"

PV = "2023.201.1.302svn55730"

RPM_NAME = "texlive-xits-2023.201.1.302svn55730-52.2.noarch.rpm"
RPM_HASH = "c5d75e389dc581740518a0c73e949aca4cf8d988c3346341da0f7a74b75d4cdcdf27e23b1b342f3a39038e2345420d5d6f0e467147309ff0ca0e0704810e9d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xits"

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
texlive-scripts-bin \
texlive-xits-fonts"

inherit rpm
