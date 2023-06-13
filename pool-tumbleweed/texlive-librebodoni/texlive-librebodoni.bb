SUMMARY = "Libre Bodoni fonts with LaTeX support"
DESCRIPTION = "The Libre Bodoni fonts are designed by Pablo Impallari and \
Rodrigo Fuenzalida, based on the 19th century Morris Fuller \
Benton's."
LICENSE = "OFL-1.1"

PV = "2023.201.svn64431"

RPM_NAME = "texlive-librebodoni-2023.201.svn64431-54.1.noarch.rpm"
RPM_HASH = "01ca4955af1c6f36f9c6a777eb14a627b31a03f9e9d83dfee2c9a6831d186836dcefe5e39738d15032b474b4a1fb9ecee4b7b82b553e2d54d9226e45593981b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LY1LibreBodoni-Inf.fd) \
tex(LY1LibreBodoni-Sup.fd) \
tex(LY1LibreBodoni-TLF.fd) \
tex(LibreBodoni-Bold-inf-ly1--base.tfm) \
tex(LibreBodoni-Bold-inf-ly1.tfm) \
tex(LibreBodoni-Bold-inf-ly1.vf) \
tex(LibreBodoni-Bold-inf-ot1.tfm) \
tex(LibreBodoni-Bold-inf-t1--base.tfm) \
tex(LibreBodoni-Bold-inf-t1.tfm) \
tex(LibreBodoni-Bold-inf-t1.vf) \
tex(LibreBodoni-Bold-sup-ly1--base.tfm) \
tex(LibreBodoni-Bold-sup-ly1.tfm) \
tex(LibreBodoni-Bold-sup-ly1.vf) \
tex(LibreBodoni-Bold-sup-ot1.tfm) \
tex(LibreBodoni-Bold-sup-t1--base.tfm) \
tex(LibreBodoni-Bold-sup-t1.tfm) \
tex(LibreBodoni-Bold-sup-t1.vf) \
tex(LibreBodoni-Bold-tlf-ly1--base.tfm) \
tex(LibreBodoni-Bold-tlf-ly1.tfm) \
tex(LibreBodoni-Bold-tlf-ly1.vf) \
tex(LibreBodoni-Bold-tlf-ot1.tfm) \
tex(LibreBodoni-Bold-tlf-t1--base.tfm) \
tex(LibreBodoni-Bold-tlf-t1.tfm) \
tex(LibreBodoni-Bold-tlf-t1.vf) \
tex(LibreBodoni-Bold-tlf-ts1--base.tfm) \
tex(LibreBodoni-Bold-tlf-ts1.tfm) \
tex(LibreBodoni-Bold-tlf-ts1.vf) \
tex(LibreBodoni-BoldItalic-inf-ly1--base.tfm) \
tex(LibreBodoni-BoldItalic-inf-ly1.tfm) \
tex(LibreBodoni-BoldItalic-inf-ly1.vf) \
tex(LibreBodoni-BoldItalic-inf-ot1.tfm) \
tex(LibreBodoni-BoldItalic-inf-t1--base.tfm) \
tex(LibreBodoni-BoldItalic-inf-t1.tfm) \
tex(LibreBodoni-BoldItalic-inf-t1.vf) \
tex(LibreBodoni-BoldItalic-sup-ly1--base.tfm) \
tex(LibreBodoni-BoldItalic-sup-ly1.tfm) \
tex(LibreBodoni-BoldItalic-sup-ly1.vf) \
tex(LibreBodoni-BoldItalic-sup-ot1.tfm) \
tex(LibreBodoni-BoldItalic-sup-t1--base.tfm) \
tex(LibreBodoni-BoldItalic-sup-t1.tfm) \
tex(LibreBodoni-BoldItalic-sup-t1.vf) \
tex(LibreBodoni-BoldItalic-tlf-ly1--base.tfm) \
tex(LibreBodoni-BoldItalic-tlf-ly1.tfm) \
tex(LibreBodoni-BoldItalic-tlf-ly1.vf) \
tex(LibreBodoni-BoldItalic-tlf-ot1.tfm) \
tex(LibreBodoni-BoldItalic-tlf-t1--base.tfm) \
tex(LibreBodoni-BoldItalic-tlf-t1.tfm) \
tex(LibreBodoni-BoldItalic-tlf-t1.vf) \
tex(LibreBodoni-BoldItalic-tlf-ts1--base.tfm) \
tex(LibreBodoni-BoldItalic-tlf-ts1.tfm) \
tex(LibreBodoni-BoldItalic-tlf-ts1.vf) \
tex(LibreBodoni-Italic-inf-ly1--base.tfm) \
tex(LibreBodoni-Italic-inf-ly1.tfm) \
tex(LibreBodoni-Italic-inf-ly1.vf) \
tex(LibreBodoni-Italic-inf-ot1.tfm) \
tex(LibreBodoni-Italic-inf-t1--base.tfm) \
tex(LibreBodoni-Italic-inf-t1.tfm) \
tex(LibreBodoni-Italic-inf-t1.vf) \
tex(LibreBodoni-Italic-sup-ly1--base.tfm) \
tex(LibreBodoni-Italic-sup-ly1.tfm) \
tex(LibreBodoni-Italic-sup-ly1.vf) \
tex(LibreBodoni-Italic-sup-ot1.tfm) \
tex(LibreBodoni-Italic-sup-t1--base.tfm) \
tex(LibreBodoni-Italic-sup-t1.tfm) \
tex(LibreBodoni-Italic-sup-t1.vf) \
tex(LibreBodoni-Italic-tlf-ly1--base.tfm) \
tex(LibreBodoni-Italic-tlf-ly1.tfm) \
tex(LibreBodoni-Italic-tlf-ly1.vf) \
tex(LibreBodoni-Italic-tlf-ot1.tfm) \
tex(LibreBodoni-Italic-tlf-t1--base.tfm) \
tex(LibreBodoni-Italic-tlf-t1.tfm) \
tex(LibreBodoni-Italic-tlf-t1.vf) \
tex(LibreBodoni-Italic-tlf-ts1--base.tfm) \
tex(LibreBodoni-Italic-tlf-ts1.tfm) \
tex(LibreBodoni-Italic-tlf-ts1.vf) \
tex(LibreBodoni-Regular-inf-ly1--base.tfm) \
tex(LibreBodoni-Regular-inf-ly1.tfm) \
tex(LibreBodoni-Regular-inf-ly1.vf) \
tex(LibreBodoni-Regular-inf-ot1.tfm) \
tex(LibreBodoni-Regular-inf-t1--base.tfm) \
tex(LibreBodoni-Regular-inf-t1.tfm) \
tex(LibreBodoni-Regular-inf-t1.vf) \
tex(LibreBodoni-Regular-sup-ly1--base.tfm) \
tex(LibreBodoni-Regular-sup-ly1.tfm) \
tex(LibreBodoni-Regular-sup-ly1.vf) \
tex(LibreBodoni-Regular-sup-ot1.tfm) \
tex(LibreBodoni-Regular-sup-t1--base.tfm) \
tex(LibreBodoni-Regular-sup-t1.tfm) \
tex(LibreBodoni-Regular-sup-t1.vf) \
tex(LibreBodoni-Regular-tlf-ly1--base.tfm) \
tex(LibreBodoni-Regular-tlf-ly1.tfm) \
tex(LibreBodoni-Regular-tlf-ly1.vf) \
tex(LibreBodoni-Regular-tlf-ot1.tfm) \
tex(LibreBodoni-Regular-tlf-t1--base.tfm) \
tex(LibreBodoni-Regular-tlf-t1.tfm) \
tex(LibreBodoni-Regular-tlf-t1.vf) \
tex(LibreBodoni-Regular-tlf-ts1--base.tfm) \
tex(LibreBodoni-Regular-tlf-ts1.tfm) \
tex(LibreBodoni-Regular-tlf-ts1.vf) \
tex(LibreBodoni.map) \
tex(LibreBodoni.sty) \
tex(OT1LibreBodoni-Inf.fd) \
tex(OT1LibreBodoni-Sup.fd) \
tex(OT1LibreBodoni-TLF.fd) \
tex(T1LibreBodoni-Inf.fd) \
tex(T1LibreBodoni-Sup.fd) \
tex(T1LibreBodoni-TLF.fd) \
tex(TS1LibreBodoni-TLF.fd) \
tex(lbd_2nc6ly.enc) \
tex(lbd_dwvqiv.enc) \
tex(lbd_fttd7q.enc) \
tex(lbd_gxeqsi.enc) \
tex(lbd_k2dfwc.enc) \
tex(lbd_oaf34p.enc) \
tex(lbd_pcwse4.enc) \
tex(lbd_rpuqof.enc) \
tex(lbd_yeotsr.enc) \
tex(lbd_zpaflu.enc) \
texlive-librebodoni"

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
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-librebodoni-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
