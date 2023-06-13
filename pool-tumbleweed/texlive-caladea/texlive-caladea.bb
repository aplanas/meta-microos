SUMMARY = "Support for the Caladea family of fonts"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the Caladea family of fonts, designed by Carolina \
Giovagnoli and Andres Torresi of the Huerta Tipografica foundry \
and adopted by Google for ChromeOS as a font-metric compatible \
replacement for Cambria."
LICENSE = "Apache-1.0"

PV = "2023.201.svn64549"

RPM_NAME = "texlive-caladea-2023.201.svn64549-52.1.noarch.rpm"
RPM_HASH = "352c46bbd9a4078a7e3bf86a07c43fdfcb74397ae539210ab49ae926fabf151198e5cf9411437425ade7840e4189847f7fc97dbfce92c215c38cc0d80a506c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Caladea-Bold-tlf-ly1--base.tfm) \
tex(Caladea-Bold-tlf-ly1.tfm) \
tex(Caladea-Bold-tlf-ly1.vf) \
tex(Caladea-Bold-tlf-ot1.tfm) \
tex(Caladea-Bold-tlf-t1--base.tfm) \
tex(Caladea-Bold-tlf-t1.tfm) \
tex(Caladea-Bold-tlf-t1.vf) \
tex(Caladea-Bold-tlf-ts1--base.tfm) \
tex(Caladea-Bold-tlf-ts1.tfm) \
tex(Caladea-Bold-tlf-ts1.vf) \
tex(Caladea-BoldItalic-tlf-ly1--base.tfm) \
tex(Caladea-BoldItalic-tlf-ly1.tfm) \
tex(Caladea-BoldItalic-tlf-ly1.vf) \
tex(Caladea-BoldItalic-tlf-ot1.tfm) \
tex(Caladea-BoldItalic-tlf-t1--base.tfm) \
tex(Caladea-BoldItalic-tlf-t1.tfm) \
tex(Caladea-BoldItalic-tlf-t1.vf) \
tex(Caladea-BoldItalic-tlf-ts1--base.tfm) \
tex(Caladea-BoldItalic-tlf-ts1.tfm) \
tex(Caladea-BoldItalic-tlf-ts1.vf) \
tex(Caladea-Italic-tlf-ly1--base.tfm) \
tex(Caladea-Italic-tlf-ly1.tfm) \
tex(Caladea-Italic-tlf-ly1.vf) \
tex(Caladea-Italic-tlf-ot1.tfm) \
tex(Caladea-Italic-tlf-t1--base.tfm) \
tex(Caladea-Italic-tlf-t1.tfm) \
tex(Caladea-Italic-tlf-t1.vf) \
tex(Caladea-Italic-tlf-ts1--base.tfm) \
tex(Caladea-Italic-tlf-ts1.tfm) \
tex(Caladea-Italic-tlf-ts1.vf) \
tex(Caladea-Regular-tlf-ly1--base.tfm) \
tex(Caladea-Regular-tlf-ly1.tfm) \
tex(Caladea-Regular-tlf-ly1.vf) \
tex(Caladea-Regular-tlf-ot1.tfm) \
tex(Caladea-Regular-tlf-t1--base.tfm) \
tex(Caladea-Regular-tlf-t1.tfm) \
tex(Caladea-Regular-tlf-t1.vf) \
tex(Caladea-Regular-tlf-ts1--base.tfm) \
tex(Caladea-Regular-tlf-ts1.tfm) \
tex(Caladea-Regular-tlf-ts1.vf) \
tex(LY1Caladea-TLF.fd) \
tex(OT1Caladea-TLF.fd) \
tex(T1Caladea-TLF.fd) \
tex(TS1Caladea-TLF.fd) \
tex(caladea.map) \
tex(caladea.sty) \
tex(cld_cb3g7n.enc) \
tex(cld_fjy5hl.enc) \
tex(cld_prieif.enc) \
tex(cld_w45fff.enc) \
texlive-caladea"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-caladea-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
