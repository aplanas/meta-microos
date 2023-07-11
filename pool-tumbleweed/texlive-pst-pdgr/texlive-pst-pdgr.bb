SUMMARY = "Draw medical pedigrees using PSTricks"
DESCRIPTION = "The package provides a set of macros based on PSTricks to draw \
medical pedigrees according to the recommendations for \
standardized human pedigree nomenclature. The drawing commands \
place the symbols on a pspicture canvas. An interface for \
making trees is also provided. The package may be used both \
with LaTeX and PlainTeX. A separate Perl program for generating \
TeX files from spreadsheets is available."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn45875"

RPM_NAME = "texlive-pst-pdgr-2023.201.0.0.4svn45875-53.2.noarch.rpm"
RPM_HASH = "403b297cb8fc247936e448d0804aac883538e0b7ebc5df263bd56663b2b9f532ca9aeea6fc2e646cfef791ecba8a2853acf4c33cf7cc60cdee6427e646d627a3"
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
