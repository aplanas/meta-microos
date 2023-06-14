SUMMARY = "Extension of TeXGyreSchola (New Century Schoolbook) with math support"
DESCRIPTION = "This package contains an extension of TeXGyreSchola with \
extensive superiors, inferior figures, upright punctuation \
glyphs added to the Italic face for a theorem font, plus \
slanted and bold slanted faces. Math support is provided by one \
of two options to newtxmath, one of which uses an adaptation of \
the fourier math Greek letters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.033svn61836"

RPM_NAME = "texlive-scholax-2023.201.1.033svn61836-53.1.noarch.rpm"
RPM_HASH = "5eef5f5f6bb4d283bd2c7ad6487cf1a51e7a2fcfc8df2dc664250456f7101e156d4039300a889f07bdff2233d1e13772305a748385be0b17a40884dd20910d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1TeXGyreScholaX-Inf.fd \
tex-LY1TeXGyreScholaX-LF.fd \
tex-LY1TeXGyreScholaX-OsF.fd \
tex-LY1TeXGyreScholaX-Sup.fd \
tex-LY1TeXGyreScholaX-TLF.fd \
tex-LY1TeXGyreScholaX-TOsF.fd \
tex-NCXFourierBMI.tfm \
tex-NCXFourierBMR.tfm \
tex-NCXFourierMI.tfm \
tex-NCXFourierMR.tfm \
tex-NCXMathBMI.tfm \
tex-NCXMathBRM.tfm \
tex-NCXMathMI.tfm \
tex-NCXMathRM.tfm \
tex-OT1TeXGyreScholaX-Inf.fd \
tex-OT1TeXGyreScholaX-LF.fd \
tex-OT1TeXGyreScholaX-OsF.fd \
tex-OT1TeXGyreScholaX-Sup.fd \
tex-OT1TeXGyreScholaX-TLF.fd \
tex-OT1TeXGyreScholaX-TOsF.fd \
tex-ScholaX.map \
tex-T1TeXGyreScholaX-Inf.fd \
tex-T1TeXGyreScholaX-LF.fd \
tex-T1TeXGyreScholaX-OsF.fd \
tex-T1TeXGyreScholaX-Sup.fd \
tex-T1TeXGyreScholaX-TLF.fd \
tex-T1TeXGyreScholaX-TOsF.fd \
tex-TS1TeXGyreScholaX-LF.fd \
tex-TS1TeXGyreScholaX-OsF.fd \
tex-TS1TeXGyreScholaX-TLF.fd \
tex-TS1TeXGyreScholaX-TOsF.fd \
tex-TeXGyreScholaX-Bold-inf-ly1.tfm \
tex-TeXGyreScholaX-Bold-inf-ot1.tfm \
tex-TeXGyreScholaX-Bold-inf-t1--base.tfm \
tex-TeXGyreScholaX-Bold-inf-t1.tfm \
tex-TeXGyreScholaX-Bold-inf-t1.vf \
tex-TeXGyreScholaX-Bold-lf-ly1.tfm \
tex-TeXGyreScholaX-Bold-lf-ot1.tfm \
tex-TeXGyreScholaX-Bold-lf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Bold-lf-sc-ly1.tfm \
tex-TeXGyreScholaX-Bold-lf-sc-ly1.vf \
tex-TeXGyreScholaX-Bold-lf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Bold-lf-sc-ot1.tfm \
tex-TeXGyreScholaX-Bold-lf-sc-ot1.vf \
tex-TeXGyreScholaX-Bold-lf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Bold-lf-sc-t1.tfm \
tex-TeXGyreScholaX-Bold-lf-sc-t1.vf \
tex-TeXGyreScholaX-Bold-lf-t1--base.tfm \
tex-TeXGyreScholaX-Bold-lf-t1.tfm \
tex-TeXGyreScholaX-Bold-lf-t1.vf \
tex-TeXGyreScholaX-Bold-lf-ts1--base.tfm \
tex-TeXGyreScholaX-Bold-lf-ts1.tfm \
tex-TeXGyreScholaX-Bold-lf-ts1.vf \
tex-TeXGyreScholaX-Bold-osf-ly1.tfm \
tex-TeXGyreScholaX-Bold-osf-ot1.tfm \
tex-TeXGyreScholaX-Bold-osf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Bold-osf-sc-ly1.tfm \
tex-TeXGyreScholaX-Bold-osf-sc-ly1.vf \
tex-TeXGyreScholaX-Bold-osf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Bold-osf-sc-ot1.tfm \
tex-TeXGyreScholaX-Bold-osf-sc-ot1.vf \
tex-TeXGyreScholaX-Bold-osf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Bold-osf-sc-t1.tfm \
tex-TeXGyreScholaX-Bold-osf-sc-t1.vf \
tex-TeXGyreScholaX-Bold-osf-t1--base.tfm \
tex-TeXGyreScholaX-Bold-osf-t1.tfm \
tex-TeXGyreScholaX-Bold-osf-t1.vf \
tex-TeXGyreScholaX-Bold-osf-ts1--base.tfm \
tex-TeXGyreScholaX-Bold-osf-ts1.tfm \
tex-TeXGyreScholaX-Bold-osf-ts1.vf \
tex-TeXGyreScholaX-Bold-sup-ly1.tfm \
tex-TeXGyreScholaX-Bold-sup-ot1.tfm \
tex-TeXGyreScholaX-Bold-sup-t1--base.tfm \
tex-TeXGyreScholaX-Bold-sup-t1.tfm \
tex-TeXGyreScholaX-Bold-sup-t1.vf \
tex-TeXGyreScholaX-Bold-tlf-ly1.tfm \
tex-TeXGyreScholaX-Bold-tlf-ot1.tfm \
tex-TeXGyreScholaX-Bold-tlf-ot1G.tfm \
tex-TeXGyreScholaX-Bold-tlf-ot1G.vf \
tex-TeXGyreScholaX-Bold-tlf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Bold-tlf-sc-ly1.tfm \
tex-TeXGyreScholaX-Bold-tlf-sc-ly1.vf \
tex-TeXGyreScholaX-Bold-tlf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Bold-tlf-sc-ot1.tfm \
tex-TeXGyreScholaX-Bold-tlf-sc-ot1.vf \
tex-TeXGyreScholaX-Bold-tlf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Bold-tlf-sc-t1.tfm \
tex-TeXGyreScholaX-Bold-tlf-sc-t1.vf \
tex-TeXGyreScholaX-Bold-tlf-t1--base.tfm \
tex-TeXGyreScholaX-Bold-tlf-t1.tfm \
tex-TeXGyreScholaX-Bold-tlf-t1.vf \
tex-TeXGyreScholaX-Bold-tlf-ts1--base.tfm \
tex-TeXGyreScholaX-Bold-tlf-ts1.tfm \
tex-TeXGyreScholaX-Bold-tlf-ts1.vf \
tex-TeXGyreScholaX-Bold-tosf-ly1.tfm \
tex-TeXGyreScholaX-Bold-tosf-ot1.tfm \
tex-TeXGyreScholaX-Bold-tosf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Bold-tosf-sc-ly1.tfm \
tex-TeXGyreScholaX-Bold-tosf-sc-ly1.vf \
tex-TeXGyreScholaX-Bold-tosf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Bold-tosf-sc-ot1.tfm \
tex-TeXGyreScholaX-Bold-tosf-sc-ot1.vf \
tex-TeXGyreScholaX-Bold-tosf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Bold-tosf-sc-t1.tfm \
tex-TeXGyreScholaX-Bold-tosf-sc-t1.vf \
tex-TeXGyreScholaX-Bold-tosf-t1--base.tfm \
tex-TeXGyreScholaX-Bold-tosf-t1.tfm \
tex-TeXGyreScholaX-Bold-tosf-t1.vf \
tex-TeXGyreScholaX-Bold-tosf-ts1--base.tfm \
tex-TeXGyreScholaX-Bold-tosf-ts1.tfm \
tex-TeXGyreScholaX-Bold-tosf-ts1.vf \
tex-TeXGyreScholaX-BoldItalic-inf-ly1.tfm \
tex-TeXGyreScholaX-BoldItalic-inf-ot1.tfm \
tex-TeXGyreScholaX-BoldItalic-inf-t1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-inf-t1.tfm \
tex-TeXGyreScholaX-BoldItalic-inf-t1.vf \
tex-TeXGyreScholaX-BoldItalic-lf-ly1.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-ot1.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-sc-ly1.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-sc-ly1.vf \
tex-TeXGyreScholaX-BoldItalic-lf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-sc-ot1.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-sc-ot1.vf \
tex-TeXGyreScholaX-BoldItalic-lf-sc-t1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-sc-t1.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-sc-t1.vf \
tex-TeXGyreScholaX-BoldItalic-lf-t1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-t1.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-t1.vf \
tex-TeXGyreScholaX-BoldItalic-lf-ts1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-ts1.tfm \
tex-TeXGyreScholaX-BoldItalic-lf-ts1.vf \
tex-TeXGyreScholaX-BoldItalic-osf-ly1.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-ot1.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-sc-ly1.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-sc-ly1.vf \
tex-TeXGyreScholaX-BoldItalic-osf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-sc-ot1.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-sc-ot1.vf \
tex-TeXGyreScholaX-BoldItalic-osf-sc-t1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-sc-t1.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-sc-t1.vf \
tex-TeXGyreScholaX-BoldItalic-osf-t1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-t1.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-t1.vf \
tex-TeXGyreScholaX-BoldItalic-osf-ts1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-ts1.tfm \
tex-TeXGyreScholaX-BoldItalic-osf-ts1.vf \
tex-TeXGyreScholaX-BoldItalic-sup-ly1.tfm \
tex-TeXGyreScholaX-BoldItalic-sup-ot1.tfm \
tex-TeXGyreScholaX-BoldItalic-sup-t1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-sup-t1.tfm \
tex-TeXGyreScholaX-BoldItalic-sup-t1.vf \
tex-TeXGyreScholaX-BoldItalic-tlf-ly1.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-ot1.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-ot1G.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-ot1G.vf \
tex-TeXGyreScholaX-BoldItalic-tlf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-sc-ly1.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-sc-ly1.vf \
tex-TeXGyreScholaX-BoldItalic-tlf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-sc-ot1.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-sc-ot1.vf \
tex-TeXGyreScholaX-BoldItalic-tlf-sc-t1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-sc-t1.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-sc-t1.vf \
tex-TeXGyreScholaX-BoldItalic-tlf-t1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-t1.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-t1.vf \
tex-TeXGyreScholaX-BoldItalic-tlf-ts1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-ts1.tfm \
tex-TeXGyreScholaX-BoldItalic-tlf-ts1.vf \
tex-TeXGyreScholaX-BoldItalic-tosf-ly1.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-ot1.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-sc-ly1.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-sc-ly1.vf \
tex-TeXGyreScholaX-BoldItalic-tosf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-sc-ot1.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-sc-ot1.vf \
tex-TeXGyreScholaX-BoldItalic-tosf-sc-t1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-sc-t1.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-sc-t1.vf \
tex-TeXGyreScholaX-BoldItalic-tosf-t1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-t1.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-t1.vf \
tex-TeXGyreScholaX-BoldItalic-tosf-ts1--base.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-ts1.tfm \
tex-TeXGyreScholaX-BoldItalic-tosf-ts1.vf \
tex-TeXGyreScholaX-BoldSlanted-inf-ly1.tfm \
tex-TeXGyreScholaX-BoldSlanted-inf-ot1.tfm \
tex-TeXGyreScholaX-BoldSlanted-inf-t1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-inf-t1.tfm \
tex-TeXGyreScholaX-BoldSlanted-inf-t1.vf \
tex-TeXGyreScholaX-BoldSlanted-lf-ly1.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-ot1.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-sc-ly1.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-sc-ly1.vf \
tex-TeXGyreScholaX-BoldSlanted-lf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-sc-ot1.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-sc-ot1.vf \
tex-TeXGyreScholaX-BoldSlanted-lf-sc-t1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-sc-t1.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-sc-t1.vf \
tex-TeXGyreScholaX-BoldSlanted-lf-t1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-t1.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-t1.vf \
tex-TeXGyreScholaX-BoldSlanted-lf-ts1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-ts1.tfm \
tex-TeXGyreScholaX-BoldSlanted-lf-ts1.vf \
tex-TeXGyreScholaX-BoldSlanted-osf-ly1.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-ot1.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-sc-ly1.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-sc-ly1.vf \
tex-TeXGyreScholaX-BoldSlanted-osf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-sc-ot1.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-sc-ot1.vf \
tex-TeXGyreScholaX-BoldSlanted-osf-sc-t1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-sc-t1.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-sc-t1.vf \
tex-TeXGyreScholaX-BoldSlanted-osf-t1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-t1.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-t1.vf \
tex-TeXGyreScholaX-BoldSlanted-osf-ts1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-ts1.tfm \
tex-TeXGyreScholaX-BoldSlanted-osf-ts1.vf \
tex-TeXGyreScholaX-BoldSlanted-sup-ly1.tfm \
tex-TeXGyreScholaX-BoldSlanted-sup-ot1.tfm \
tex-TeXGyreScholaX-BoldSlanted-sup-t1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-sup-t1.tfm \
tex-TeXGyreScholaX-BoldSlanted-sup-t1.vf \
tex-TeXGyreScholaX-BoldSlanted-tlf-ly1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-ot1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-ot1G.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-ot1G.vf \
tex-TeXGyreScholaX-BoldSlanted-tlf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-sc-ly1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-sc-ly1.vf \
tex-TeXGyreScholaX-BoldSlanted-tlf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-sc-ot1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-sc-ot1.vf \
tex-TeXGyreScholaX-BoldSlanted-tlf-sc-t1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-sc-t1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-sc-t1.vf \
tex-TeXGyreScholaX-BoldSlanted-tlf-t1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-t1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-t1.vf \
tex-TeXGyreScholaX-BoldSlanted-tlf-ts1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-ts1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tlf-ts1.vf \
tex-TeXGyreScholaX-BoldSlanted-tosf-ly1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-ot1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-sc-ly1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-sc-ly1.vf \
tex-TeXGyreScholaX-BoldSlanted-tosf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-sc-ot1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-sc-ot1.vf \
tex-TeXGyreScholaX-BoldSlanted-tosf-sc-t1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-sc-t1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-sc-t1.vf \
tex-TeXGyreScholaX-BoldSlanted-tosf-t1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-t1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-t1.vf \
tex-TeXGyreScholaX-BoldSlanted-tosf-ts1--base.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-ts1.tfm \
tex-TeXGyreScholaX-BoldSlanted-tosf-ts1.vf \
tex-TeXGyreScholaX-Italic-inf-ly1.tfm \
tex-TeXGyreScholaX-Italic-inf-ot1.tfm \
tex-TeXGyreScholaX-Italic-inf-t1--base.tfm \
tex-TeXGyreScholaX-Italic-inf-t1.tfm \
tex-TeXGyreScholaX-Italic-inf-t1.vf \
tex-TeXGyreScholaX-Italic-lf-ly1.tfm \
tex-TeXGyreScholaX-Italic-lf-ot1.tfm \
tex-TeXGyreScholaX-Italic-lf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Italic-lf-sc-ly1.tfm \
tex-TeXGyreScholaX-Italic-lf-sc-ly1.vf \
tex-TeXGyreScholaX-Italic-lf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Italic-lf-sc-ot1.tfm \
tex-TeXGyreScholaX-Italic-lf-sc-ot1.vf \
tex-TeXGyreScholaX-Italic-lf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Italic-lf-sc-t1.tfm \
tex-TeXGyreScholaX-Italic-lf-sc-t1.vf \
tex-TeXGyreScholaX-Italic-lf-t1--base.tfm \
tex-TeXGyreScholaX-Italic-lf-t1.tfm \
tex-TeXGyreScholaX-Italic-lf-t1.vf \
tex-TeXGyreScholaX-Italic-lf-ts1--base.tfm \
tex-TeXGyreScholaX-Italic-lf-ts1.tfm \
tex-TeXGyreScholaX-Italic-lf-ts1.vf \
tex-TeXGyreScholaX-Italic-osf-ly1.tfm \
tex-TeXGyreScholaX-Italic-osf-ot1.tfm \
tex-TeXGyreScholaX-Italic-osf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Italic-osf-sc-ly1.tfm \
tex-TeXGyreScholaX-Italic-osf-sc-ly1.vf \
tex-TeXGyreScholaX-Italic-osf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Italic-osf-sc-ot1.tfm \
tex-TeXGyreScholaX-Italic-osf-sc-ot1.vf \
tex-TeXGyreScholaX-Italic-osf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Italic-osf-sc-t1.tfm \
tex-TeXGyreScholaX-Italic-osf-sc-t1.vf \
tex-TeXGyreScholaX-Italic-osf-t1--base.tfm \
tex-TeXGyreScholaX-Italic-osf-t1.tfm \
tex-TeXGyreScholaX-Italic-osf-t1.vf \
tex-TeXGyreScholaX-Italic-osf-ts1--base.tfm \
tex-TeXGyreScholaX-Italic-osf-ts1.tfm \
tex-TeXGyreScholaX-Italic-osf-ts1.vf \
tex-TeXGyreScholaX-Italic-sup-ly1.tfm \
tex-TeXGyreScholaX-Italic-sup-ot1.tfm \
tex-TeXGyreScholaX-Italic-sup-t1--base.tfm \
tex-TeXGyreScholaX-Italic-sup-t1.tfm \
tex-TeXGyreScholaX-Italic-sup-t1.vf \
tex-TeXGyreScholaX-Italic-tlf-ly1.tfm \
tex-TeXGyreScholaX-Italic-tlf-ot1.tfm \
tex-TeXGyreScholaX-Italic-tlf-ot1G.tfm \
tex-TeXGyreScholaX-Italic-tlf-ot1G.vf \
tex-TeXGyreScholaX-Italic-tlf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Italic-tlf-sc-ly1.tfm \
tex-TeXGyreScholaX-Italic-tlf-sc-ly1.vf \
tex-TeXGyreScholaX-Italic-tlf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Italic-tlf-sc-ot1.tfm \
tex-TeXGyreScholaX-Italic-tlf-sc-ot1.vf \
tex-TeXGyreScholaX-Italic-tlf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Italic-tlf-sc-t1.tfm \
tex-TeXGyreScholaX-Italic-tlf-sc-t1.vf \
tex-TeXGyreScholaX-Italic-tlf-t1--base.tfm \
tex-TeXGyreScholaX-Italic-tlf-t1.tfm \
tex-TeXGyreScholaX-Italic-tlf-t1.vf \
tex-TeXGyreScholaX-Italic-tlf-ts1--base.tfm \
tex-TeXGyreScholaX-Italic-tlf-ts1.tfm \
tex-TeXGyreScholaX-Italic-tlf-ts1.vf \
tex-TeXGyreScholaX-Italic-tosf-ly1.tfm \
tex-TeXGyreScholaX-Italic-tosf-ot1.tfm \
tex-TeXGyreScholaX-Italic-tosf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Italic-tosf-sc-ly1.tfm \
tex-TeXGyreScholaX-Italic-tosf-sc-ly1.vf \
tex-TeXGyreScholaX-Italic-tosf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Italic-tosf-sc-ot1.tfm \
tex-TeXGyreScholaX-Italic-tosf-sc-ot1.vf \
tex-TeXGyreScholaX-Italic-tosf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Italic-tosf-sc-t1.tfm \
tex-TeXGyreScholaX-Italic-tosf-sc-t1.vf \
tex-TeXGyreScholaX-Italic-tosf-t1--base.tfm \
tex-TeXGyreScholaX-Italic-tosf-t1.tfm \
tex-TeXGyreScholaX-Italic-tosf-t1.vf \
tex-TeXGyreScholaX-Italic-tosf-ts1--base.tfm \
tex-TeXGyreScholaX-Italic-tosf-ts1.tfm \
tex-TeXGyreScholaX-Italic-tosf-ts1.vf \
tex-TeXGyreScholaX-Regular-inf-ly1.tfm \
tex-TeXGyreScholaX-Regular-inf-ot1.tfm \
tex-TeXGyreScholaX-Regular-inf-t1--base.tfm \
tex-TeXGyreScholaX-Regular-inf-t1.tfm \
tex-TeXGyreScholaX-Regular-inf-t1.vf \
tex-TeXGyreScholaX-Regular-lf-ly1.tfm \
tex-TeXGyreScholaX-Regular-lf-ot1.tfm \
tex-TeXGyreScholaX-Regular-lf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Regular-lf-sc-ly1.tfm \
tex-TeXGyreScholaX-Regular-lf-sc-ly1.vf \
tex-TeXGyreScholaX-Regular-lf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Regular-lf-sc-ot1.tfm \
tex-TeXGyreScholaX-Regular-lf-sc-ot1.vf \
tex-TeXGyreScholaX-Regular-lf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Regular-lf-sc-t1.tfm \
tex-TeXGyreScholaX-Regular-lf-sc-t1.vf \
tex-TeXGyreScholaX-Regular-lf-t1--base.tfm \
tex-TeXGyreScholaX-Regular-lf-t1.tfm \
tex-TeXGyreScholaX-Regular-lf-t1.vf \
tex-TeXGyreScholaX-Regular-lf-ts1--base.tfm \
tex-TeXGyreScholaX-Regular-lf-ts1.tfm \
tex-TeXGyreScholaX-Regular-lf-ts1.vf \
tex-TeXGyreScholaX-Regular-osf-ly1.tfm \
tex-TeXGyreScholaX-Regular-osf-ot1.tfm \
tex-TeXGyreScholaX-Regular-osf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Regular-osf-sc-ly1.tfm \
tex-TeXGyreScholaX-Regular-osf-sc-ly1.vf \
tex-TeXGyreScholaX-Regular-osf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Regular-osf-sc-ot1.tfm \
tex-TeXGyreScholaX-Regular-osf-sc-ot1.vf \
tex-TeXGyreScholaX-Regular-osf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Regular-osf-sc-t1.tfm \
tex-TeXGyreScholaX-Regular-osf-sc-t1.vf \
tex-TeXGyreScholaX-Regular-osf-t1--base.tfm \
tex-TeXGyreScholaX-Regular-osf-t1.tfm \
tex-TeXGyreScholaX-Regular-osf-t1.vf \
tex-TeXGyreScholaX-Regular-osf-ts1--base.tfm \
tex-TeXGyreScholaX-Regular-osf-ts1.tfm \
tex-TeXGyreScholaX-Regular-osf-ts1.vf \
tex-TeXGyreScholaX-Regular-sup-ly1.tfm \
tex-TeXGyreScholaX-Regular-sup-ot1.tfm \
tex-TeXGyreScholaX-Regular-sup-t1--base.tfm \
tex-TeXGyreScholaX-Regular-sup-t1.tfm \
tex-TeXGyreScholaX-Regular-sup-t1.vf \
tex-TeXGyreScholaX-Regular-tlf-ly1.tfm \
tex-TeXGyreScholaX-Regular-tlf-ot1.tfm \
tex-TeXGyreScholaX-Regular-tlf-ot1G.tfm \
tex-TeXGyreScholaX-Regular-tlf-ot1G.vf \
tex-TeXGyreScholaX-Regular-tlf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Regular-tlf-sc-ly1.tfm \
tex-TeXGyreScholaX-Regular-tlf-sc-ly1.vf \
tex-TeXGyreScholaX-Regular-tlf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Regular-tlf-sc-ot1.tfm \
tex-TeXGyreScholaX-Regular-tlf-sc-ot1.vf \
tex-TeXGyreScholaX-Regular-tlf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Regular-tlf-sc-t1.tfm \
tex-TeXGyreScholaX-Regular-tlf-sc-t1.vf \
tex-TeXGyreScholaX-Regular-tlf-t1--base.tfm \
tex-TeXGyreScholaX-Regular-tlf-t1.tfm \
tex-TeXGyreScholaX-Regular-tlf-t1.vf \
tex-TeXGyreScholaX-Regular-tlf-ts1--base.tfm \
tex-TeXGyreScholaX-Regular-tlf-ts1.tfm \
tex-TeXGyreScholaX-Regular-tlf-ts1.vf \
tex-TeXGyreScholaX-Regular-tosf-ly1.tfm \
tex-TeXGyreScholaX-Regular-tosf-ot1.tfm \
tex-TeXGyreScholaX-Regular-tosf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Regular-tosf-sc-ly1.tfm \
tex-TeXGyreScholaX-Regular-tosf-sc-ly1.vf \
tex-TeXGyreScholaX-Regular-tosf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Regular-tosf-sc-ot1.tfm \
tex-TeXGyreScholaX-Regular-tosf-sc-ot1.vf \
tex-TeXGyreScholaX-Regular-tosf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Regular-tosf-sc-t1.tfm \
tex-TeXGyreScholaX-Regular-tosf-sc-t1.vf \
tex-TeXGyreScholaX-Regular-tosf-t1--base.tfm \
tex-TeXGyreScholaX-Regular-tosf-t1.tfm \
tex-TeXGyreScholaX-Regular-tosf-t1.vf \
tex-TeXGyreScholaX-Regular-tosf-ts1--base.tfm \
tex-TeXGyreScholaX-Regular-tosf-ts1.tfm \
tex-TeXGyreScholaX-Regular-tosf-ts1.vf \
tex-TeXGyreScholaX-Slanted-inf-ly1.tfm \
tex-TeXGyreScholaX-Slanted-inf-ot1.tfm \
tex-TeXGyreScholaX-Slanted-inf-t1--base.tfm \
tex-TeXGyreScholaX-Slanted-inf-t1.tfm \
tex-TeXGyreScholaX-Slanted-inf-t1.vf \
tex-TeXGyreScholaX-Slanted-lf-ly1.tfm \
tex-TeXGyreScholaX-Slanted-lf-ot1.tfm \
tex-TeXGyreScholaX-Slanted-lf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Slanted-lf-sc-ly1.tfm \
tex-TeXGyreScholaX-Slanted-lf-sc-ly1.vf \
tex-TeXGyreScholaX-Slanted-lf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Slanted-lf-sc-ot1.tfm \
tex-TeXGyreScholaX-Slanted-lf-sc-ot1.vf \
tex-TeXGyreScholaX-Slanted-lf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Slanted-lf-sc-t1.tfm \
tex-TeXGyreScholaX-Slanted-lf-sc-t1.vf \
tex-TeXGyreScholaX-Slanted-lf-t1--base.tfm \
tex-TeXGyreScholaX-Slanted-lf-t1.tfm \
tex-TeXGyreScholaX-Slanted-lf-t1.vf \
tex-TeXGyreScholaX-Slanted-lf-ts1--base.tfm \
tex-TeXGyreScholaX-Slanted-lf-ts1.tfm \
tex-TeXGyreScholaX-Slanted-lf-ts1.vf \
tex-TeXGyreScholaX-Slanted-osf-ly1.tfm \
tex-TeXGyreScholaX-Slanted-osf-ot1.tfm \
tex-TeXGyreScholaX-Slanted-osf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Slanted-osf-sc-ly1.tfm \
tex-TeXGyreScholaX-Slanted-osf-sc-ly1.vf \
tex-TeXGyreScholaX-Slanted-osf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Slanted-osf-sc-ot1.tfm \
tex-TeXGyreScholaX-Slanted-osf-sc-ot1.vf \
tex-TeXGyreScholaX-Slanted-osf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Slanted-osf-sc-t1.tfm \
tex-TeXGyreScholaX-Slanted-osf-sc-t1.vf \
tex-TeXGyreScholaX-Slanted-osf-t1--base.tfm \
tex-TeXGyreScholaX-Slanted-osf-t1.tfm \
tex-TeXGyreScholaX-Slanted-osf-t1.vf \
tex-TeXGyreScholaX-Slanted-osf-ts1--base.tfm \
tex-TeXGyreScholaX-Slanted-osf-ts1.tfm \
tex-TeXGyreScholaX-Slanted-osf-ts1.vf \
tex-TeXGyreScholaX-Slanted-sup-ly1.tfm \
tex-TeXGyreScholaX-Slanted-sup-ot1.tfm \
tex-TeXGyreScholaX-Slanted-sup-t1--base.tfm \
tex-TeXGyreScholaX-Slanted-sup-t1.tfm \
tex-TeXGyreScholaX-Slanted-sup-t1.vf \
tex-TeXGyreScholaX-Slanted-tlf-ly1.tfm \
tex-TeXGyreScholaX-Slanted-tlf-ot1.tfm \
tex-TeXGyreScholaX-Slanted-tlf-ot1G.tfm \
tex-TeXGyreScholaX-Slanted-tlf-ot1G.vf \
tex-TeXGyreScholaX-Slanted-tlf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Slanted-tlf-sc-ly1.tfm \
tex-TeXGyreScholaX-Slanted-tlf-sc-ly1.vf \
tex-TeXGyreScholaX-Slanted-tlf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Slanted-tlf-sc-ot1.tfm \
tex-TeXGyreScholaX-Slanted-tlf-sc-ot1.vf \
tex-TeXGyreScholaX-Slanted-tlf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Slanted-tlf-sc-t1.tfm \
tex-TeXGyreScholaX-Slanted-tlf-sc-t1.vf \
tex-TeXGyreScholaX-Slanted-tlf-t1--base.tfm \
tex-TeXGyreScholaX-Slanted-tlf-t1.tfm \
tex-TeXGyreScholaX-Slanted-tlf-t1.vf \
tex-TeXGyreScholaX-Slanted-tlf-ts1--base.tfm \
tex-TeXGyreScholaX-Slanted-tlf-ts1.tfm \
tex-TeXGyreScholaX-Slanted-tlf-ts1.vf \
tex-TeXGyreScholaX-Slanted-tosf-ly1.tfm \
tex-TeXGyreScholaX-Slanted-tosf-ot1.tfm \
tex-TeXGyreScholaX-Slanted-tosf-sc-ly1--base.tfm \
tex-TeXGyreScholaX-Slanted-tosf-sc-ly1.tfm \
tex-TeXGyreScholaX-Slanted-tosf-sc-ly1.vf \
tex-TeXGyreScholaX-Slanted-tosf-sc-ot1--base.tfm \
tex-TeXGyreScholaX-Slanted-tosf-sc-ot1.tfm \
tex-TeXGyreScholaX-Slanted-tosf-sc-ot1.vf \
tex-TeXGyreScholaX-Slanted-tosf-sc-t1--base.tfm \
tex-TeXGyreScholaX-Slanted-tosf-sc-t1.tfm \
tex-TeXGyreScholaX-Slanted-tosf-sc-t1.vf \
tex-TeXGyreScholaX-Slanted-tosf-t1--base.tfm \
tex-TeXGyreScholaX-Slanted-tosf-t1.tfm \
tex-TeXGyreScholaX-Slanted-tosf-t1.vf \
tex-TeXGyreScholaX-Slanted-tosf-ts1--base.tfm \
tex-TeXGyreScholaX-Slanted-tosf-ts1.tfm \
tex-TeXGyreScholaX-Slanted-tosf-ts1.vf \
tex-ly1zcsth-lf.fd \
tex-ly1zcsth-osf.fd \
tex-newtx-nc-subs.tex \
tex-newtx-ncf-subs.tex \
tex-omlzncfmi.fd \
tex-omlzncmi.fd \
tex-ot1zcsth-lf.fd \
tex-ot1zcsth-osf.fd \
tex-scholax.sty \
tex-t1zcsth-lf.fd \
tex-t1zcsth-osf.fd \
tex-zcs-2p3dps.enc \
tex-zcs-2ulndi.enc \
tex-zcs-2zpiql.enc \
tex-zcs-3uk2yo.enc \
tex-zcs-72zhkj.enc \
tex-zcs-7xuij4.enc \
tex-zcs-Italic-osf-th-ly1.tfm \
tex-zcs-Italic-osf-th-ot1.tfm \
tex-zcs-Italic-osf-th-t1.tfm \
tex-zcs-Italic-tlf-th-ly1.tfm \
tex-zcs-Italic-tlf-th-ot1.tfm \
tex-zcs-Italic-tlf-th-t1.tfm \
tex-zcs-aisocu.enc \
tex-zcs-c3rnvk.enc \
tex-zcs-c5ugpk.enc \
tex-zcs-czuex4.enc \
tex-zcs-dcwile.enc \
tex-zcs-dodlyj.enc \
tex-zcs-ecth-osf.enc \
tex-zcs-ecth-tlf.enc \
tex-zcs-fn6vum.enc \
tex-zcs-heobe3.enc \
tex-zcs-ioc2dx.enc \
tex-zcs-jkq3qs.enc \
tex-zcs-k56gxg.enc \
tex-zcs-lewktp.enc \
tex-zcs-litts3.enc \
tex-zcs-mett7y.enc \
tex-zcs-mnnbkz.enc \
tex-zcs-ot1-th-osf.enc \
tex-zcs-ot1-th-tlf.enc \
tex-zcs-qfh2v7.enc \
tex-zcs-ra2vxf.enc \
tex-zcs-t6txtr.enc \
tex-zcs-texnansi-th-osf.enc \
tex-zcs-texnansi-th-tlf.enc \
tex-zcs-tpfstq.enc \
tex-zcs-ujimmk.enc \
tex-zcs-wg6py3.enc \
tex-zcs-wlo5nq.enc \
tex-zcs-wylu46.enc \
tex-zcs-x5uxyb.enc \
tex-zcs-xrqdd6.enc \
tex-zcs-xzuu25.enc \
tex-zcs-y6waxr.enc \
tex-zcs-zgzte3.enc \
tex-zncbmi.tfm \
tex-zncbmi.vf \
tex-zncbmia.tfm \
tex-zncbmia.vf \
tex-zncfbmi.tfm \
tex-zncfbmi.vf \
tex-zncfbmia.tfm \
tex-zncfbmia.vf \
tex-zncfmi.tfm \
tex-zncfmi.vf \
tex-zncfmia.tfm \
tex-zncfmia.vf \
tex-zncmi.tfm \
tex-zncmi.vf \
tex-zncmia.tfm \
tex-zncmia.vf \
texlive-scholax"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-NewTXBMI.tfm \
tex-NewTXMI.tfm \
tex-etoolbox.sty \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-mweights.sty \
tex-scalefnt.sty \
tex-stxscr.tfm \
tex-textcomp.sty \
tex-txbmiaSTbb.tfm \
tex-txbmiaX.tfm \
tex-txmiaSTbb.tfm \
tex-txmiaX.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scholax-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
