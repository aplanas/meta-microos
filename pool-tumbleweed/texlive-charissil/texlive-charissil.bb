SUMMARY = "CharisSIL fonts with support for all LaTeX engines"
DESCRIPTION = "This package provides the CharisSIL family of fonts adapted by \
SIL International from Bitstream Charter in TrueType format, \
with support for LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX."
LICENSE = "OFL-1.1"

PV = "2023.201.6.101svn64998"

RPM_NAME = "texlive-charissil-2023.201.6.101svn64998-53.1.noarch.rpm"
RPM_HASH = "9e0b163259cfde48da70db89cc6ebae92a591e3cc6723414e529ec1a2f090313b89e005ddbdecafaac7204127ce1e9bd524a5a28342738883b39da9ec1f94abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(CharisSIL.sty) \
tex(LY1charssil-TLF.fd) \
tex(OT1charssil-TLF.fd) \
tex(T1charssil-TLF.fd) \
tex(T2Acharssil-TLF.fd) \
tex(T2Bcharssil-TLF.fd) \
tex(T2Ccharssil-TLF.fd) \
tex(TS1charssil-TLF.fd) \
tex(a_26lu5p.enc) \
tex(a_7qkcho.enc) \
tex(a_byetuc.enc) \
tex(a_fhbboz.enc) \
tex(a_fr2ebm.enc) \
tex(a_jf3wr2.enc) \
tex(a_l6xsmm.enc) \
tex(a_liimvs.enc) \
tex(a_lxhc3o.enc) \
tex(a_rflyh3.enc) \
tex(a_x7dpvy.enc) \
tex(a_yszurh.enc) \
tex(a_zn43lu.enc) \
tex(charssil-Bold-tlf-ly1.tfm) \
tex(charssil-Bold-tlf-ot1.tfm) \
tex(charssil-Bold-tlf-sc-ly1--base.tfm) \
tex(charssil-Bold-tlf-sc-ly1.tfm) \
tex(charssil-Bold-tlf-sc-ly1.vf) \
tex(charssil-Bold-tlf-sc-ot1--base.tfm) \
tex(charssil-Bold-tlf-sc-ot1.tfm) \
tex(charssil-Bold-tlf-sc-ot1.vf) \
tex(charssil-Bold-tlf-sc-t1--base.tfm) \
tex(charssil-Bold-tlf-sc-t1.tfm) \
tex(charssil-Bold-tlf-sc-t1.vf) \
tex(charssil-Bold-tlf-sc-t2a--base.tfm) \
tex(charssil-Bold-tlf-sc-t2a.tfm) \
tex(charssil-Bold-tlf-sc-t2a.vf) \
tex(charssil-Bold-tlf-sc-t2b--base.tfm) \
tex(charssil-Bold-tlf-sc-t2b.tfm) \
tex(charssil-Bold-tlf-sc-t2b.vf) \
tex(charssil-Bold-tlf-sc-t2c--base.tfm) \
tex(charssil-Bold-tlf-sc-t2c.tfm) \
tex(charssil-Bold-tlf-sc-t2c.vf) \
tex(charssil-Bold-tlf-t1--base.tfm) \
tex(charssil-Bold-tlf-t1.tfm) \
tex(charssil-Bold-tlf-t1.vf) \
tex(charssil-Bold-tlf-t2a.tfm) \
tex(charssil-Bold-tlf-t2b.tfm) \
tex(charssil-Bold-tlf-t2c.tfm) \
tex(charssil-Bold-tlf-ts1--base.tfm) \
tex(charssil-Bold-tlf-ts1.tfm) \
tex(charssil-Bold-tlf-ts1.vf) \
tex(charssil-BoldItalic-tlf-ly1.tfm) \
tex(charssil-BoldItalic-tlf-ot1.tfm) \
tex(charssil-BoldItalic-tlf-sc-ly1--base.tfm) \
tex(charssil-BoldItalic-tlf-sc-ly1.tfm) \
tex(charssil-BoldItalic-tlf-sc-ly1.vf) \
tex(charssil-BoldItalic-tlf-sc-ot1--base.tfm) \
tex(charssil-BoldItalic-tlf-sc-ot1.tfm) \
tex(charssil-BoldItalic-tlf-sc-ot1.vf) \
tex(charssil-BoldItalic-tlf-sc-t1--base.tfm) \
tex(charssil-BoldItalic-tlf-sc-t1.tfm) \
tex(charssil-BoldItalic-tlf-sc-t1.vf) \
tex(charssil-BoldItalic-tlf-sc-t2a--base.tfm) \
tex(charssil-BoldItalic-tlf-sc-t2a.tfm) \
tex(charssil-BoldItalic-tlf-sc-t2a.vf) \
tex(charssil-BoldItalic-tlf-sc-t2b--base.tfm) \
tex(charssil-BoldItalic-tlf-sc-t2b.tfm) \
tex(charssil-BoldItalic-tlf-sc-t2b.vf) \
tex(charssil-BoldItalic-tlf-sc-t2c--base.tfm) \
tex(charssil-BoldItalic-tlf-sc-t2c.tfm) \
tex(charssil-BoldItalic-tlf-sc-t2c.vf) \
tex(charssil-BoldItalic-tlf-t1--base.tfm) \
tex(charssil-BoldItalic-tlf-t1.tfm) \
tex(charssil-BoldItalic-tlf-t1.vf) \
tex(charssil-BoldItalic-tlf-t2a.tfm) \
tex(charssil-BoldItalic-tlf-t2b.tfm) \
tex(charssil-BoldItalic-tlf-t2c.tfm) \
tex(charssil-BoldItalic-tlf-ts1--base.tfm) \
tex(charssil-BoldItalic-tlf-ts1.tfm) \
tex(charssil-BoldItalic-tlf-ts1.vf) \
tex(charssil-Italic-tlf-ly1.tfm) \
tex(charssil-Italic-tlf-ot1.tfm) \
tex(charssil-Italic-tlf-sc-ly1--base.tfm) \
tex(charssil-Italic-tlf-sc-ly1.tfm) \
tex(charssil-Italic-tlf-sc-ly1.vf) \
tex(charssil-Italic-tlf-sc-ot1--base.tfm) \
tex(charssil-Italic-tlf-sc-ot1.tfm) \
tex(charssil-Italic-tlf-sc-ot1.vf) \
tex(charssil-Italic-tlf-sc-t1--base.tfm) \
tex(charssil-Italic-tlf-sc-t1.tfm) \
tex(charssil-Italic-tlf-sc-t1.vf) \
tex(charssil-Italic-tlf-sc-t2a--base.tfm) \
tex(charssil-Italic-tlf-sc-t2a.tfm) \
tex(charssil-Italic-tlf-sc-t2a.vf) \
tex(charssil-Italic-tlf-sc-t2b--base.tfm) \
tex(charssil-Italic-tlf-sc-t2b.tfm) \
tex(charssil-Italic-tlf-sc-t2b.vf) \
tex(charssil-Italic-tlf-sc-t2c--base.tfm) \
tex(charssil-Italic-tlf-sc-t2c.tfm) \
tex(charssil-Italic-tlf-sc-t2c.vf) \
tex(charssil-Italic-tlf-t1--base.tfm) \
tex(charssil-Italic-tlf-t1.tfm) \
tex(charssil-Italic-tlf-t1.vf) \
tex(charssil-Italic-tlf-t2a.tfm) \
tex(charssil-Italic-tlf-t2b.tfm) \
tex(charssil-Italic-tlf-t2c.tfm) \
tex(charssil-Italic-tlf-ts1--base.tfm) \
tex(charssil-Italic-tlf-ts1.tfm) \
tex(charssil-Italic-tlf-ts1.vf) \
tex(charssil-tlf-ly1.tfm) \
tex(charssil-tlf-ot1.tfm) \
tex(charssil-tlf-sc-ly1--base.tfm) \
tex(charssil-tlf-sc-ly1.tfm) \
tex(charssil-tlf-sc-ly1.vf) \
tex(charssil-tlf-sc-ot1--base.tfm) \
tex(charssil-tlf-sc-ot1.tfm) \
tex(charssil-tlf-sc-ot1.vf) \
tex(charssil-tlf-sc-t1--base.tfm) \
tex(charssil-tlf-sc-t1.tfm) \
tex(charssil-tlf-sc-t1.vf) \
tex(charssil-tlf-sc-t2a--base.tfm) \
tex(charssil-tlf-sc-t2a.tfm) \
tex(charssil-tlf-sc-t2a.vf) \
tex(charssil-tlf-sc-t2b--base.tfm) \
tex(charssil-tlf-sc-t2b.tfm) \
tex(charssil-tlf-sc-t2b.vf) \
tex(charssil-tlf-sc-t2c--base.tfm) \
tex(charssil-tlf-sc-t2c.tfm) \
tex(charssil-tlf-sc-t2c.vf) \
tex(charssil-tlf-t1--base.tfm) \
tex(charssil-tlf-t1.tfm) \
tex(charssil-tlf-t1.vf) \
tex(charssil-tlf-t2a.tfm) \
tex(charssil-tlf-t2b.tfm) \
tex(charssil-tlf-t2c.tfm) \
tex(charssil-tlf-ts1--base.tfm) \
tex(charssil-tlf-ts1.tfm) \
tex(charssil-tlf-ts1.vf) \
tex(charssil.map) \
texlive-charissil"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontaxes.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(mweights.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-charissil-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
