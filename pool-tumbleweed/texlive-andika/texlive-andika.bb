SUMMARY = "Andika fonts with support for all LaTeX engines"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the Andika family of fonts designed by SIL \
International especially for literacy use, taking into account \
the needs of beginning readers. The focus is on clear, \
easy-to-perceive letterforms that will not be readily confused \
with one another."
LICENSE = "OFL-1.1"

PV = "2023.201.6.101svn64540"

RPM_NAME = "texlive-andika-2023.201.6.101svn64540-54.1.noarch.rpm"
RPM_HASH = "fd22cf4bd98beff111a7a93c798d1d814170def758026f4f8583a9e0b3b0da333a9fa70c59a8bd4ac9b8b7faa8656321ad6577a7f9dde52811be609f32f80949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1andk-TLF.fd \
tex-OT1andk-TLF.fd \
tex-T1andk-TLF.fd \
tex-T2Aandk-TLF.fd \
tex-T2Bandk-TLF.fd \
tex-T2Candk-TLF.fd \
tex-TS1andk-TLF.fd \
tex-a-4x6wej.enc \
tex-a-5kj227.enc \
tex-a-d7tkvq.enc \
tex-a-fh3q3k.enc \
tex-a-fryoln.enc \
tex-a-gn36ar.enc \
tex-a-hrgzjy.enc \
tex-a-k2qdsf.enc \
tex-a-lqpsni.enc \
tex-a-q2mpm3.enc \
tex-a-slnzzz.enc \
tex-a-xvqrq2.enc \
tex-a-zn43lu.enc \
tex-a-zvjtl6.enc \
tex-andika.map \
tex-andika.sty \
tex-andk-Bold-tlf-ly1.tfm \
tex-andk-Bold-tlf-ot1.tfm \
tex-andk-Bold-tlf-sc-ly1--base.tfm \
tex-andk-Bold-tlf-sc-ly1.tfm \
tex-andk-Bold-tlf-sc-ly1.vf \
tex-andk-Bold-tlf-sc-ot1--base.tfm \
tex-andk-Bold-tlf-sc-ot1.tfm \
tex-andk-Bold-tlf-sc-ot1.vf \
tex-andk-Bold-tlf-sc-t1--base.tfm \
tex-andk-Bold-tlf-sc-t1.tfm \
tex-andk-Bold-tlf-sc-t1.vf \
tex-andk-Bold-tlf-sc-t2a--base.tfm \
tex-andk-Bold-tlf-sc-t2a.tfm \
tex-andk-Bold-tlf-sc-t2a.vf \
tex-andk-Bold-tlf-sc-t2b--base.tfm \
tex-andk-Bold-tlf-sc-t2b.tfm \
tex-andk-Bold-tlf-sc-t2b.vf \
tex-andk-Bold-tlf-sc-t2c--base.tfm \
tex-andk-Bold-tlf-sc-t2c.tfm \
tex-andk-Bold-tlf-sc-t2c.vf \
tex-andk-Bold-tlf-t1--base.tfm \
tex-andk-Bold-tlf-t1.tfm \
tex-andk-Bold-tlf-t1.vf \
tex-andk-Bold-tlf-t2a.tfm \
tex-andk-Bold-tlf-t2b.tfm \
tex-andk-Bold-tlf-t2c.tfm \
tex-andk-Bold-tlf-ts1--base.tfm \
tex-andk-Bold-tlf-ts1.tfm \
tex-andk-Bold-tlf-ts1.vf \
tex-andk-BoldItalic-tlf-ly1.tfm \
tex-andk-BoldItalic-tlf-ot1.tfm \
tex-andk-BoldItalic-tlf-sc-ly1--base.tfm \
tex-andk-BoldItalic-tlf-sc-ly1.tfm \
tex-andk-BoldItalic-tlf-sc-ly1.vf \
tex-andk-BoldItalic-tlf-sc-ot1--base.tfm \
tex-andk-BoldItalic-tlf-sc-ot1.tfm \
tex-andk-BoldItalic-tlf-sc-ot1.vf \
tex-andk-BoldItalic-tlf-sc-t1--base.tfm \
tex-andk-BoldItalic-tlf-sc-t1.tfm \
tex-andk-BoldItalic-tlf-sc-t1.vf \
tex-andk-BoldItalic-tlf-sc-t2a--base.tfm \
tex-andk-BoldItalic-tlf-sc-t2a.tfm \
tex-andk-BoldItalic-tlf-sc-t2a.vf \
tex-andk-BoldItalic-tlf-sc-t2b--base.tfm \
tex-andk-BoldItalic-tlf-sc-t2b.tfm \
tex-andk-BoldItalic-tlf-sc-t2b.vf \
tex-andk-BoldItalic-tlf-sc-t2c--base.tfm \
tex-andk-BoldItalic-tlf-sc-t2c.tfm \
tex-andk-BoldItalic-tlf-sc-t2c.vf \
tex-andk-BoldItalic-tlf-t1--base.tfm \
tex-andk-BoldItalic-tlf-t1.tfm \
tex-andk-BoldItalic-tlf-t1.vf \
tex-andk-BoldItalic-tlf-t2a.tfm \
tex-andk-BoldItalic-tlf-t2b.tfm \
tex-andk-BoldItalic-tlf-t2c.tfm \
tex-andk-BoldItalic-tlf-ts1--base.tfm \
tex-andk-BoldItalic-tlf-ts1.tfm \
tex-andk-BoldItalic-tlf-ts1.vf \
tex-andk-Italic-tlf-ly1.tfm \
tex-andk-Italic-tlf-ot1.tfm \
tex-andk-Italic-tlf-sc-ly1--base.tfm \
tex-andk-Italic-tlf-sc-ly1.tfm \
tex-andk-Italic-tlf-sc-ly1.vf \
tex-andk-Italic-tlf-sc-ot1--base.tfm \
tex-andk-Italic-tlf-sc-ot1.tfm \
tex-andk-Italic-tlf-sc-ot1.vf \
tex-andk-Italic-tlf-sc-t1--base.tfm \
tex-andk-Italic-tlf-sc-t1.tfm \
tex-andk-Italic-tlf-sc-t1.vf \
tex-andk-Italic-tlf-sc-t2a--base.tfm \
tex-andk-Italic-tlf-sc-t2a.tfm \
tex-andk-Italic-tlf-sc-t2a.vf \
tex-andk-Italic-tlf-sc-t2b--base.tfm \
tex-andk-Italic-tlf-sc-t2b.tfm \
tex-andk-Italic-tlf-sc-t2b.vf \
tex-andk-Italic-tlf-sc-t2c--base.tfm \
tex-andk-Italic-tlf-sc-t2c.tfm \
tex-andk-Italic-tlf-sc-t2c.vf \
tex-andk-Italic-tlf-t1--base.tfm \
tex-andk-Italic-tlf-t1.tfm \
tex-andk-Italic-tlf-t1.vf \
tex-andk-Italic-tlf-t2a.tfm \
tex-andk-Italic-tlf-t2b.tfm \
tex-andk-Italic-tlf-t2c.tfm \
tex-andk-Italic-tlf-ts1--base.tfm \
tex-andk-Italic-tlf-ts1.tfm \
tex-andk-Italic-tlf-ts1.vf \
tex-andk-tlf-ly1.tfm \
tex-andk-tlf-ot1.tfm \
tex-andk-tlf-sc-ly1--base.tfm \
tex-andk-tlf-sc-ly1.tfm \
tex-andk-tlf-sc-ly1.vf \
tex-andk-tlf-sc-ot1--base.tfm \
tex-andk-tlf-sc-ot1.tfm \
tex-andk-tlf-sc-ot1.vf \
tex-andk-tlf-sc-t1--base.tfm \
tex-andk-tlf-sc-t1.tfm \
tex-andk-tlf-sc-t1.vf \
tex-andk-tlf-sc-t2a--base.tfm \
tex-andk-tlf-sc-t2a.tfm \
tex-andk-tlf-sc-t2a.vf \
tex-andk-tlf-sc-t2b--base.tfm \
tex-andk-tlf-sc-t2b.tfm \
tex-andk-tlf-sc-t2b.vf \
tex-andk-tlf-sc-t2c--base.tfm \
tex-andk-tlf-sc-t2c.tfm \
tex-andk-tlf-sc-t2c.vf \
tex-andk-tlf-t1--base.tfm \
tex-andk-tlf-t1.tfm \
tex-andk-tlf-t1.vf \
tex-andk-tlf-t2a.tfm \
tex-andk-tlf-t2b.tfm \
tex-andk-tlf-t2c.tfm \
tex-andk-tlf-ts1--base.tfm \
tex-andk-tlf-ts1.tfm \
tex-andk-tlf-ts1.vf \
texlive-andika"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-iftex.sty \
tex-mweights.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-andika-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
