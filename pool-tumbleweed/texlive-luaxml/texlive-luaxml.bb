SUMMARY = "Lua library for reading and serialising XML files"
DESCRIPTION = "LuaXML is a pure Lua library for reading and serializing XML \
files. The current release is aimed mainly at support for the \
odsfile package. The documentation was created by automatic \
conversion of original documentation in the source code."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1qsvn60709"

RPM_NAME = "texlive-luaxml-2023.201.0.0.1qsvn60709-52.1.noarch.rpm"
RPM_HASH = "79d08e70841910589a3b9cac0d5377057965f9ee4c7e80d11c0ce27fb96eeaf4294ee006a38195a126b68d54bf8e309dc32c47e9c8e6e2430ea39c7e863196de"
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
