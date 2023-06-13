SUMMARY = "Low-level mplib integration for LuaTeX"
DESCRIPTION = "This package offers low-level mplib integration for plain \
LuaTeX and is designed with the purpose of being easy to \
extend. The use of multiple simultaneous MetaPost instances is \
supported, as well as running TeX or lua code from within \
MetaPost. With the included minim-mp format file, you can even \
use LuaTeX as a stand-alone MetaPost compiler."
LICENSE = "LPPL-1.0"

PV = "2023.201.2023_1.2svn66395"

RPM_NAME = "texlive-minim-mp-2023.201.2023_1.2svn66395-54.1.noarch.rpm"
RPM_HASH = "b3edd6225378163373ec027450be1fe001f41c0e957ffc0ba7d0346c780e1b0ba831df8898dc27939b0299a29d9efd0eb907d73486d0e22cbb69176c2593a305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(minim-mp.tex) \
texlive-minim-mp"

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
texlive-scripts-bin"

inherit rpm
