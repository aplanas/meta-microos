SUMMARY = "Draw medical pedigrees using PSTricks"
DESCRIPTION = "The package provides a set of macros based on PSTricks to draw \
medical pedigrees according to the recommendations for \
standardized human pedigree nomenclature. The drawing commands \
place the symbols on a pspicture canvas. An interface for \
making trees is also provided. The package may be used both \
with LaTeX and PlainTeX. A separate Perl program for generating \
TeX files from spreadsheets is available."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn45875"

RPM_NAME = "texlive-pst-pdgr-2023.209.0.0.4svn45875-54.1.noarch.rpm"
RPM_HASH = "5bc68f82258385e1460db29e94698caaffaf7381a42fd8d9d6f63843c13be9ff24c41cf48547a590abb639f78580216352831d4d080bf67c4f39e9e8eb62e2aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-pdgr.cfg \
tex-pst-pdgr.sty \
tex-pst-pdgr.tex \
texlive-pst-pdgr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
