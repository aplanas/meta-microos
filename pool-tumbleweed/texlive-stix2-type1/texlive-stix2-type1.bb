SUMMARY = "Type1 versions of the STIX Two OpenType fonts"
DESCRIPTION = "The stix2 package provides minimal support for using the STIX \
Two fonts with versions of TeX that are limited to TFM files, \
Type 1 PostScript fonts, and 8-bit font encodings. Version \
2.0.0 of the STIX fonts are being released in this format in \
hopes of easing the transition from legacy TeX engines to \
modern fully Unicode-compatible systems. The Type 1 versions \
are merely a repackaging of the original OpenType versions and \
should not be viewed as independent entities. Some glyphs that \
are traditionally available in TeX math fonts are not yet \
available in the STIX Two OpenType fonts. In such cases, we \
have chosen to omit them from the stix2 package rather than \
create incompatibilities between the OpenType and Type 1 \
versions. In addition, while development of the OpenType \
versions is ongoing, no further updates are planned to the Type \
1 versions of the fonts."
LICENSE = "OFL-1.1"

PV = "2023.201.2.0.2svn57448"

RPM_NAME = "texlive-stix2-type1-2023.201.2.0.2svn57448-57.1.noarch.rpm"
RPM_HASH = "4b97c887702537c29a3658f7257e7cd8f1eb7c9140e226e6283b797bacf1e3feed393edf090efe95b2a30c99d98b35e205813edc2e98585d6a06a5222def2876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ls1stix2.fd) \
tex(ls1stix2bb.fd) \
tex(ls1stix2frak.fd) \
tex(ls1stix2scr.fd) \
tex(ls1stix2sf.fd) \
tex(ls2stix2.fd) \
tex(ls2stix2cal.fd) \
tex(ls2stix2ex.fd) \
tex(ls2stix2tt.fd) \
tex(ot1-stix2text-bold.tfm) \
tex(ot1-stix2text-bolditalic.tfm) \
tex(ot1-stix2text-italic.tfm) \
tex(ot1-stix2text.tfm) \
tex(ot1-stix2textsc-bold.tfm) \
tex(ot1-stix2textsc.tfm) \
tex(ot1stix2.fd) \
tex(ot2-stix2text-bold.tfm) \
tex(ot2-stix2text-bolditalic.tfm) \
tex(ot2-stix2text-italic.tfm) \
tex(ot2-stix2text.tfm) \
tex(ot2-stix2textsc-bold.tfm) \
tex(ot2-stix2textsc.tfm) \
tex(ot2stix2.fd) \
tex(stix2-mathbb.enc) \
tex(stix2-mathbb.tfm) \
tex(stix2-mathbbit.enc) \
tex(stix2-mathbbit.tfm) \
tex(stix2-mathcal.enc) \
tex(stix2-mathcal.tfm) \
tex(stix2-mathex.enc) \
tex(stix2-mathex.tfm) \
tex(stix2-mathfrak-bold.enc) \
tex(stix2-mathfrak-bold.tfm) \
tex(stix2-mathfrak.enc) \
tex(stix2-mathfrak.tfm) \
tex(stix2-mathit-bold.enc) \
tex(stix2-mathit-bold.tfm) \
tex(stix2-mathit.enc) \
tex(stix2-mathit.tfm) \
tex(stix2-mathrm-bold.enc) \
tex(stix2-mathrm-bold.tfm) \
tex(stix2-mathrm.enc) \
tex(stix2-mathrm.tfm) \
tex(stix2-mathscr-bold.enc) \
tex(stix2-mathscr-bold.tfm) \
tex(stix2-mathscr.enc) \
tex(stix2-mathscr.tfm) \
tex(stix2-mathsf-bold.enc) \
tex(stix2-mathsf-bold.tfm) \
tex(stix2-mathsf.enc) \
tex(stix2-mathsf.tfm) \
tex(stix2-mathsfit-bold.enc) \
tex(stix2-mathsfit-bold.tfm) \
tex(stix2-mathsfit.enc) \
tex(stix2-mathsfit.tfm) \
tex(stix2-mathtt.enc) \
tex(stix2-mathtt.tfm) \
tex(stix2-ot1.enc) \
tex(stix2-ot1sc.enc) \
tex(stix2-ot2.enc) \
tex(stix2-ot2sc.enc) \
tex(stix2-t1.enc) \
tex(stix2-t1sc.enc) \
tex(stix2-ts1.enc) \
tex(stix2.map) \
tex(stix2.sty) \
tex(t1-stix2text-bold.tfm) \
tex(t1-stix2text-bolditalic.tfm) \
tex(t1-stix2text-italic.tfm) \
tex(t1-stix2text.tfm) \
tex(t1-stix2textsc-bold.tfm) \
tex(t1-stix2textsc.tfm) \
tex(t1stix2.fd) \
tex(ts1-stix2text-bold.tfm) \
tex(ts1-stix2text-bolditalic.tfm) \
tex(ts1-stix2text-italic.tfm) \
tex(ts1-stix2text.tfm) \
tex(ts1stix2.fd) \
texlive-stix2-type1"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(textcomp.sty) \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-stix2-type1-fonts"

inherit rpm
