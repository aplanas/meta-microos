SUMMARY = "LaTeX support for the DejaVu fonts"
DESCRIPTION = "The package contains LaTeX support for the DejaVu fonts, which \
are derived from the Vera fonts but contain more characters and \
styles. The fonts are included in the original TrueType format, \
and in converted Type 1 format. The (currently) supported \
encodings are: OT1, T1, IL2, TS1, T2*, X2, QX, and LGR. The \
package doesn't (currently) support mathematics. More encodings \
and/or features are expected."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.34svn31771"

RPM_NAME = "texlive-dejavu-2023.209.2.34svn31771-53.1.noarch.rpm"
RPM_HASH = "c4fbdf91f115ae3b427ea75ad07be1e5b0b2966bef0b4e78b5da04ca1d5b4b63b08874ab4322a6d0a9126de65731fc008f8f2c78aa6749de2cbb1fd8d24fa049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DejaVuSans-Bold-tlf-il2.tfm \
tex-DejaVuSans-Bold-tlf-lgr.tfm \
tex-DejaVuSans-Bold-tlf-ot1.tfm \
tex-DejaVuSans-Bold-tlf-qx--base.tfm \
tex-DejaVuSans-Bold-tlf-qx.tfm \
tex-DejaVuSans-Bold-tlf-qx.vf \
tex-DejaVuSans-Bold-tlf-t1--base.tfm \
tex-DejaVuSans-Bold-tlf-t1.tfm \
tex-DejaVuSans-Bold-tlf-t1.vf \
tex-DejaVuSans-Bold-tlf-t2a.tfm \
tex-DejaVuSans-Bold-tlf-t2b.tfm \
tex-DejaVuSans-Bold-tlf-t2c.tfm \
tex-DejaVuSans-Bold-tlf-ts1--base.tfm \
tex-DejaVuSans-Bold-tlf-ts1.tfm \
tex-DejaVuSans-Bold-tlf-ts1.vf \
tex-DejaVuSans-Bold-tlf-x2.tfm \
tex-DejaVuSans-BoldOblique-tlf-il2.tfm \
tex-DejaVuSans-BoldOblique-tlf-lgr.tfm \
tex-DejaVuSans-BoldOblique-tlf-ot1.tfm \
tex-DejaVuSans-BoldOblique-tlf-qx--base.tfm \
tex-DejaVuSans-BoldOblique-tlf-qx.tfm \
tex-DejaVuSans-BoldOblique-tlf-qx.vf \
tex-DejaVuSans-BoldOblique-tlf-t1--base.tfm \
tex-DejaVuSans-BoldOblique-tlf-t1.tfm \
tex-DejaVuSans-BoldOblique-tlf-t1.vf \
tex-DejaVuSans-BoldOblique-tlf-t2a.tfm \
tex-DejaVuSans-BoldOblique-tlf-t2b.tfm \
tex-DejaVuSans-BoldOblique-tlf-t2c.tfm \
tex-DejaVuSans-BoldOblique-tlf-ts1--base.tfm \
tex-DejaVuSans-BoldOblique-tlf-ts1.tfm \
tex-DejaVuSans-BoldOblique-tlf-ts1.vf \
tex-DejaVuSans-BoldOblique-tlf-x2.tfm \
tex-DejaVuSans-ExtraLight-tlf-il2.tfm \
tex-DejaVuSans-ExtraLight-tlf-lgr.tfm \
tex-DejaVuSans-ExtraLight-tlf-ot1.tfm \
tex-DejaVuSans-ExtraLight-tlf-qx--base.tfm \
tex-DejaVuSans-ExtraLight-tlf-qx.tfm \
tex-DejaVuSans-ExtraLight-tlf-qx.vf \
tex-DejaVuSans-ExtraLight-tlf-t1--base.tfm \
tex-DejaVuSans-ExtraLight-tlf-t1.tfm \
tex-DejaVuSans-ExtraLight-tlf-t1.vf \
tex-DejaVuSans-ExtraLight-tlf-t2a--base.tfm \
tex-DejaVuSans-ExtraLight-tlf-t2a.tfm \
tex-DejaVuSans-ExtraLight-tlf-t2a.vf \
tex-DejaVuSans-ExtraLight-tlf-t2b--base.tfm \
tex-DejaVuSans-ExtraLight-tlf-t2b.tfm \
tex-DejaVuSans-ExtraLight-tlf-t2b.vf \
tex-DejaVuSans-ExtraLight-tlf-t2c--base.tfm \
tex-DejaVuSans-ExtraLight-tlf-t2c.tfm \
tex-DejaVuSans-ExtraLight-tlf-t2c.vf \
tex-DejaVuSans-ExtraLight-tlf-ts1--base.tfm \
tex-DejaVuSans-ExtraLight-tlf-ts1.tfm \
tex-DejaVuSans-ExtraLight-tlf-ts1.vf \
tex-DejaVuSans-ExtraLight-tlf-x2--base.tfm \
tex-DejaVuSans-ExtraLight-tlf-x2.tfm \
tex-DejaVuSans-ExtraLight-tlf-x2.vf \
tex-DejaVuSans-Oblique-tlf-il2.tfm \
tex-DejaVuSans-Oblique-tlf-lgr.tfm \
tex-DejaVuSans-Oblique-tlf-ot1.tfm \
tex-DejaVuSans-Oblique-tlf-qx--base.tfm \
tex-DejaVuSans-Oblique-tlf-qx.tfm \
tex-DejaVuSans-Oblique-tlf-qx.vf \
tex-DejaVuSans-Oblique-tlf-t1--base.tfm \
tex-DejaVuSans-Oblique-tlf-t1.tfm \
tex-DejaVuSans-Oblique-tlf-t1.vf \
tex-DejaVuSans-Oblique-tlf-t2a.tfm \
tex-DejaVuSans-Oblique-tlf-t2b.tfm \
tex-DejaVuSans-Oblique-tlf-t2c.tfm \
tex-DejaVuSans-Oblique-tlf-ts1--base.tfm \
tex-DejaVuSans-Oblique-tlf-ts1.tfm \
tex-DejaVuSans-Oblique-tlf-ts1.vf \
tex-DejaVuSans-Oblique-tlf-x2.tfm \
tex-DejaVuSans-tlf-il2.tfm \
tex-DejaVuSans-tlf-lgr.tfm \
tex-DejaVuSans-tlf-ot1.tfm \
tex-DejaVuSans-tlf-qx--base.tfm \
tex-DejaVuSans-tlf-qx.tfm \
tex-DejaVuSans-tlf-qx.vf \
tex-DejaVuSans-tlf-t1--base.tfm \
tex-DejaVuSans-tlf-t1.tfm \
tex-DejaVuSans-tlf-t1.vf \
tex-DejaVuSans-tlf-t2a.tfm \
tex-DejaVuSans-tlf-t2b.tfm \
tex-DejaVuSans-tlf-t2c.tfm \
tex-DejaVuSans-tlf-ts1--base.tfm \
tex-DejaVuSans-tlf-ts1.tfm \
tex-DejaVuSans-tlf-ts1.vf \
tex-DejaVuSans-tlf-x2.tfm \
tex-DejaVuSans.sty \
tex-DejaVuSansCondensed-Bold-tlf-il2.tfm \
tex-DejaVuSansCondensed-Bold-tlf-lgr.tfm \
tex-DejaVuSansCondensed-Bold-tlf-ot1.tfm \
tex-DejaVuSansCondensed-Bold-tlf-qx--base.tfm \
tex-DejaVuSansCondensed-Bold-tlf-qx.tfm \
tex-DejaVuSansCondensed-Bold-tlf-qx.vf \
tex-DejaVuSansCondensed-Bold-tlf-t1--base.tfm \
tex-DejaVuSansCondensed-Bold-tlf-t1.tfm \
tex-DejaVuSansCondensed-Bold-tlf-t1.vf \
tex-DejaVuSansCondensed-Bold-tlf-t2a.tfm \
tex-DejaVuSansCondensed-Bold-tlf-t2b.tfm \
tex-DejaVuSansCondensed-Bold-tlf-t2c.tfm \
tex-DejaVuSansCondensed-Bold-tlf-ts1--base.tfm \
tex-DejaVuSansCondensed-Bold-tlf-ts1.tfm \
tex-DejaVuSansCondensed-Bold-tlf-ts1.vf \
tex-DejaVuSansCondensed-Bold-tlf-x2.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-il2.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-lgr.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-ot1.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-qx--base.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-qx.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-qx.vf \
tex-DejaVuSansCondensed-BoldOblique-tlf-t1--base.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-t1.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-t1.vf \
tex-DejaVuSansCondensed-BoldOblique-tlf-t2a.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-t2b.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-t2c.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-ts1--base.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-ts1.tfm \
tex-DejaVuSansCondensed-BoldOblique-tlf-ts1.vf \
tex-DejaVuSansCondensed-BoldOblique-tlf-x2.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-il2.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-lgr.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-ot1.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-qx--base.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-qx.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-qx.vf \
tex-DejaVuSansCondensed-Oblique-tlf-t1--base.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-t1.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-t1.vf \
tex-DejaVuSansCondensed-Oblique-tlf-t2a.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-t2b.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-t2c.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-ts1--base.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-ts1.tfm \
tex-DejaVuSansCondensed-Oblique-tlf-ts1.vf \
tex-DejaVuSansCondensed-Oblique-tlf-x2.tfm \
tex-DejaVuSansCondensed-tlf-il2.tfm \
tex-DejaVuSansCondensed-tlf-lgr.tfm \
tex-DejaVuSansCondensed-tlf-ot1.tfm \
tex-DejaVuSansCondensed-tlf-qx--base.tfm \
tex-DejaVuSansCondensed-tlf-qx.tfm \
tex-DejaVuSansCondensed-tlf-qx.vf \
tex-DejaVuSansCondensed-tlf-t1--base.tfm \
tex-DejaVuSansCondensed-tlf-t1.tfm \
tex-DejaVuSansCondensed-tlf-t1.vf \
tex-DejaVuSansCondensed-tlf-t2a.tfm \
tex-DejaVuSansCondensed-tlf-t2b.tfm \
tex-DejaVuSansCondensed-tlf-t2c.tfm \
tex-DejaVuSansCondensed-tlf-ts1--base.tfm \
tex-DejaVuSansCondensed-tlf-ts1.tfm \
tex-DejaVuSansCondensed-tlf-ts1.vf \
tex-DejaVuSansCondensed-tlf-x2.tfm \
tex-DejaVuSansCondensed.sty \
tex-DejaVuSansMono-Bold-tlf-il2.tfm \
tex-DejaVuSansMono-Bold-tlf-lgr--base.tfm \
tex-DejaVuSansMono-Bold-tlf-lgr.tfm \
tex-DejaVuSansMono-Bold-tlf-lgr.vf \
tex-DejaVuSansMono-Bold-tlf-ot1.tfm \
tex-DejaVuSansMono-Bold-tlf-qx--base.tfm \
tex-DejaVuSansMono-Bold-tlf-qx.tfm \
tex-DejaVuSansMono-Bold-tlf-qx.vf \
tex-DejaVuSansMono-Bold-tlf-t1--base.tfm \
tex-DejaVuSansMono-Bold-tlf-t1.tfm \
tex-DejaVuSansMono-Bold-tlf-t1.vf \
tex-DejaVuSansMono-Bold-tlf-t2a--base.tfm \
tex-DejaVuSansMono-Bold-tlf-t2a.tfm \
tex-DejaVuSansMono-Bold-tlf-t2a.vf \
tex-DejaVuSansMono-Bold-tlf-t2b--base.tfm \
tex-DejaVuSansMono-Bold-tlf-t2b.tfm \
tex-DejaVuSansMono-Bold-tlf-t2b.vf \
tex-DejaVuSansMono-Bold-tlf-t2c--base.tfm \
tex-DejaVuSansMono-Bold-tlf-t2c.tfm \
tex-DejaVuSansMono-Bold-tlf-t2c.vf \
tex-DejaVuSansMono-Bold-tlf-ts1--base.tfm \
tex-DejaVuSansMono-Bold-tlf-ts1.tfm \
tex-DejaVuSansMono-Bold-tlf-ts1.vf \
tex-DejaVuSansMono-Bold-tlf-x2--base.tfm \
tex-DejaVuSansMono-Bold-tlf-x2.tfm \
tex-DejaVuSansMono-Bold-tlf-x2.vf \
tex-DejaVuSansMono-BoldOblique-tlf-il2.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-lgr--base.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-lgr.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-lgr.vf \
tex-DejaVuSansMono-BoldOblique-tlf-ot1.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-qx--base.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-qx.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-qx.vf \
tex-DejaVuSansMono-BoldOblique-tlf-t1--base.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-t1.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-t1.vf \
tex-DejaVuSansMono-BoldOblique-tlf-t2a--base.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-t2a.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-t2a.vf \
tex-DejaVuSansMono-BoldOblique-tlf-t2b--base.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-t2b.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-t2b.vf \
tex-DejaVuSansMono-BoldOblique-tlf-t2c--base.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-t2c.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-t2c.vf \
tex-DejaVuSansMono-BoldOblique-tlf-ts1--base.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-ts1.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-ts1.vf \
tex-DejaVuSansMono-BoldOblique-tlf-x2--base.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-x2.tfm \
tex-DejaVuSansMono-BoldOblique-tlf-x2.vf \
tex-DejaVuSansMono-Oblique-tlf-il2.tfm \
tex-DejaVuSansMono-Oblique-tlf-lgr--base.tfm \
tex-DejaVuSansMono-Oblique-tlf-lgr.tfm \
tex-DejaVuSansMono-Oblique-tlf-lgr.vf \
tex-DejaVuSansMono-Oblique-tlf-ot1.tfm \
tex-DejaVuSansMono-Oblique-tlf-qx--base.tfm \
tex-DejaVuSansMono-Oblique-tlf-qx.tfm \
tex-DejaVuSansMono-Oblique-tlf-qx.vf \
tex-DejaVuSansMono-Oblique-tlf-t1--base.tfm \
tex-DejaVuSansMono-Oblique-tlf-t1.tfm \
tex-DejaVuSansMono-Oblique-tlf-t1.vf \
tex-DejaVuSansMono-Oblique-tlf-t2a--base.tfm \
tex-DejaVuSansMono-Oblique-tlf-t2a.tfm \
tex-DejaVuSansMono-Oblique-tlf-t2a.vf \
tex-DejaVuSansMono-Oblique-tlf-t2b--base.tfm \
tex-DejaVuSansMono-Oblique-tlf-t2b.tfm \
tex-DejaVuSansMono-Oblique-tlf-t2b.vf \
tex-DejaVuSansMono-Oblique-tlf-t2c--base.tfm \
tex-DejaVuSansMono-Oblique-tlf-t2c.tfm \
tex-DejaVuSansMono-Oblique-tlf-t2c.vf \
tex-DejaVuSansMono-Oblique-tlf-ts1--base.tfm \
tex-DejaVuSansMono-Oblique-tlf-ts1.tfm \
tex-DejaVuSansMono-Oblique-tlf-ts1.vf \
tex-DejaVuSansMono-Oblique-tlf-x2--base.tfm \
tex-DejaVuSansMono-Oblique-tlf-x2.tfm \
tex-DejaVuSansMono-Oblique-tlf-x2.vf \
tex-DejaVuSansMono-tlf-il2.tfm \
tex-DejaVuSansMono-tlf-lgr--base.tfm \
tex-DejaVuSansMono-tlf-lgr.tfm \
tex-DejaVuSansMono-tlf-lgr.vf \
tex-DejaVuSansMono-tlf-ot1.tfm \
tex-DejaVuSansMono-tlf-qx--base.tfm \
tex-DejaVuSansMono-tlf-qx.tfm \
tex-DejaVuSansMono-tlf-qx.vf \
tex-DejaVuSansMono-tlf-t1--base.tfm \
tex-DejaVuSansMono-tlf-t1.tfm \
tex-DejaVuSansMono-tlf-t1.vf \
tex-DejaVuSansMono-tlf-t2a--base.tfm \
tex-DejaVuSansMono-tlf-t2a.tfm \
tex-DejaVuSansMono-tlf-t2a.vf \
tex-DejaVuSansMono-tlf-t2b--base.tfm \
tex-DejaVuSansMono-tlf-t2b.tfm \
tex-DejaVuSansMono-tlf-t2b.vf \
tex-DejaVuSansMono-tlf-t2c--base.tfm \
tex-DejaVuSansMono-tlf-t2c.tfm \
tex-DejaVuSansMono-tlf-t2c.vf \
tex-DejaVuSansMono-tlf-ts1--base.tfm \
tex-DejaVuSansMono-tlf-ts1.tfm \
tex-DejaVuSansMono-tlf-ts1.vf \
tex-DejaVuSansMono-tlf-x2--base.tfm \
tex-DejaVuSansMono-tlf-x2.tfm \
tex-DejaVuSansMono-tlf-x2.vf \
tex-DejaVuSansMono.sty \
tex-DejaVuSerif-Bold-tlf-il2.tfm \
tex-DejaVuSerif-Bold-tlf-lgr.tfm \
tex-DejaVuSerif-Bold-tlf-ot1.tfm \
tex-DejaVuSerif-Bold-tlf-qx--base.tfm \
tex-DejaVuSerif-Bold-tlf-qx.tfm \
tex-DejaVuSerif-Bold-tlf-qx.vf \
tex-DejaVuSerif-Bold-tlf-t1--base.tfm \
tex-DejaVuSerif-Bold-tlf-t1.tfm \
tex-DejaVuSerif-Bold-tlf-t1.vf \
tex-DejaVuSerif-Bold-tlf-t2a.tfm \
tex-DejaVuSerif-Bold-tlf-t2b.tfm \
tex-DejaVuSerif-Bold-tlf-t2c.tfm \
tex-DejaVuSerif-Bold-tlf-ts1--base.tfm \
tex-DejaVuSerif-Bold-tlf-ts1.tfm \
tex-DejaVuSerif-Bold-tlf-ts1.vf \
tex-DejaVuSerif-Bold-tlf-x2.tfm \
tex-DejaVuSerif-BoldItalic-tlf-il2.tfm \
tex-DejaVuSerif-BoldItalic-tlf-lgr.tfm \
tex-DejaVuSerif-BoldItalic-tlf-ot1.tfm \
tex-DejaVuSerif-BoldItalic-tlf-qx--base.tfm \
tex-DejaVuSerif-BoldItalic-tlf-qx.tfm \
tex-DejaVuSerif-BoldItalic-tlf-qx.vf \
tex-DejaVuSerif-BoldItalic-tlf-t1--base.tfm \
tex-DejaVuSerif-BoldItalic-tlf-t1.tfm \
tex-DejaVuSerif-BoldItalic-tlf-t1.vf \
tex-DejaVuSerif-BoldItalic-tlf-t2a.tfm \
tex-DejaVuSerif-BoldItalic-tlf-t2b.tfm \
tex-DejaVuSerif-BoldItalic-tlf-t2c.tfm \
tex-DejaVuSerif-BoldItalic-tlf-ts1--base.tfm \
tex-DejaVuSerif-BoldItalic-tlf-ts1.tfm \
tex-DejaVuSerif-BoldItalic-tlf-ts1.vf \
tex-DejaVuSerif-BoldItalic-tlf-x2.tfm \
tex-DejaVuSerif-Italic-tlf-il2.tfm \
tex-DejaVuSerif-Italic-tlf-lgr.tfm \
tex-DejaVuSerif-Italic-tlf-ot1.tfm \
tex-DejaVuSerif-Italic-tlf-qx--base.tfm \
tex-DejaVuSerif-Italic-tlf-qx.tfm \
tex-DejaVuSerif-Italic-tlf-qx.vf \
tex-DejaVuSerif-Italic-tlf-t1--base.tfm \
tex-DejaVuSerif-Italic-tlf-t1.tfm \
tex-DejaVuSerif-Italic-tlf-t1.vf \
tex-DejaVuSerif-Italic-tlf-t2a.tfm \
tex-DejaVuSerif-Italic-tlf-t2b.tfm \
tex-DejaVuSerif-Italic-tlf-t2c.tfm \
tex-DejaVuSerif-Italic-tlf-ts1--base.tfm \
tex-DejaVuSerif-Italic-tlf-ts1.tfm \
tex-DejaVuSerif-Italic-tlf-ts1.vf \
tex-DejaVuSerif-Italic-tlf-x2.tfm \
tex-DejaVuSerif-tlf-il2.tfm \
tex-DejaVuSerif-tlf-lgr.tfm \
tex-DejaVuSerif-tlf-ot1.tfm \
tex-DejaVuSerif-tlf-qx--base.tfm \
tex-DejaVuSerif-tlf-qx.tfm \
tex-DejaVuSerif-tlf-qx.vf \
tex-DejaVuSerif-tlf-t1--base.tfm \
tex-DejaVuSerif-tlf-t1.tfm \
tex-DejaVuSerif-tlf-t1.vf \
tex-DejaVuSerif-tlf-t2a.tfm \
tex-DejaVuSerif-tlf-t2b.tfm \
tex-DejaVuSerif-tlf-t2c.tfm \
tex-DejaVuSerif-tlf-ts1--base.tfm \
tex-DejaVuSerif-tlf-ts1.tfm \
tex-DejaVuSerif-tlf-ts1.vf \
tex-DejaVuSerif-tlf-x2.tfm \
tex-DejaVuSerif.sty \
tex-DejaVuSerifCondensed-Bold-tlf-il2.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-lgr.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-ot1.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-qx--base.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-qx.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-qx.vf \
tex-DejaVuSerifCondensed-Bold-tlf-t1--base.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-t1.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-t1.vf \
tex-DejaVuSerifCondensed-Bold-tlf-t2a.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-t2b.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-t2c.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-ts1--base.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-ts1.tfm \
tex-DejaVuSerifCondensed-Bold-tlf-ts1.vf \
tex-DejaVuSerifCondensed-Bold-tlf-x2.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-il2.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-lgr.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-ot1.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-qx--base.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-qx.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-qx.vf \
tex-DejaVuSerifCondensed-BoldItalic-tlf-t1--base.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-t1.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-t1.vf \
tex-DejaVuSerifCondensed-BoldItalic-tlf-t2a.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-t2b.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-t2c.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-ts1--base.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-ts1.tfm \
tex-DejaVuSerifCondensed-BoldItalic-tlf-ts1.vf \
tex-DejaVuSerifCondensed-BoldItalic-tlf-x2.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-il2.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-lgr.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-ot1.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-qx--base.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-qx.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-qx.vf \
tex-DejaVuSerifCondensed-Italic-tlf-t1--base.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-t1.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-t1.vf \
tex-DejaVuSerifCondensed-Italic-tlf-t2a.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-t2b.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-t2c.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-ts1--base.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-ts1.tfm \
tex-DejaVuSerifCondensed-Italic-tlf-ts1.vf \
tex-DejaVuSerifCondensed-Italic-tlf-x2.tfm \
tex-DejaVuSerifCondensed-tlf-il2.tfm \
tex-DejaVuSerifCondensed-tlf-lgr.tfm \
tex-DejaVuSerifCondensed-tlf-ot1.tfm \
tex-DejaVuSerifCondensed-tlf-qx--base.tfm \
tex-DejaVuSerifCondensed-tlf-qx.tfm \
tex-DejaVuSerifCondensed-tlf-qx.vf \
tex-DejaVuSerifCondensed-tlf-t1--base.tfm \
tex-DejaVuSerifCondensed-tlf-t1.tfm \
tex-DejaVuSerifCondensed-tlf-t1.vf \
tex-DejaVuSerifCondensed-tlf-t2a.tfm \
tex-DejaVuSerifCondensed-tlf-t2b.tfm \
tex-DejaVuSerifCondensed-tlf-t2c.tfm \
tex-DejaVuSerifCondensed-tlf-ts1--base.tfm \
tex-DejaVuSerifCondensed-tlf-ts1.tfm \
tex-DejaVuSerifCondensed-tlf-ts1.vf \
tex-DejaVuSerifCondensed-tlf-x2.tfm \
tex-DejaVuSerifCondensed.sty \
tex-IL2DejaVuSans-TLF.fd \
tex-IL2DejaVuSansCondensed-TLF.fd \
tex-IL2DejaVuSansMono-TLF.fd \
tex-IL2DejaVuSerif-TLF.fd \
tex-IL2DejaVuSerifCondensed-TLF.fd \
tex-LGRDejaVuSans-TLF.fd \
tex-LGRDejaVuSansCondensed-TLF.fd \
tex-LGRDejaVuSansMono-TLF.fd \
tex-LGRDejaVuSerif-TLF.fd \
tex-LGRDejaVuSerifCondensed-TLF.fd \
tex-OT1DejaVuSans-TLF.fd \
tex-OT1DejaVuSansCondensed-TLF.fd \
tex-OT1DejaVuSansMono-TLF.fd \
tex-OT1DejaVuSerif-TLF.fd \
tex-OT1DejaVuSerifCondensed-TLF.fd \
tex-QXDejaVuSans-TLF.fd \
tex-QXDejaVuSansCondensed-TLF.fd \
tex-QXDejaVuSansMono-TLF.fd \
tex-QXDejaVuSerif-TLF.fd \
tex-QXDejaVuSerifCondensed-TLF.fd \
tex-T1DejaVuSans-TLF.fd \
tex-T1DejaVuSansCondensed-TLF.fd \
tex-T1DejaVuSansMono-TLF.fd \
tex-T1DejaVuSerif-TLF.fd \
tex-T1DejaVuSerifCondensed-TLF.fd \
tex-T2ADejaVuSans-TLF.fd \
tex-T2ADejaVuSansCondensed-TLF.fd \
tex-T2ADejaVuSansMono-TLF.fd \
tex-T2ADejaVuSerif-TLF.fd \
tex-T2ADejaVuSerifCondensed-TLF.fd \
tex-T2BDejaVuSans-TLF.fd \
tex-T2BDejaVuSansCondensed-TLF.fd \
tex-T2BDejaVuSansMono-TLF.fd \
tex-T2BDejaVuSerif-TLF.fd \
tex-T2BDejaVuSerifCondensed-TLF.fd \
tex-T2CDejaVuSans-TLF.fd \
tex-T2CDejaVuSansCondensed-TLF.fd \
tex-T2CDejaVuSansMono-TLF.fd \
tex-T2CDejaVuSerif-TLF.fd \
tex-T2CDejaVuSerifCondensed-TLF.fd \
tex-TS1DejaVuSans-TLF.fd \
tex-TS1DejaVuSansCondensed-TLF.fd \
tex-TS1DejaVuSansMono-TLF.fd \
tex-TS1DejaVuSerif-TLF.fd \
tex-TS1DejaVuSerifCondensed-TLF.fd \
tex-X2DejaVuSans-TLF.fd \
tex-X2DejaVuSansCondensed-TLF.fd \
tex-X2DejaVuSansMono-TLF.fd \
tex-X2DejaVuSerif-TLF.fd \
tex-X2DejaVuSerifCondensed-TLF.fd \
tex-dejavu-truetype.map \
tex-dejavu-type1.map \
tex-dejavu.sty \
tex-dejavumono-il2.enc \
tex-dejavumono-lgr.enc \
tex-dejavumono-ot1.enc \
tex-dejavumono-qx.enc \
tex-dejavumono-t1-truetype.enc \
tex-dejavumono-t1-type1.enc \
tex-dejavumono-t2a.enc \
tex-dejavumono-t2b.enc \
tex-dejavumono-t2c.enc \
tex-dejavumono-ts1.enc \
tex-dejavumono-x2.enc \
tex-dejavusans-il2.enc \
tex-dejavusans-lgr.enc \
tex-dejavusans-ot1.enc \
tex-dejavusans-qx.enc \
tex-dejavusans-t1-truetype.enc \
tex-dejavusans-t1-type1.enc \
tex-dejavusans-t2a.enc \
tex-dejavusans-t2b.enc \
tex-dejavusans-t2c.enc \
tex-dejavusans-ts1.enc \
tex-dejavusans-x2.enc \
tex-dejavusanslight-il2.enc \
tex-dejavusanslight-lgr.enc \
tex-dejavusanslight-ot1.enc \
tex-dejavusanslight-qx.enc \
tex-dejavusanslight-t1-truetype.enc \
tex-dejavusanslight-t1-type1.enc \
tex-dejavusanslight-t2a.enc \
tex-dejavusanslight-t2b.enc \
tex-dejavusanslight-t2c.enc \
tex-dejavusanslight-ts1.enc \
tex-dejavusanslight-x2.enc \
tex-dejavuserif-il2.enc \
tex-dejavuserif-lgr.enc \
tex-dejavuserif-ot1.enc \
tex-dejavuserif-qx.enc \
tex-dejavuserif-t1-truetype.enc \
tex-dejavuserif-t1-type1.enc \
tex-dejavuserif-t2a.enc \
tex-dejavuserif-t2b.enc \
tex-dejavuserif-t2c.enc \
tex-dejavuserif-ts1.enc \
tex-dejavuserif-x2.enc \
texlive-dejavu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-updmap.cfg \
texlive \
texlive-dejavu-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
