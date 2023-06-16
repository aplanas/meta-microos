SUMMARY = "A PSTricks backend for LuaLaTeX"
DESCRIPTION = "This package enables the use of PSTricks directly in LuaLaTeX \
documents, without invoking external programmes, by \
implementing a PostScript interpreter in Lua. Therefore it does \
not require shell escape to be enabled or special environments, \
and instead allows PSTricks to be used exactly like in dvips \
based documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn65913"

RPM_NAME = "texlive-luapstricks-2023.201.0.0.8svn65913-52.1.noarch.rpm"
RPM_HASH = "5fb2ec21a7731939be4cc94ee631d1580db12db90cfa1a93aaaa6b6e09a90f6c65ea5757eab73331eb389bc152305fe5118c37a8f79d78c508621880651df0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luapstricks"

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
texlive-luapstricks-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
