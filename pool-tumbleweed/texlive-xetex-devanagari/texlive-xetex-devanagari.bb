SUMMARY = "XeTeX input map for Unicode Devanagari"
DESCRIPTION = "The package provides a map for use with Jonathan Kew's TECkit, \
to translate Devanagari (encoded according to the Harvard/Kyoto \
convention) to Unicode (range 0900-097F)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn34296"

RPM_NAME = "texlive-xetex-devanagari-2023.209.0.0.5svn34296-53.1.noarch.rpm"
RPM_HASH = "05ad439b85d2831f6e36e9a7d6fea928a8753dba5dfe137148a9f95a0f83b561c532b1265570087bc354098ae79e9acca7a5f837dd76d73cd491bdf18cdd8f11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-devanagarinumerals.map \
tex-harvardkyoto.map \
tex-iast.map \
tex-velthuis-sanskrit.map \
tex-velthuis.map \
texlive-xetex-devanagari"

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
