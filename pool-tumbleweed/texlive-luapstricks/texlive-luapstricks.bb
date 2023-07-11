SUMMARY = "A PSTricks backend for LuaLaTeX"
DESCRIPTION = "This package enables the use of PSTricks directly in LuaLaTeX \
documents, without invoking external programmes, by \
implementing a PostScript interpreter in Lua. Therefore it does \
not require shell escape to be enabled or special environments, \
and instead allows PSTricks to be used exactly like in dvips \
based documents."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.8svn65913"

RPM_NAME = "texlive-luapstricks-2023.208.0.0.8svn65913-53.1.noarch.rpm"
RPM_HASH = "de7997d798c2c5b3ff6adc4e14b23b988164a4e3f1989840ca4e74da3ecdde764c1f9f7966287fa626425dc75d92bf8db1f8fc352e621f7b982c864ca49abda5"
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
