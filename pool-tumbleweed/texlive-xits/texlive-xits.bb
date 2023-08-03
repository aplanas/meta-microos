SUMMARY = "A Scientific Times-like font with support for mathematical typesetting"
DESCRIPTION = "XITS is a Times-like font for scientific typesetting with \
proper mathematical support for modern, Unicode and OpenType \
capable TeX engines, namely LuaTeX and XeTeX. For use with \
LuaLaTeX or XeLaTeX, support is available from the fontspec and \
unicode-math packages."
LICENSE = "OFL-1.1"

PV = "2023.209.1.302svn55730"

RPM_NAME = "texlive-xits-2023.209.1.302svn55730-53.1.noarch.rpm"
RPM_HASH = "e73770fade3b017bffca4b1e64d03580af65ede41c76063f47598f1deec35bf23be4604de4c54f55f04256f25c70499dfe9f0a4f5f9d73e7a71390e96cff5055"
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
