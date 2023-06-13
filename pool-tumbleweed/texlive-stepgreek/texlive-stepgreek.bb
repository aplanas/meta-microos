SUMMARY = "A free Times/Elsevier-style Greek font"
DESCRIPTION = "This is a beta version of the STEP Greek font. Only a regular \
face is available at present, though there are plans to add \
italic, bold and bold italic in the future. The font only \
supports LGR in TeX and is meant to serve as a Greek complement \
to a Times-like font such as STEP. The font supports polytonic \
Greek."
LICENSE = "OFL-1.1"

PV = "2023.201.3.0b1svn57074"

RPM_NAME = "texlive-stepgreek-2023.201.3.0b1svn57074-57.1.noarch.rpm"
RPM_HASH = "d493f06898c9ee0818d7e47c8516fbfc7704989be4ac3f147a4739bd7f9420cd85bbb69408244b73779d3f362e6d5f5e4751051f010caa4b9c22a8f210784fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LGRSTEPGreekTest-Sup.fd) \
tex(LGRSTEPGreekTest-TLF.fd) \
tex(LGRSTEPGreekTest-TOsF.fd) \
tex(STEPGreekTest-Regular-sup-lgr--base.tfm) \
tex(STEPGreekTest-Regular-sup-lgr.tfm) \
tex(STEPGreekTest-Regular-sup-lgr.vf) \
tex(STEPGreekTest-Regular-tlf-lgr--base.tfm) \
tex(STEPGreekTest-Regular-tlf-lgr.tfm) \
tex(STEPGreekTest-Regular-tlf-lgr.vf) \
tex(STEPGreekTest-Regular-tlf-sc-lgr--base.tfm) \
tex(STEPGreekTest-Regular-tlf-sc-lgr.tfm) \
tex(STEPGreekTest-Regular-tlf-sc-lgr.vf) \
tex(STEPGreekTest-Regular-tosf-lgr--base.tfm) \
tex(STEPGreekTest-Regular-tosf-lgr.tfm) \
tex(STEPGreekTest-Regular-tosf-lgr.vf) \
tex(STEPGreekTest-Regular-tosf-sc-lgr--base.tfm) \
tex(STEPGreekTest-Regular-tosf-sc-lgr.tfm) \
tex(STEPGreekTest-Regular-tosf-sc-lgr.vf) \
tex(STEPGreekTest.map) \
tex(a_ewwrtj.enc) \
tex(a_ntxmjl.enc) \
tex(a_uo326q.enc) \
tex(a_voidup.enc) \
tex(a_wkkjyg.enc) \
texlive-stepgreek"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-stepgreek-fonts"

inherit rpm
