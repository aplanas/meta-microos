SUMMARY = "Convert a length into one with another unit"
DESCRIPTION = "This package defines two macros to convert a value with unit \
into one with another unit. Supported are all TeX related \
units, and also km and m. The output can be in scientic \
notation for large values. The package only works with \
LuaLaTeX!"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn55060"

RPM_NAME = "texlive-unitconv-2023.201.0.0.01svn55060-53.1.noarch.rpm"
RPM_HASH = "df3c101e41d90c1a646dad66e1170a55da3172284ffe075b6aedce853e56aeea61dcaabd20512ec34abb6237be0a84cfed2db2310b052f2dcc13a858a57e9dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unitconv.sty) \
texlive-unitconv"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(luacode.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
