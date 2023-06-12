SUMMARY = "The Magra font face with support for LaTeX and pdfLaTeX"
DESCRIPTION = "This package provides the Magra family of fonts designed by \
FontFuror, with support for LaTeX and pdfLaTeX."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57373"

RPM_NAME = "texlive-magra-2023.201.0.0.0.1svn57373-52.1.noarch.rpm"
RPM_HASH = "6fb9a7785b5cd8613905ce9d710060e622f18e5e1885ca9734decdb266761fecaadac929023de906c808cbd575a099195f5c424973231f3159ea8b8fc61a55b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LY1Magra-TLF.fd) \
tex(Magra-Bold-tlf-ly1--base.tfm) \
tex(Magra-Bold-tlf-ly1.tfm) \
tex(Magra-Bold-tlf-ly1.vf) \
tex(Magra-Bold-tlf-ot1.tfm) \
tex(Magra-Bold-tlf-t1--base.tfm) \
tex(Magra-Bold-tlf-t1.tfm) \
tex(Magra-Bold-tlf-t1.vf) \
tex(Magra-Bold-tlf-ts1--base.tfm) \
tex(Magra-Bold-tlf-ts1.tfm) \
tex(Magra-Bold-tlf-ts1.vf) \
tex(Magra-tlf-ly1--base.tfm) \
tex(Magra-tlf-ly1.tfm) \
tex(Magra-tlf-ly1.vf) \
tex(Magra-tlf-ot1.tfm) \
tex(Magra-tlf-t1--base.tfm) \
tex(Magra-tlf-t1.tfm) \
tex(Magra-tlf-t1.vf) \
tex(Magra-tlf-ts1--base.tfm) \
tex(Magra-tlf-ts1.tfm) \
tex(Magra-tlf-ts1.vf) \
tex(Magra.map) \
tex(Magra.sty) \
tex(OT1Magra-TLF.fd) \
tex(T1Magra-TLF.fd) \
tex(TS1Magra-TLF.fd) \
tex(a_dip3eq.enc) \
tex(a_jqnft2.enc) \
tex(a_radyzq.enc) \
tex(a_va7yvq.enc) \
texlive-magra"
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
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-magra-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
