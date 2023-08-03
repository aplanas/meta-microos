SUMMARY = "Automatically generate truth tables for given variables and statements"
DESCRIPTION = "This LuaLaTeX package permits to automatically generate truth \
tables given a table header. It supports a number of logical \
operations which can be combined as needed. It is built upon \
the luacode package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.2svn60717"

RPM_NAME = "texlive-truthtable-2023.209.0.0.0.2svn60717-53.1.noarch.rpm"
RPM_HASH = "eaed99313492bcd0e4d59a8fba049eb04fcf83b7e8e663854bd766daaa6fdd9248a2274a6708a290f5c2044edd2b7a55e3e596c74d94794995f71b97c78c603f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-truthtable.sty \
texlive-truthtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
