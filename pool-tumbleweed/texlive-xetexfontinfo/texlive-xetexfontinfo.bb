SUMMARY = "Report font features in XeTeX"
DESCRIPTION = "A pair of documents to reveal the font features supported by \
fonts usable in XeTeX. Use OpenType-info.tex for OpenType \
fonts, and AAT-info.tex for AAT fonts (Mac OS X only)."
LICENSE = "Apache-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-xetexfontinfo-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "3b6c1d62a37e0fca8421a876d6b337aeacd417eceed31a4d949dee0f6fcf24213f5f1804a1ae41aab68ab9c4915b68f8bea804189cced47517f0e92e61d1cb4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aat-info.tex \
tex-opentype-info.tex \
texlive-xetexfontinfo"

RDEPENDS:${PN} += "/bin/sh \
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
