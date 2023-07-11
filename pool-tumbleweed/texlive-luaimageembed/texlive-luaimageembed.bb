SUMMARY = "Embed images as base64-encoded strings"
DESCRIPTION = "This package allows to embed images directly as base64-encoded \
strings into an LuaLaTeX document. This can be useful, e. g. to \
package a document with images into a single TeX file, or with \
automatically generated graphics."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn50788"

RPM_NAME = "texlive-luaimageembed-2023.208.0.0.1svn50788-53.1.noarch.rpm"
RPM_HASH = "bad283427b86fa71ee496553a9f207690d023c3e7294c66ace70d332046bf249c0cd0b1e1fe3f0833944adbae8effcb66732195d56359f25316d2bf2fc3d0809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaimageembed.sty \
texlive-luaimageembed"

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
