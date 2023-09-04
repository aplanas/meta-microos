SUMMARY = "A Scientific Times-like font with support for mathematical typesetting"
DESCRIPTION = "XITS is a Times-like font for scientific typesetting with \
proper mathematical support for modern, Unicode and OpenType \
capable TeX engines, namely LuaTeX and XeTeX. For use with \
LuaLaTeX or XeLaTeX, support is available from the fontspec and \
unicode-math packages."
LICENSE = "OFL-1.1"

PV = "2023.209.1.302svn55730"

RPM_NAME = "texlive-xits-2023.209.1.302svn55730-53.2.noarch.rpm"
RPM_HASH = "4924d7de8d25eb3e48c3084f231e1ab773d5d656683943dd7eaeceb86945f34506d70eee480ef0576183182cfe55181f4911d6fb4f003f00a661ac9e227cfc2b"
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
