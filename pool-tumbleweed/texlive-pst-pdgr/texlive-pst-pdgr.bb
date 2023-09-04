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

RPM_NAME = "texlive-pst-pdgr-2023.209.0.0.4svn45875-54.2.noarch.rpm"
RPM_HASH = "6cee228d8755622d9adc814959baa15c87b12a049bb3ddfd7f11df24d1334c055dfceb353b06051a652e10eefb609a3e6ba7b232a5b343f447127bf090de2b92"
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
