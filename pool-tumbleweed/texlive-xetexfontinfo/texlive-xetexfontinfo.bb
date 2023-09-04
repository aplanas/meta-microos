SUMMARY = "Report font features in XeTeX"
DESCRIPTION = "A pair of documents to reveal the font features supported by \
fonts usable in XeTeX. Use OpenType-info.tex for OpenType \
fonts, and AAT-info.tex for AAT fonts (Mac OS X only)."
LICENSE = "Apache-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-xetexfontinfo-2023.209.svn15878-53.2.noarch.rpm"
RPM_HASH = "bfb11f2058974496a33e2f2c892e85d25eece8d36e4a06e0181f2bd0799f007469f76f29a0ab634ae71f80a4fc1e14daa3eacadae29c64d72053cdcb82f895b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aat-info.tex \
tex-opentype-info.tex \
texlive-xetexfontinfo"

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
