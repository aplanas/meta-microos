SUMMARY = "The Arvo font face with support for LaTeX and pdfLaTeX"
DESCRIPTION = "This package provides the Arvo family of fonts designed by \
Anton Koovit, with support for LaTeX and pdfLaTeX."
LICENSE = "OFL-1.1"

PV = "2023.201.svn57213"

RPM_NAME = "texlive-arvo-2023.201.svn57213-53.1.noarch.rpm"
RPM_HASH = "36041ebff6dd7604c65f0ee9157f25dea9a9d3ef6c1b92d6b1e6ba8a7e26db46ee3c3f11bc0adc4e725aec6a8c452073134044b16641cbf3d914fec9270098f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Arvo-Bold-tlf-ly1--base.tfm) \
tex(Arvo-Bold-tlf-ly1.tfm) \
tex(Arvo-Bold-tlf-ly1.vf) \
tex(Arvo-Bold-tlf-ot1.tfm) \
tex(Arvo-Bold-tlf-t1--base.tfm) \
tex(Arvo-Bold-tlf-t1.tfm) \
tex(Arvo-Bold-tlf-t1.vf) \
tex(Arvo-Bold-tlf-ts1--base.tfm) \
tex(Arvo-Bold-tlf-ts1.tfm) \
tex(Arvo-Bold-tlf-ts1.vf) \
tex(Arvo-BoldItalic-tlf-ly1--base.tfm) \
tex(Arvo-BoldItalic-tlf-ly1.tfm) \
tex(Arvo-BoldItalic-tlf-ly1.vf) \
tex(Arvo-BoldItalic-tlf-ot1.tfm) \
tex(Arvo-BoldItalic-tlf-t1--base.tfm) \
tex(Arvo-BoldItalic-tlf-t1.tfm) \
tex(Arvo-BoldItalic-tlf-t1.vf) \
tex(Arvo-BoldItalic-tlf-ts1--base.tfm) \
tex(Arvo-BoldItalic-tlf-ts1.tfm) \
tex(Arvo-BoldItalic-tlf-ts1.vf) \
tex(Arvo-Italic-tlf-ly1--base.tfm) \
tex(Arvo-Italic-tlf-ly1.tfm) \
tex(Arvo-Italic-tlf-ly1.vf) \
tex(Arvo-Italic-tlf-ot1.tfm) \
tex(Arvo-Italic-tlf-t1--base.tfm) \
tex(Arvo-Italic-tlf-t1.tfm) \
tex(Arvo-Italic-tlf-t1.vf) \
tex(Arvo-Italic-tlf-ts1--base.tfm) \
tex(Arvo-Italic-tlf-ts1.tfm) \
tex(Arvo-Italic-tlf-ts1.vf) \
tex(Arvo-tlf-ly1--base.tfm) \
tex(Arvo-tlf-ly1.tfm) \
tex(Arvo-tlf-ly1.vf) \
tex(Arvo-tlf-ot1.tfm) \
tex(Arvo-tlf-t1--base.tfm) \
tex(Arvo-tlf-t1.tfm) \
tex(Arvo-tlf-t1.vf) \
tex(Arvo-tlf-ts1--base.tfm) \
tex(Arvo-tlf-ts1.tfm) \
tex(Arvo-tlf-ts1.vf) \
tex(Arvo.map) \
tex(Arvo.sty) \
tex(LY1Arvo-TLF.fd) \
tex(OT1Arvo-TLF.fd) \
tex(T1Arvo-TLF.fd) \
tex(TS1Arvo-TLF.fd) \
tex(a_6czsg4.enc) \
tex(a_fibvii.enc) \
tex(a_fin2th.enc) \
tex(a_jtfq37.enc) \
tex(a_od575u.enc) \
tex(a_vt66fp.enc) \
tex(a_zmrji7.enc) \
texlive-arvo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontaxes.sty) \
tex(fontenc.sty) \
tex(ifthen.sty) \
tex(mweights.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-arvo-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
