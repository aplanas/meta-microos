SUMMARY = "Low-level mplib integration for LuaTeX"
DESCRIPTION = "This package offers low-level mplib integration for plain \
LuaTeX and is designed with the purpose of being easy to \
extend. The use of multiple simultaneous MetaPost instances is \
supported, as well as running TeX or lua code from within \
MetaPost. With the included minim-mp format file, you can even \
use LuaTeX as a stand-alone MetaPost compiler."
LICENSE = "LPPL-1.0"

PV = "2023.209.2023_1.2svn66395"

RPM_NAME = "texlive-minim-mp-2023.209.2023_1.2svn66395-55.1.noarch.rpm"
RPM_HASH = "441026bfafe1b4f40c25329fde4af01132301045cb096e7913a57943060909bec73c197834e242a79a80e65b896b74efc64892cfa2922a075be409233d154e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minim-mp.tex \
texlive-minim-mp"

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
