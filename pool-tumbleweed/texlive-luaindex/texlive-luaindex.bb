SUMMARY = "Create index using LuaLaTeX"
DESCRIPTION = "Luaindex provides (yet another) index processor, written in \
Lua."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1bsvn25882"

RPM_NAME = "texlive-luaindex-2023.208.0.0.1bsvn25882-53.1.noarch.rpm"
RPM_HASH = "da234b1c693ddc9b6b9d5da0985adca67b283f5733a8cb0d6608d4336653221ba890ec5f45bd34f26778d85c06dcfc7112dd36319b3ba92d523ec2bbc72da20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaindex.sty \
texlive-luaindex"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase-compat.sty \
tex-luatexbase-modutils.sty \
tex-scrbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
