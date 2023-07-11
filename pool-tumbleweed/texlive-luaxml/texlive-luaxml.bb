SUMMARY = "Lua library for reading and serialising XML files"
DESCRIPTION = "LuaXML is a pure Lua library for reading and serializing XML \
files. The current release is aimed mainly at support for the \
odsfile package. The documentation was created by automatic \
conversion of original documentation in the source code."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1qsvn60709"

RPM_NAME = "texlive-luaxml-2023.208.0.0.1qsvn60709-53.1.noarch.rpm"
RPM_HASH = "0826b0ba727d3bb2c3cbd895008498c22972879433566c223c04a6c74dbaa5155f5ec06de2fa7c74742b804d7525d65a9bcfd4eefd0408d3a4bb38ea943d8406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaxml"

RDEPENDS:${PN} += "/usr/bin/lua \
/usr/bin/sh \
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
