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

RPM_NAME = "texlive-pst-pdgr-2023.201.0.0.4svn45875-53.1.noarch.rpm"
RPM_HASH = "0330895ab2a958b2f7ab6495fd7451ad4571e1de2c80ecdb74c7e8a6233600ff0eaa3aea4658d41054f9cfa785746030c5b68120c4110d09d0ce0fe1cb6f7158"
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
