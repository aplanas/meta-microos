SUMMARY = "Embed images as base64-encoded strings"
DESCRIPTION = "This package allows to embed images directly as base64-encoded \
strings into an LuaLaTeX document. This can be useful, e. g. to \
package a document with images into a single TeX file, or with \
automatically generated graphics."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn50788"

RPM_NAME = "texlive-luaimageembed-2023.201.0.0.1svn50788-52.1.noarch.rpm"
RPM_HASH = "c79796822e751252e0c7316e8c872a1ca20b85f838e640758834940b8b1d283dd54811a7713d7aa00230d8a1c87a84cb049970087090b7d55535061dd9ab1431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luaimageembed.sty) \
texlive-luaimageembed"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(luacode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
