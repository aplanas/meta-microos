SUMMARY = "The Alfa Slab One font face with support for LaTeX and pdfLaTeX"
DESCRIPTION = "The alfaslabone package supports the Alfa Slab One font face \
for LaTeX. There is only a Regular font face. It's useful for \
book-chapter headlines."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57452"

RPM_NAME = "texlive-alfaslabone-2023.201.0.0.0.1svn57452-54.1.noarch.rpm"
RPM_HASH = "d9659355bf08757da1369f5e07415341f14ee8554e185a0457439a7fe638d125c2167063d8c945af4b952461171cc579e12733a1b74b82e2367953bceced011b"
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

RDEPENDS:${PN} += "/bin/sh \
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
