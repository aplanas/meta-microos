SUMMARY = "Report font features in XeTeX"
DESCRIPTION = "A pair of documents to reveal the font features supported by \
fonts usable in XeTeX. Use OpenType-info.tex for OpenType \
fonts, and AAT-info.tex for AAT fonts (Mac OS X only)."
LICENSE = "Apache-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-xetexfontinfo-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "316e3ac273afcf62cb2ce03c39246afabb291210db44b49fc63466a05ee083f89c25db4b5c92ac018879b1be4e8775ceb30790c8814d38da3f9eab1d771a74ec"
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
