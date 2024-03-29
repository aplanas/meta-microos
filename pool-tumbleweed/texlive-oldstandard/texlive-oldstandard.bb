SUMMARY = "OldStandard fonts with LaTeX support"
DESCRIPTION = "Old Standard is designed to reproduce the actual printing style \
of the early 20th century, reviving a specific type of Modern \
(classicist) style of serif typefaces, very commonly used in \
various editions of the late 19th and early 20th century, but \
almost completely abandoned later. The font supports \
typesetting of Old and Middle English, Old Icelandic, Cyrillic \
(with historical characters, extensions for Old Slavonic and \
localised forms), Gothic transliterations, critical editions of \
Classical Greek and Latin, and many more. This package works \
with TeX engines that directly support OpenType features, such \
as XeTeX and LuaTeX, as well as traditional engines such as TeX \
and pdfTeX."
LICENSE = "OFL-1.1"

PV = "2023.209.2.6svn64464"

RPM_NAME = "texlive-oldstandard-2023.209.2.6svn64464-55.1.noarch.rpm"
RPM_HASH = "1f71054c27c625a45a2be00086513b7e668c6f37e7bb6be1307f3d94f43eb0d99ab3d836090b30cc81fa22d60a938a414b059c86c0a482c0ab2f023c7c1c9105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LGROldStandard-Sup.fd \
tex-LGROldStandard-TLF.fd \
tex-LY1OldStandard-Sup.fd \
tex-LY1OldStandard-TLF.fd \
tex-OT1OldStandard-Sup.fd \
tex-OT1OldStandard-TLF.fd \
tex-OldStandard-Bold-sup-lgr.tfm \
tex-OldStandard-Bold-sup-ly1.tfm \
tex-OldStandard-Bold-sup-ot1.tfm \
tex-OldStandard-Bold-sup-t1--base.tfm \
tex-OldStandard-Bold-sup-t1.tfm \
tex-OldStandard-Bold-sup-t1.vf \
tex-OldStandard-Bold-sup-t2a.tfm \
tex-OldStandard-Bold-sup-t2b.tfm \
tex-OldStandard-Bold-sup-t2c.tfm \
tex-OldStandard-Bold-tlf-lgr.tfm \
tex-OldStandard-Bold-tlf-ly1.tfm \
tex-OldStandard-Bold-tlf-ot1.tfm \
tex-OldStandard-Bold-tlf-sc-lgr.tfm \
tex-OldStandard-Bold-tlf-sc-ly1--base.tfm \
tex-OldStandard-Bold-tlf-sc-ly1.tfm \
tex-OldStandard-Bold-tlf-sc-ly1.vf \
tex-OldStandard-Bold-tlf-sc-ot1--base.tfm \
tex-OldStandard-Bold-tlf-sc-ot1.tfm \
tex-OldStandard-Bold-tlf-sc-ot1.vf \
tex-OldStandard-Bold-tlf-sc-t1--base.tfm \
tex-OldStandard-Bold-tlf-sc-t1.tfm \
tex-OldStandard-Bold-tlf-sc-t1.vf \
tex-OldStandard-Bold-tlf-sc-t2a--base.tfm \
tex-OldStandard-Bold-tlf-sc-t2a.tfm \
tex-OldStandard-Bold-tlf-sc-t2a.vf \
tex-OldStandard-Bold-tlf-sc-t2b--base.tfm \
tex-OldStandard-Bold-tlf-sc-t2b.tfm \
tex-OldStandard-Bold-tlf-sc-t2b.vf \
tex-OldStandard-Bold-tlf-sc-t2c--base.tfm \
tex-OldStandard-Bold-tlf-sc-t2c.tfm \
tex-OldStandard-Bold-tlf-sc-t2c.vf \
tex-OldStandard-Bold-tlf-t1--base.tfm \
tex-OldStandard-Bold-tlf-t1.tfm \
tex-OldStandard-Bold-tlf-t1.vf \
tex-OldStandard-Bold-tlf-t2a.tfm \
tex-OldStandard-Bold-tlf-t2b.tfm \
tex-OldStandard-Bold-tlf-t2c.tfm \
tex-OldStandard-Bold-tlf-ts1--base.tfm \
tex-OldStandard-Bold-tlf-ts1.tfm \
tex-OldStandard-Bold-tlf-ts1.vf \
tex-OldStandard-BoldItalic-sup-lgr.tfm \
tex-OldStandard-BoldItalic-sup-ly1.tfm \
tex-OldStandard-BoldItalic-sup-ot1.tfm \
tex-OldStandard-BoldItalic-sup-t1--base.tfm \
tex-OldStandard-BoldItalic-sup-t1.tfm \
tex-OldStandard-BoldItalic-sup-t1.vf \
tex-OldStandard-BoldItalic-sup-t2a.tfm \
tex-OldStandard-BoldItalic-sup-t2b.tfm \
tex-OldStandard-BoldItalic-sup-t2c.tfm \
tex-OldStandard-BoldItalic-tlf-lgr.tfm \
tex-OldStandard-BoldItalic-tlf-ly1.tfm \
tex-OldStandard-BoldItalic-tlf-ot1.tfm \
tex-OldStandard-BoldItalic-tlf-sc-lgr.tfm \
tex-OldStandard-BoldItalic-tlf-sc-ly1--base.tfm \
tex-OldStandard-BoldItalic-tlf-sc-ly1.tfm \
tex-OldStandard-BoldItalic-tlf-sc-ly1.vf \
tex-OldStandard-BoldItalic-tlf-sc-ot1--base.tfm \
tex-OldStandard-BoldItalic-tlf-sc-ot1.tfm \
tex-OldStandard-BoldItalic-tlf-sc-ot1.vf \
tex-OldStandard-BoldItalic-tlf-sc-t1--base.tfm \
tex-OldStandard-BoldItalic-tlf-sc-t1.tfm \
tex-OldStandard-BoldItalic-tlf-sc-t1.vf \
tex-OldStandard-BoldItalic-tlf-sc-t2a--base.tfm \
tex-OldStandard-BoldItalic-tlf-sc-t2a.tfm \
tex-OldStandard-BoldItalic-tlf-sc-t2a.vf \
tex-OldStandard-BoldItalic-tlf-sc-t2b--base.tfm \
tex-OldStandard-BoldItalic-tlf-sc-t2b.tfm \
tex-OldStandard-BoldItalic-tlf-sc-t2b.vf \
tex-OldStandard-BoldItalic-tlf-sc-t2c--base.tfm \
tex-OldStandard-BoldItalic-tlf-sc-t2c.tfm \
tex-OldStandard-BoldItalic-tlf-sc-t2c.vf \
tex-OldStandard-BoldItalic-tlf-t1--base.tfm \
tex-OldStandard-BoldItalic-tlf-t1.tfm \
tex-OldStandard-BoldItalic-tlf-t1.vf \
tex-OldStandard-BoldItalic-tlf-t2a.tfm \
tex-OldStandard-BoldItalic-tlf-t2b.tfm \
tex-OldStandard-BoldItalic-tlf-t2c.tfm \
tex-OldStandard-BoldItalic-tlf-ts1--base.tfm \
tex-OldStandard-BoldItalic-tlf-ts1.tfm \
tex-OldStandard-BoldItalic-tlf-ts1.vf \
tex-OldStandard-Italic-sup-lgr.tfm \
tex-OldStandard-Italic-sup-ly1.tfm \
tex-OldStandard-Italic-sup-ot1.tfm \
tex-OldStandard-Italic-sup-t1--base.tfm \
tex-OldStandard-Italic-sup-t1.tfm \
tex-OldStandard-Italic-sup-t1.vf \
tex-OldStandard-Italic-sup-t2a.tfm \
tex-OldStandard-Italic-sup-t2b.tfm \
tex-OldStandard-Italic-sup-t2c.tfm \
tex-OldStandard-Italic-tlf-lgr.tfm \
tex-OldStandard-Italic-tlf-ly1.tfm \
tex-OldStandard-Italic-tlf-ot1.tfm \
tex-OldStandard-Italic-tlf-sc-lgr.tfm \
tex-OldStandard-Italic-tlf-sc-ly1--base.tfm \
tex-OldStandard-Italic-tlf-sc-ly1.tfm \
tex-OldStandard-Italic-tlf-sc-ly1.vf \
tex-OldStandard-Italic-tlf-sc-ot1--base.tfm \
tex-OldStandard-Italic-tlf-sc-ot1.tfm \
tex-OldStandard-Italic-tlf-sc-ot1.vf \
tex-OldStandard-Italic-tlf-sc-t1--base.tfm \
tex-OldStandard-Italic-tlf-sc-t1.tfm \
tex-OldStandard-Italic-tlf-sc-t1.vf \
tex-OldStandard-Italic-tlf-sc-t2a--base.tfm \
tex-OldStandard-Italic-tlf-sc-t2a.tfm \
tex-OldStandard-Italic-tlf-sc-t2a.vf \
tex-OldStandard-Italic-tlf-sc-t2b--base.tfm \
tex-OldStandard-Italic-tlf-sc-t2b.tfm \
tex-OldStandard-Italic-tlf-sc-t2b.vf \
tex-OldStandard-Italic-tlf-sc-t2c--base.tfm \
tex-OldStandard-Italic-tlf-sc-t2c.tfm \
tex-OldStandard-Italic-tlf-sc-t2c.vf \
tex-OldStandard-Italic-tlf-t1--base.tfm \
tex-OldStandard-Italic-tlf-t1.tfm \
tex-OldStandard-Italic-tlf-t1.vf \
tex-OldStandard-Italic-tlf-t2a.tfm \
tex-OldStandard-Italic-tlf-t2b.tfm \
tex-OldStandard-Italic-tlf-t2c.tfm \
tex-OldStandard-Italic-tlf-ts1--base.tfm \
tex-OldStandard-Italic-tlf-ts1.tfm \
tex-OldStandard-Italic-tlf-ts1.vf \
tex-OldStandard-Regular-sup-lgr.tfm \
tex-OldStandard-Regular-sup-ly1.tfm \
tex-OldStandard-Regular-sup-ot1.tfm \
tex-OldStandard-Regular-sup-t1--base.tfm \
tex-OldStandard-Regular-sup-t1.tfm \
tex-OldStandard-Regular-sup-t1.vf \
tex-OldStandard-Regular-sup-t2a.tfm \
tex-OldStandard-Regular-sup-t2b.tfm \
tex-OldStandard-Regular-sup-t2c.tfm \
tex-OldStandard-Regular-tlf-lgr.tfm \
tex-OldStandard-Regular-tlf-ly1.tfm \
tex-OldStandard-Regular-tlf-ot1.tfm \
tex-OldStandard-Regular-tlf-sc-lgr.tfm \
tex-OldStandard-Regular-tlf-sc-ly1--base.tfm \
tex-OldStandard-Regular-tlf-sc-ly1.tfm \
tex-OldStandard-Regular-tlf-sc-ly1.vf \
tex-OldStandard-Regular-tlf-sc-ot1--base.tfm \
tex-OldStandard-Regular-tlf-sc-ot1.tfm \
tex-OldStandard-Regular-tlf-sc-ot1.vf \
tex-OldStandard-Regular-tlf-sc-t1--base.tfm \
tex-OldStandard-Regular-tlf-sc-t1.tfm \
tex-OldStandard-Regular-tlf-sc-t1.vf \
tex-OldStandard-Regular-tlf-sc-t2a--base.tfm \
tex-OldStandard-Regular-tlf-sc-t2a.tfm \
tex-OldStandard-Regular-tlf-sc-t2a.vf \
tex-OldStandard-Regular-tlf-sc-t2b--base.tfm \
tex-OldStandard-Regular-tlf-sc-t2b.tfm \
tex-OldStandard-Regular-tlf-sc-t2b.vf \
tex-OldStandard-Regular-tlf-sc-t2c--base.tfm \
tex-OldStandard-Regular-tlf-sc-t2c.tfm \
tex-OldStandard-Regular-tlf-sc-t2c.vf \
tex-OldStandard-Regular-tlf-t1--base.tfm \
tex-OldStandard-Regular-tlf-t1.tfm \
tex-OldStandard-Regular-tlf-t1.vf \
tex-OldStandard-Regular-tlf-t2a.tfm \
tex-OldStandard-Regular-tlf-t2b.tfm \
tex-OldStandard-Regular-tlf-t2c.tfm \
tex-OldStandard-Regular-tlf-ts1--base.tfm \
tex-OldStandard-Regular-tlf-ts1.tfm \
tex-OldStandard-Regular-tlf-ts1.vf \
tex-OldStandard.map \
tex-OldStandard.sty \
tex-T1OldStandard-Sup.fd \
tex-T1OldStandard-TLF.fd \
tex-T2AOldStandard-Sup.fd \
tex-T2AOldStandard-TLF.fd \
tex-T2BOldStandard-Sup.fd \
tex-T2BOldStandard-TLF.fd \
tex-T2COldStandard-Sup.fd \
tex-T2COldStandard-TLF.fd \
tex-TS1OldStandard-TLF.fd \
tex-ost-2deiwc.enc \
tex-ost-4gryax.enc \
tex-ost-4ubwsr.enc \
tex-ost-5nnl5u.enc \
tex-ost-5whbgv.enc \
tex-ost-6xqr26.enc \
tex-ost-angj2q.enc \
tex-ost-asyrwx.enc \
tex-ost-bjztjg.enc \
tex-ost-bqhfkj.enc \
tex-ost-dqfezc.enc \
tex-ost-eyrxhh.enc \
tex-ost-f7vsty.enc \
tex-ost-hn3tfb.enc \
tex-ost-im33zw.enc \
tex-ost-jsesfs.enc \
tex-ost-kb3yb7.enc \
tex-ost-lpt7jr.enc \
tex-ost-mknljf.enc \
tex-ost-o47vxq.enc \
tex-ost-p56nol.enc \
tex-ost-ppxooj.enc \
tex-ost-qpx6oq.enc \
tex-ost-ra2ua5.enc \
tex-ost-recs4b.enc \
tex-ost-roofh6.enc \
tex-ost-sef3nf.enc \
tex-ost-sfa7gz.enc \
tex-ost-sngi4d.enc \
tex-ost-sykxvg.enc \
tex-ost-tbxs5z.enc \
tex-ost-uj34jt.enc \
tex-ost-vznixw.enc \
tex-ost-y2jfiq.enc \
tex-ost-yp4wmb.enc \
tex-ost-ytxedg.enc \
texlive-oldstandard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oldstandard-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
