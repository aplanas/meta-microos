SUMMARY = "Convert a length into one with another unit"
DESCRIPTION = "This package defines two macros to convert a value with unit \
into one with another unit. Supported are all TeX related \
units, and also km and m. The output can be in scientic \
notation for large values. The package only works with \
LuaLaTeX!"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn55060"

RPM_NAME = "texlive-unitconv-2023.209.0.0.01svn55060-54.1.noarch.rpm"
RPM_HASH = "490bb60515b4219edf09c8865fcb22c745c1786443cc2bb617990cc28b987fdf3393e65aeae9cd86150c068b8bb883efd533ab8bdca1e723eebf6dc79e6c8344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unitconv.sty \
texlive-unitconv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-luacode.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
