SUMMARY = "A free Times/Elsevier-style Greek font"
DESCRIPTION = "This is a beta version of the STEP Greek font. Only a regular \
face is available at present, though there are plans to add \
italic, bold and bold italic in the future. The font only \
supports LGR in TeX and is meant to serve as a Greek complement \
to a Times-like font such as STEP. The font supports polytonic \
Greek."
LICENSE = "OFL-1.1"

PV = "2023.209.3.0b1svn57074"

RPM_NAME = "texlive-stepgreek-2023.209.3.0b1svn57074-58.1.noarch.rpm"
RPM_HASH = "b93880aa29061c9a7fbfcdeebada9086e7ef4c6a39c90f4e7b11e57948f6a6ba2ce705b7e5cc4355283abb623c15df9af33e4ad6ee3390f16443c680250f935e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LGRSTEPGreekTest-Sup.fd \
tex-LGRSTEPGreekTest-TLF.fd \
tex-LGRSTEPGreekTest-TOsF.fd \
tex-STEPGreekTest-Regular-sup-lgr--base.tfm \
tex-STEPGreekTest-Regular-sup-lgr.tfm \
tex-STEPGreekTest-Regular-sup-lgr.vf \
tex-STEPGreekTest-Regular-tlf-lgr--base.tfm \
tex-STEPGreekTest-Regular-tlf-lgr.tfm \
tex-STEPGreekTest-Regular-tlf-lgr.vf \
tex-STEPGreekTest-Regular-tlf-sc-lgr--base.tfm \
tex-STEPGreekTest-Regular-tlf-sc-lgr.tfm \
tex-STEPGreekTest-Regular-tlf-sc-lgr.vf \
tex-STEPGreekTest-Regular-tosf-lgr--base.tfm \
tex-STEPGreekTest-Regular-tosf-lgr.tfm \
tex-STEPGreekTest-Regular-tosf-lgr.vf \
tex-STEPGreekTest-Regular-tosf-sc-lgr--base.tfm \
tex-STEPGreekTest-Regular-tosf-sc-lgr.tfm \
tex-STEPGreekTest-Regular-tosf-sc-lgr.vf \
tex-STEPGreekTest.map \
tex-a-ewwrtj.enc \
tex-a-ntxmjl.enc \
tex-a-uo326q.enc \
tex-a-voidup.enc \
tex-a-wkkjyg.enc \
texlive-stepgreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-stepgreek-fonts"

inherit rpm
