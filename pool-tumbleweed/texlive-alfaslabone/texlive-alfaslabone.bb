SUMMARY = "The Alfa Slab One font face with support for LaTeX and pdfLaTeX"
DESCRIPTION = "The alfaslabone package supports the Alfa Slab One font face \
for LaTeX. There is only a Regular font face. It's useful for \
book-chapter headlines."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.0.1svn57452"

RPM_NAME = "texlive-alfaslabone-2023.209.0.0.0.1svn57452-55.1.noarch.rpm"
RPM_HASH = "6d4a22e1ca6c0c90a596757b44ea1a51fd3bdfd475da39238463d591cc56bb43f8d2672361972a522dbb208702e1ecf4cfb1db016a9e336a2bae06a4077c8d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AlphaSlabOne-Regular-sup-ly1--base.tfm \
tex-AlphaSlabOne-Regular-sup-ly1.tfm \
tex-AlphaSlabOne-Regular-sup-ly1.vf \
tex-AlphaSlabOne-Regular-sup-ot1.tfm \
tex-AlphaSlabOne-Regular-sup-t1--base.tfm \
tex-AlphaSlabOne-Regular-sup-t1.tfm \
tex-AlphaSlabOne-Regular-sup-t1.vf \
tex-AlphaSlabOne-Regular-tlf-ly1--base.tfm \
tex-AlphaSlabOne-Regular-tlf-ly1.tfm \
tex-AlphaSlabOne-Regular-tlf-ly1.vf \
tex-AlphaSlabOne-Regular-tlf-ot1.tfm \
tex-AlphaSlabOne-Regular-tlf-t1--base.tfm \
tex-AlphaSlabOne-Regular-tlf-t1.tfm \
tex-AlphaSlabOne-Regular-tlf-t1.vf \
tex-AlphaSlabOne-Regular-tlf-ts1--base.tfm \
tex-AlphaSlabOne-Regular-tlf-ts1.tfm \
tex-AlphaSlabOne-Regular-tlf-ts1.vf \
tex-AlphaSlabOne.map \
tex-LY1AlphaSlabOne-Sup.fd \
tex-LY1AlphaSlabOne-TLF.fd \
tex-OT1AlphaSlabOne-Sup.fd \
tex-OT1AlphaSlabOne-TLF.fd \
tex-T1AlphaSlabOne-Sup.fd \
tex-T1AlphaSlabOne-TLF.fd \
tex-TS1AlphaSlabOne-TLF.fd \
tex-a-5xld5w.enc \
tex-a-adz5lu.enc \
tex-a-d2anrk.enc \
tex-a-lzhlbi.enc \
tex-a-rymxky.enc \
tex-a-taosrr.enc \
tex-a-vqpkf5.enc \
tex-alfaslabone.sty \
texlive-alfaslabone"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-mweights.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-alfaslabone-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
