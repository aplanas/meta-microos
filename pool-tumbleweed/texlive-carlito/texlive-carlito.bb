SUMMARY = "Support for Carlito sans-serif fonts"
DESCRIPTION = "The package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the Carlito family of sans serif fonts, designed by \
Lukasz Dziedzic of the tyPoland foundry and adopted by Google \
for ChromeOS as a font-metric compatible replacement for \
Calibri."
LICENSE = "OFL-1.1"

PV = "2023.201.svn64624"

RPM_NAME = "texlive-carlito-2023.201.svn64624-52.1.noarch.rpm"
RPM_HASH = "9791af77d610c07b4b1acb265079925d53b6daeaa3064a9af9a2d84fe878cee74f0689777f4a163ed39ac8dc4b7f9ece704cfab7a33896d43e9a534362418725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Crlt-Bold-inf-ly1.tfm) \
tex(Crlt-Bold-inf-ot1.tfm) \
tex(Crlt-Bold-inf-t1--base.tfm) \
tex(Crlt-Bold-inf-t1.tfm) \
tex(Crlt-Bold-inf-t1.vf) \
tex(Crlt-Bold-lf-ly1.tfm) \
tex(Crlt-Bold-lf-ot1.tfm) \
tex(Crlt-Bold-lf-t1--base.tfm) \
tex(Crlt-Bold-lf-t1.tfm) \
tex(Crlt-Bold-lf-t1.vf) \
tex(Crlt-Bold-lf-ts1--base.tfm) \
tex(Crlt-Bold-lf-ts1.tfm) \
tex(Crlt-Bold-lf-ts1.vf) \
tex(Crlt-Bold-osf-ly1.tfm) \
tex(Crlt-Bold-osf-ot1.tfm) \
tex(Crlt-Bold-osf-t1--base.tfm) \
tex(Crlt-Bold-osf-t1.tfm) \
tex(Crlt-Bold-osf-t1.vf) \
tex(Crlt-Bold-osf-ts1--base.tfm) \
tex(Crlt-Bold-osf-ts1.tfm) \
tex(Crlt-Bold-osf-ts1.vf) \
tex(Crlt-Bold-sup-ly1.tfm) \
tex(Crlt-Bold-sup-ot1.tfm) \
tex(Crlt-Bold-sup-t1--base.tfm) \
tex(Crlt-Bold-sup-t1.tfm) \
tex(Crlt-Bold-sup-t1.vf) \
tex(Crlt-Bold-tlf-ly1.tfm) \
tex(Crlt-Bold-tlf-ot1.tfm) \
tex(Crlt-Bold-tlf-t1--base.tfm) \
tex(Crlt-Bold-tlf-t1.tfm) \
tex(Crlt-Bold-tlf-t1.vf) \
tex(Crlt-Bold-tlf-ts1--base.tfm) \
tex(Crlt-Bold-tlf-ts1.tfm) \
tex(Crlt-Bold-tlf-ts1.vf) \
tex(Crlt-Bold-tosf-ly1.tfm) \
tex(Crlt-Bold-tosf-ot1.tfm) \
tex(Crlt-Bold-tosf-t1--base.tfm) \
tex(Crlt-Bold-tosf-t1.tfm) \
tex(Crlt-Bold-tosf-t1.vf) \
tex(Crlt-Bold-tosf-ts1--base.tfm) \
tex(Crlt-Bold-tosf-ts1.tfm) \
tex(Crlt-Bold-tosf-ts1.vf) \
tex(Crlt-BoldItalic-inf-ly1.tfm) \
tex(Crlt-BoldItalic-inf-ot1.tfm) \
tex(Crlt-BoldItalic-inf-t1--base.tfm) \
tex(Crlt-BoldItalic-inf-t1.tfm) \
tex(Crlt-BoldItalic-inf-t1.vf) \
tex(Crlt-BoldItalic-lf-ly1.tfm) \
tex(Crlt-BoldItalic-lf-ot1.tfm) \
tex(Crlt-BoldItalic-lf-t1--base.tfm) \
tex(Crlt-BoldItalic-lf-t1.tfm) \
tex(Crlt-BoldItalic-lf-t1.vf) \
tex(Crlt-BoldItalic-lf-ts1--base.tfm) \
tex(Crlt-BoldItalic-lf-ts1.tfm) \
tex(Crlt-BoldItalic-lf-ts1.vf) \
tex(Crlt-BoldItalic-osf-ly1.tfm) \
tex(Crlt-BoldItalic-osf-ot1.tfm) \
tex(Crlt-BoldItalic-osf-t1--base.tfm) \
tex(Crlt-BoldItalic-osf-t1.tfm) \
tex(Crlt-BoldItalic-osf-t1.vf) \
tex(Crlt-BoldItalic-osf-ts1--base.tfm) \
tex(Crlt-BoldItalic-osf-ts1.tfm) \
tex(Crlt-BoldItalic-osf-ts1.vf) \
tex(Crlt-BoldItalic-sup-ly1.tfm) \
tex(Crlt-BoldItalic-sup-ot1.tfm) \
tex(Crlt-BoldItalic-sup-t1--base.tfm) \
tex(Crlt-BoldItalic-sup-t1.tfm) \
tex(Crlt-BoldItalic-sup-t1.vf) \
tex(Crlt-BoldItalic-tlf-ly1.tfm) \
tex(Crlt-BoldItalic-tlf-ot1.tfm) \
tex(Crlt-BoldItalic-tlf-t1--base.tfm) \
tex(Crlt-BoldItalic-tlf-t1.tfm) \
tex(Crlt-BoldItalic-tlf-t1.vf) \
tex(Crlt-BoldItalic-tlf-ts1--base.tfm) \
tex(Crlt-BoldItalic-tlf-ts1.tfm) \
tex(Crlt-BoldItalic-tlf-ts1.vf) \
tex(Crlt-BoldItalic-tosf-ly1.tfm) \
tex(Crlt-BoldItalic-tosf-ot1.tfm) \
tex(Crlt-BoldItalic-tosf-t1--base.tfm) \
tex(Crlt-BoldItalic-tosf-t1.tfm) \
tex(Crlt-BoldItalic-tosf-t1.vf) \
tex(Crlt-BoldItalic-tosf-ts1--base.tfm) \
tex(Crlt-BoldItalic-tosf-ts1.tfm) \
tex(Crlt-BoldItalic-tosf-ts1.vf) \
tex(Crlt-Italic-inf-ly1.tfm) \
tex(Crlt-Italic-inf-ot1.tfm) \
tex(Crlt-Italic-inf-t1--base.tfm) \
tex(Crlt-Italic-inf-t1.tfm) \
tex(Crlt-Italic-inf-t1.vf) \
tex(Crlt-Italic-lf-ly1.tfm) \
tex(Crlt-Italic-lf-ot1.tfm) \
tex(Crlt-Italic-lf-t1--base.tfm) \
tex(Crlt-Italic-lf-t1.tfm) \
tex(Crlt-Italic-lf-t1.vf) \
tex(Crlt-Italic-lf-ts1--base.tfm) \
tex(Crlt-Italic-lf-ts1.tfm) \
tex(Crlt-Italic-lf-ts1.vf) \
tex(Crlt-Italic-osf-ly1.tfm) \
tex(Crlt-Italic-osf-ot1.tfm) \
tex(Crlt-Italic-osf-t1--base.tfm) \
tex(Crlt-Italic-osf-t1.tfm) \
tex(Crlt-Italic-osf-t1.vf) \
tex(Crlt-Italic-osf-ts1--base.tfm) \
tex(Crlt-Italic-osf-ts1.tfm) \
tex(Crlt-Italic-osf-ts1.vf) \
tex(Crlt-Italic-sup-ly1.tfm) \
tex(Crlt-Italic-sup-ot1.tfm) \
tex(Crlt-Italic-sup-t1--base.tfm) \
tex(Crlt-Italic-sup-t1.tfm) \
tex(Crlt-Italic-sup-t1.vf) \
tex(Crlt-Italic-tlf-ly1.tfm) \
tex(Crlt-Italic-tlf-ot1.tfm) \
tex(Crlt-Italic-tlf-t1--base.tfm) \
tex(Crlt-Italic-tlf-t1.tfm) \
tex(Crlt-Italic-tlf-t1.vf) \
tex(Crlt-Italic-tlf-ts1--base.tfm) \
tex(Crlt-Italic-tlf-ts1.tfm) \
tex(Crlt-Italic-tlf-ts1.vf) \
tex(Crlt-Italic-tosf-ly1.tfm) \
tex(Crlt-Italic-tosf-ot1.tfm) \
tex(Crlt-Italic-tosf-t1--base.tfm) \
tex(Crlt-Italic-tosf-t1.tfm) \
tex(Crlt-Italic-tosf-t1.vf) \
tex(Crlt-Italic-tosf-ts1--base.tfm) \
tex(Crlt-Italic-tosf-ts1.tfm) \
tex(Crlt-Italic-tosf-ts1.vf) \
tex(Crlt-inf-ly1.tfm) \
tex(Crlt-inf-ot1.tfm) \
tex(Crlt-inf-t1--base.tfm) \
tex(Crlt-inf-t1.tfm) \
tex(Crlt-inf-t1.vf) \
tex(Crlt-lf-ly1.tfm) \
tex(Crlt-lf-ot1.tfm) \
tex(Crlt-lf-t1--base.tfm) \
tex(Crlt-lf-t1.tfm) \
tex(Crlt-lf-t1.vf) \
tex(Crlt-lf-ts1--base.tfm) \
tex(Crlt-lf-ts1.tfm) \
tex(Crlt-lf-ts1.vf) \
tex(Crlt-osf-ly1.tfm) \
tex(Crlt-osf-ot1.tfm) \
tex(Crlt-osf-t1--base.tfm) \
tex(Crlt-osf-t1.tfm) \
tex(Crlt-osf-t1.vf) \
tex(Crlt-osf-ts1--base.tfm) \
tex(Crlt-osf-ts1.tfm) \
tex(Crlt-osf-ts1.vf) \
tex(Crlt-sup-ly1.tfm) \
tex(Crlt-sup-ot1.tfm) \
tex(Crlt-sup-t1--base.tfm) \
tex(Crlt-sup-t1.tfm) \
tex(Crlt-sup-t1.vf) \
tex(Crlt-tlf-ly1.tfm) \
tex(Crlt-tlf-ot1.tfm) \
tex(Crlt-tlf-t1--base.tfm) \
tex(Crlt-tlf-t1.tfm) \
tex(Crlt-tlf-t1.vf) \
tex(Crlt-tlf-ts1--base.tfm) \
tex(Crlt-tlf-ts1.tfm) \
tex(Crlt-tlf-ts1.vf) \
tex(Crlt-tosf-ly1.tfm) \
tex(Crlt-tosf-ot1.tfm) \
tex(Crlt-tosf-t1--base.tfm) \
tex(Crlt-tosf-t1.tfm) \
tex(Crlt-tosf-t1.vf) \
tex(Crlt-tosf-ts1--base.tfm) \
tex(Crlt-tosf-ts1.tfm) \
tex(Crlt-tosf-ts1.vf) \
tex(LY1Crlt-Inf.fd) \
tex(LY1Crlt-LF.fd) \
tex(LY1Crlt-OsF.fd) \
tex(LY1Crlt-Sup.fd) \
tex(LY1Crlt-TLF.fd) \
tex(LY1Crlt-TOsF.fd) \
tex(OT1Crlt-Inf.fd) \
tex(OT1Crlt-LF.fd) \
tex(OT1Crlt-OsF.fd) \
tex(OT1Crlt-Sup.fd) \
tex(OT1Crlt-TLF.fd) \
tex(OT1Crlt-TOsF.fd) \
tex(T1Crlt-Inf.fd) \
tex(T1Crlt-LF.fd) \
tex(T1Crlt-OsF.fd) \
tex(T1Crlt-Sup.fd) \
tex(T1Crlt-TLF.fd) \
tex(T1Crlt-TOsF.fd) \
tex(TS1Crlt-LF.fd) \
tex(TS1Crlt-OsF.fd) \
tex(TS1Crlt-TLF.fd) \
tex(TS1Crlt-TOsF.fd) \
tex(carlito.map) \
tex(carlito.sty) \
tex(crlt_7oxnun.enc) \
tex(crlt_diffle.enc) \
tex(crlt_du3rrv.enc) \
tex(crlt_egrrry.enc) \
tex(crlt_ggvanz.enc) \
tex(crlt_hsqwq5.enc) \
tex(crlt_j4hweq.enc) \
tex(crlt_kvbpjz.enc) \
tex(crlt_ln7ww5.enc) \
tex(crlt_lu4jub.enc) \
tex(crlt_nhqtbp.enc) \
tex(crlt_nnew6j.enc) \
tex(crlt_qnx4q4.enc) \
tex(crlt_shvaqa.enc) \
tex(crlt_toeewq.enc) \
tex(crlt_tqddrq.enc) \
tex(crlt_txfnxl.enc) \
tex(crlt_ys3vdn.enc) \
tex(crlt_zisnlb.enc) \
tex(crlt_zmzg5w.enc) \
texlive-carlito"
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
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-carlito-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm