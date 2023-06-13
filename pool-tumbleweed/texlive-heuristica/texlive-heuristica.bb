SUMMARY = "Fonts extending Utopia, with LaTeX support files"
DESCRIPTION = "The fonts extend the utopia set with Cyrillic glyphs, \
additional figure styles, ligatures and Small Caps in Regular \
style only. Macro support, and maths fonts that match the \
Utopia family, are provided by the Fourier and the Mathdesign \
font packages."
LICENSE = "OFL-1.1"

PV = "2023.201.1.092svn51362"

RPM_NAME = "texlive-heuristica-2023.201.1.092svn51362-53.1.noarch.rpm"
RPM_HASH = "5d5bdac9ddc1cece50d18f03d921b5a9d40d9c2b0102a53b28b3f294bffd4324e416277199c374cffc54f5eb9f474fdbdd67abbcac7a9c2438560364b9018de4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Heuristica-Bold-inf-ly1.tfm) \
tex(Heuristica-Bold-inf-t1--base.tfm) \
tex(Heuristica-Bold-inf-t1.tfm) \
tex(Heuristica-Bold-inf-t1.vf) \
tex(Heuristica-Bold-inf-t2a.tfm) \
tex(Heuristica-Bold-inf-t2b.tfm) \
tex(Heuristica-Bold-inf-t2c.tfm) \
tex(Heuristica-Bold-sup-ly1.tfm) \
tex(Heuristica-Bold-sup-t1--base.tfm) \
tex(Heuristica-Bold-sup-t1.tfm) \
tex(Heuristica-Bold-sup-t1.vf) \
tex(Heuristica-Bold-sup-t2a.tfm) \
tex(Heuristica-Bold-sup-t2b.tfm) \
tex(Heuristica-Bold-sup-t2c.tfm) \
tex(Heuristica-Bold-tlf-ly1.tfm) \
tex(Heuristica-Bold-tlf-t1--base.tfm) \
tex(Heuristica-Bold-tlf-t1.tfm) \
tex(Heuristica-Bold-tlf-t1.vf) \
tex(Heuristica-Bold-tlf-t2a.tfm) \
tex(Heuristica-Bold-tlf-t2b.tfm) \
tex(Heuristica-Bold-tlf-t2c.tfm) \
tex(Heuristica-Bold-tlf-ts1--base.tfm) \
tex(Heuristica-Bold-tlf-ts1.tfm) \
tex(Heuristica-Bold-tlf-ts1.vf) \
tex(Heuristica-Bold-tosf-ly1.tfm) \
tex(Heuristica-Bold-tosf-t1--base.tfm) \
tex(Heuristica-Bold-tosf-t1.tfm) \
tex(Heuristica-Bold-tosf-t1.vf) \
tex(Heuristica-Bold-tosf-t2a.tfm) \
tex(Heuristica-Bold-tosf-t2b.tfm) \
tex(Heuristica-Bold-tosf-t2c.tfm) \
tex(Heuristica-Bold-tosf-ts1--base.tfm) \
tex(Heuristica-Bold-tosf-ts1.tfm) \
tex(Heuristica-Bold-tosf-ts1.vf) \
tex(Heuristica-BoldItalic-inf-ly1.tfm) \
tex(Heuristica-BoldItalic-inf-t1--base.tfm) \
tex(Heuristica-BoldItalic-inf-t1.tfm) \
tex(Heuristica-BoldItalic-inf-t1.vf) \
tex(Heuristica-BoldItalic-inf-t2a.tfm) \
tex(Heuristica-BoldItalic-inf-t2b.tfm) \
tex(Heuristica-BoldItalic-inf-t2c.tfm) \
tex(Heuristica-BoldItalic-sup-ly1.tfm) \
tex(Heuristica-BoldItalic-sup-t1--base.tfm) \
tex(Heuristica-BoldItalic-sup-t1.tfm) \
tex(Heuristica-BoldItalic-sup-t1.vf) \
tex(Heuristica-BoldItalic-sup-t2a.tfm) \
tex(Heuristica-BoldItalic-sup-t2b.tfm) \
tex(Heuristica-BoldItalic-sup-t2c.tfm) \
tex(Heuristica-BoldItalic-tlf-ly1.tfm) \
tex(Heuristica-BoldItalic-tlf-t1--base.tfm) \
tex(Heuristica-BoldItalic-tlf-t1.tfm) \
tex(Heuristica-BoldItalic-tlf-t1.vf) \
tex(Heuristica-BoldItalic-tlf-t2a.tfm) \
tex(Heuristica-BoldItalic-tlf-t2b.tfm) \
tex(Heuristica-BoldItalic-tlf-t2c.tfm) \
tex(Heuristica-BoldItalic-tlf-ts1--base.tfm) \
tex(Heuristica-BoldItalic-tlf-ts1.tfm) \
tex(Heuristica-BoldItalic-tlf-ts1.vf) \
tex(Heuristica-BoldItalic-tosf-ly1.tfm) \
tex(Heuristica-BoldItalic-tosf-t1--base.tfm) \
tex(Heuristica-BoldItalic-tosf-t1.tfm) \
tex(Heuristica-BoldItalic-tosf-t1.vf) \
tex(Heuristica-BoldItalic-tosf-t2a.tfm) \
tex(Heuristica-BoldItalic-tosf-t2b.tfm) \
tex(Heuristica-BoldItalic-tosf-t2c.tfm) \
tex(Heuristica-BoldItalic-tosf-ts1--base.tfm) \
tex(Heuristica-BoldItalic-tosf-ts1.tfm) \
tex(Heuristica-BoldItalic-tosf-ts1.vf) \
tex(Heuristica-Italic-inf-ly1.tfm) \
tex(Heuristica-Italic-inf-t1--base.tfm) \
tex(Heuristica-Italic-inf-t1.tfm) \
tex(Heuristica-Italic-inf-t1.vf) \
tex(Heuristica-Italic-inf-t2a.tfm) \
tex(Heuristica-Italic-inf-t2b.tfm) \
tex(Heuristica-Italic-inf-t2c.tfm) \
tex(Heuristica-Italic-sup-ly1.tfm) \
tex(Heuristica-Italic-sup-t1--base.tfm) \
tex(Heuristica-Italic-sup-t1.tfm) \
tex(Heuristica-Italic-sup-t1.vf) \
tex(Heuristica-Italic-sup-t2a.tfm) \
tex(Heuristica-Italic-sup-t2b.tfm) \
tex(Heuristica-Italic-sup-t2c.tfm) \
tex(Heuristica-Italic-tlf-ly1.tfm) \
tex(Heuristica-Italic-tlf-t1--base.tfm) \
tex(Heuristica-Italic-tlf-t1.tfm) \
tex(Heuristica-Italic-tlf-t1.vf) \
tex(Heuristica-Italic-tlf-t2a.tfm) \
tex(Heuristica-Italic-tlf-t2b.tfm) \
tex(Heuristica-Italic-tlf-t2c.tfm) \
tex(Heuristica-Italic-tlf-ts1--base.tfm) \
tex(Heuristica-Italic-tlf-ts1.tfm) \
tex(Heuristica-Italic-tlf-ts1.vf) \
tex(Heuristica-Italic-tosf-ly1.tfm) \
tex(Heuristica-Italic-tosf-t1--base.tfm) \
tex(Heuristica-Italic-tosf-t1.tfm) \
tex(Heuristica-Italic-tosf-t1.vf) \
tex(Heuristica-Italic-tosf-t2a.tfm) \
tex(Heuristica-Italic-tosf-t2b.tfm) \
tex(Heuristica-Italic-tosf-t2c.tfm) \
tex(Heuristica-Italic-tosf-ts1--base.tfm) \
tex(Heuristica-Italic-tosf-ts1.tfm) \
tex(Heuristica-Italic-tosf-ts1.vf) \
tex(Heuristica-Regular-inf-ly1.tfm) \
tex(Heuristica-Regular-inf-t1--base.tfm) \
tex(Heuristica-Regular-inf-t1.tfm) \
tex(Heuristica-Regular-inf-t1.vf) \
tex(Heuristica-Regular-inf-t2a.tfm) \
tex(Heuristica-Regular-inf-t2b.tfm) \
tex(Heuristica-Regular-inf-t2c.tfm) \
tex(Heuristica-Regular-sup-ly1.tfm) \
tex(Heuristica-Regular-sup-t1--base.tfm) \
tex(Heuristica-Regular-sup-t1.tfm) \
tex(Heuristica-Regular-sup-t1.vf) \
tex(Heuristica-Regular-sup-t2a.tfm) \
tex(Heuristica-Regular-sup-t2b.tfm) \
tex(Heuristica-Regular-sup-t2c.tfm) \
tex(Heuristica-Regular-tlf-ly1.tfm) \
tex(Heuristica-Regular-tlf-sc-ly1--base.tfm) \
tex(Heuristica-Regular-tlf-sc-ly1.tfm) \
tex(Heuristica-Regular-tlf-sc-ly1.vf) \
tex(Heuristica-Regular-tlf-sc-t1--base.tfm) \
tex(Heuristica-Regular-tlf-sc-t1.tfm) \
tex(Heuristica-Regular-tlf-sc-t1.vf) \
tex(Heuristica-Regular-tlf-sc-t2a.tfm) \
tex(Heuristica-Regular-tlf-sc-t2b.tfm) \
tex(Heuristica-Regular-tlf-sc-t2c.tfm) \
tex(Heuristica-Regular-tlf-t1--base.tfm) \
tex(Heuristica-Regular-tlf-t1.tfm) \
tex(Heuristica-Regular-tlf-t1.vf) \
tex(Heuristica-Regular-tlf-t2a.tfm) \
tex(Heuristica-Regular-tlf-t2b.tfm) \
tex(Heuristica-Regular-tlf-t2c.tfm) \
tex(Heuristica-Regular-tlf-ts1--base.tfm) \
tex(Heuristica-Regular-tlf-ts1.tfm) \
tex(Heuristica-Regular-tlf-ts1.vf) \
tex(Heuristica-Regular-tosf-ly1.tfm) \
tex(Heuristica-Regular-tosf-sc-ly1--base.tfm) \
tex(Heuristica-Regular-tosf-sc-ly1.tfm) \
tex(Heuristica-Regular-tosf-sc-ly1.vf) \
tex(Heuristica-Regular-tosf-sc-t1--base.tfm) \
tex(Heuristica-Regular-tosf-sc-t1.tfm) \
tex(Heuristica-Regular-tosf-sc-t1.vf) \
tex(Heuristica-Regular-tosf-sc-t2a.tfm) \
tex(Heuristica-Regular-tosf-sc-t2b.tfm) \
tex(Heuristica-Regular-tosf-sc-t2c.tfm) \
tex(Heuristica-Regular-tosf-t1--base.tfm) \
tex(Heuristica-Regular-tosf-t1.tfm) \
tex(Heuristica-Regular-tosf-t1.vf) \
tex(Heuristica-Regular-tosf-t2a.tfm) \
tex(Heuristica-Regular-tosf-t2b.tfm) \
tex(Heuristica-Regular-tosf-t2c.tfm) \
tex(Heuristica-Regular-tosf-ts1--base.tfm) \
tex(Heuristica-Regular-tosf-ts1.tfm) \
tex(Heuristica-Regular-tosf-ts1.vf) \
tex(Heuristica.map) \
tex(LY1Heuristica-Inf.fd) \
tex(LY1Heuristica-Sup.fd) \
tex(LY1Heuristica-TLF.fd) \
tex(LY1Heuristica-TOsF.fd) \
tex(T1Heuristica-Inf.fd) \
tex(T1Heuristica-Sup.fd) \
tex(T1Heuristica-TLF.fd) \
tex(T1Heuristica-TOsF.fd) \
tex(T2AHeuristica-Inf.fd) \
tex(T2AHeuristica-Sup.fd) \
tex(T2AHeuristica-TLF.fd) \
tex(T2AHeuristica-TOsF.fd) \
tex(T2BHeuristica-Inf.fd) \
tex(T2BHeuristica-Sup.fd) \
tex(T2BHeuristica-TLF.fd) \
tex(T2BHeuristica-TOsF.fd) \
tex(T2CHeuristica-Inf.fd) \
tex(T2CHeuristica-Sup.fd) \
tex(T2CHeuristica-TLF.fd) \
tex(T2CHeuristica-TOsF.fd) \
tex(TS1Heuristica-TLF.fd) \
tex(TS1Heuristica-TOsF.fd) \
tex(heuristica.sty) \
tex(zut_5b7xz5.enc) \
tex(zut_bavnqe.enc) \
tex(zut_ckaykl.enc) \
tex(zut_cq6rqq.enc) \
tex(zut_cvig5d.enc) \
tex(zut_d3dvo4.enc) \
tex(zut_dcwkkw.enc) \
tex(zut_dhvb6d.enc) \
tex(zut_dvh2xl.enc) \
tex(zut_e7tlds.enc) \
tex(zut_edf5gu.enc) \
tex(zut_etrbro.enc) \
tex(zut_evgarn.enc) \
tex(zut_f5n2rf.enc) \
tex(zut_fc3mov.enc) \
tex(zut_flhghs.enc) \
tex(zut_g4w54e.enc) \
tex(zut_geqeyh.enc) \
tex(zut_hbxdik.enc) \
tex(zut_hln2hy.enc) \
tex(zut_hvy566.enc) \
tex(zut_ijw3px.enc) \
tex(zut_it5nv3.enc) \
tex(zut_j3hjx2.enc) \
tex(zut_k42udk.enc) \
tex(zut_n2gc2n.enc) \
tex(zut_nvi5ys.enc) \
tex(zut_qy67bk.enc) \
tex(zut_rhmrtx.enc) \
tex(zut_rutxxy.enc) \
tex(zut_tfeu3y.enc) \
tex(zut_thxlbm.enc) \
tex(zut_tsvs4d.enc) \
tex(zut_u7pc6m.enc) \
tex(zut_ul3ofd.enc) \
tex(zut_v7it2w.enc) \
tex(zut_vaioc2.enc) \
tex(zut_vtjod4.enc) \
tex(zut_ysltpx.enc) \
tex(zut_zk7stm.enc) \
tex(zut_zl5g24.enc) \
texlive-heuristica"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(fontaxes.sty) \
tex(fontenc.sty) \
tex(ifthen.sty) \
tex(mweights.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-heuristica-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
