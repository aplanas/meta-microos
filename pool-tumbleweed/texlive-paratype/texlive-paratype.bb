SUMMARY = "LaTeX support for free fonts by ParaType"
DESCRIPTION = "The package offers LaTeX support for the fonts PT Sans, PT \
Serif and PT Mono developed by ParaType for the project 'Public \
Types of Russian Federation', and released under an open user \
license. The fonts themselves are provided in both the TrueType \
and Type 1 formats, both created by ParaType). The fonts \
provide encodings OT1, T1, IL2, TS1, T2* and X2. The package \
provides a convenient replacement of the two packages ptsans \
and ptserif."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32859"

RPM_NAME = "texlive-paratype-2023.209.svn32859-52.1.noarch.rpm"
RPM_HASH = "680fd2732e1e335b60bcbfb8fe6c50698d3b066504f7048a6818ac734c26886ac741f4869015bc45f941de0e3844be54d2bfd001c93a14f427c648df709322f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-IL2PTMono-TLF.fd \
tex-IL2PTSans-TLF.fd \
tex-IL2PTSansCaption-TLF.fd \
tex-IL2PTSansNarrow-TLF.fd \
tex-IL2PTSerif-TLF.fd \
tex-IL2PTSerifCaption-TLF.fd \
tex-OT1PTMono-TLF.fd \
tex-OT1PTSans-TLF.fd \
tex-OT1PTSansCaption-TLF.fd \
tex-OT1PTSansNarrow-TLF.fd \
tex-OT1PTSerif-TLF.fd \
tex-OT1PTSerifCaption-TLF.fd \
tex-OT2PTMono-TLF.fd \
tex-OT2PTSans-TLF.fd \
tex-OT2PTSansCaption-TLF.fd \
tex-OT2PTSansNarrow-TLF.fd \
tex-OT2PTSerif-TLF.fd \
tex-OT2PTSerifCaption-TLF.fd \
tex-PTMono-Bold-tlf-il2--base.tfm \
tex-PTMono-Bold-tlf-il2.tfm \
tex-PTMono-Bold-tlf-il2.vf \
tex-PTMono-Bold-tlf-ot1--base.tfm \
tex-PTMono-Bold-tlf-ot1.tfm \
tex-PTMono-Bold-tlf-ot1.vf \
tex-PTMono-Bold-tlf-ot2.tfm \
tex-PTMono-Bold-tlf-t1--base.tfm \
tex-PTMono-Bold-tlf-t1.tfm \
tex-PTMono-Bold-tlf-t1.vf \
tex-PTMono-Bold-tlf-t2a--base.tfm \
tex-PTMono-Bold-tlf-t2a.tfm \
tex-PTMono-Bold-tlf-t2a.vf \
tex-PTMono-Bold-tlf-t2b--base.tfm \
tex-PTMono-Bold-tlf-t2b.tfm \
tex-PTMono-Bold-tlf-t2b.vf \
tex-PTMono-Bold-tlf-t2c--base.tfm \
tex-PTMono-Bold-tlf-t2c.tfm \
tex-PTMono-Bold-tlf-t2c.vf \
tex-PTMono-Bold-tlf-ts1--base.tfm \
tex-PTMono-Bold-tlf-ts1.tfm \
tex-PTMono-Bold-tlf-ts1.vf \
tex-PTMono-Bold-tlf-x2--base.tfm \
tex-PTMono-Bold-tlf-x2.tfm \
tex-PTMono-Bold-tlf-x2.vf \
tex-PTMono-BoldSlanted-tlf-il2.tfm \
tex-PTMono-BoldSlanted-tlf-ot1.tfm \
tex-PTMono-BoldSlanted-tlf-ot2.tfm \
tex-PTMono-BoldSlanted-tlf-t1--base.tfm \
tex-PTMono-BoldSlanted-tlf-t1.tfm \
tex-PTMono-BoldSlanted-tlf-t1.vf \
tex-PTMono-BoldSlanted-tlf-t2a--base.tfm \
tex-PTMono-BoldSlanted-tlf-t2a.tfm \
tex-PTMono-BoldSlanted-tlf-t2a.vf \
tex-PTMono-BoldSlanted-tlf-t2b--base.tfm \
tex-PTMono-BoldSlanted-tlf-t2b.tfm \
tex-PTMono-BoldSlanted-tlf-t2b.vf \
tex-PTMono-BoldSlanted-tlf-t2c--base.tfm \
tex-PTMono-BoldSlanted-tlf-t2c.tfm \
tex-PTMono-BoldSlanted-tlf-t2c.vf \
tex-PTMono-BoldSlanted-tlf-ts1--base.tfm \
tex-PTMono-BoldSlanted-tlf-ts1.tfm \
tex-PTMono-BoldSlanted-tlf-ts1.vf \
tex-PTMono-BoldSlanted-tlf-x2--base.tfm \
tex-PTMono-BoldSlanted-tlf-x2.tfm \
tex-PTMono-BoldSlanted-tlf-x2.vf \
tex-PTMono-Regular-tlf-il2--base.tfm \
tex-PTMono-Regular-tlf-il2.tfm \
tex-PTMono-Regular-tlf-il2.vf \
tex-PTMono-Regular-tlf-ot1--base.tfm \
tex-PTMono-Regular-tlf-ot1.tfm \
tex-PTMono-Regular-tlf-ot1.vf \
tex-PTMono-Regular-tlf-ot2.tfm \
tex-PTMono-Regular-tlf-t1--base.tfm \
tex-PTMono-Regular-tlf-t1.tfm \
tex-PTMono-Regular-tlf-t1.vf \
tex-PTMono-Regular-tlf-t2a--base.tfm \
tex-PTMono-Regular-tlf-t2a.tfm \
tex-PTMono-Regular-tlf-t2a.vf \
tex-PTMono-Regular-tlf-t2b--base.tfm \
tex-PTMono-Regular-tlf-t2b.tfm \
tex-PTMono-Regular-tlf-t2b.vf \
tex-PTMono-Regular-tlf-t2c--base.tfm \
tex-PTMono-Regular-tlf-t2c.tfm \
tex-PTMono-Regular-tlf-t2c.vf \
tex-PTMono-Regular-tlf-ts1--base.tfm \
tex-PTMono-Regular-tlf-ts1.tfm \
tex-PTMono-Regular-tlf-ts1.vf \
tex-PTMono-Regular-tlf-x2--base.tfm \
tex-PTMono-Regular-tlf-x2.tfm \
tex-PTMono-Regular-tlf-x2.vf \
tex-PTMono-Slanted-tlf-il2.tfm \
tex-PTMono-Slanted-tlf-ot1.tfm \
tex-PTMono-Slanted-tlf-ot2.tfm \
tex-PTMono-Slanted-tlf-t1--base.tfm \
tex-PTMono-Slanted-tlf-t1.tfm \
tex-PTMono-Slanted-tlf-t1.vf \
tex-PTMono-Slanted-tlf-t2a--base.tfm \
tex-PTMono-Slanted-tlf-t2a.tfm \
tex-PTMono-Slanted-tlf-t2a.vf \
tex-PTMono-Slanted-tlf-t2b--base.tfm \
tex-PTMono-Slanted-tlf-t2b.tfm \
tex-PTMono-Slanted-tlf-t2b.vf \
tex-PTMono-Slanted-tlf-t2c--base.tfm \
tex-PTMono-Slanted-tlf-t2c.tfm \
tex-PTMono-Slanted-tlf-t2c.vf \
tex-PTMono-Slanted-tlf-ts1--base.tfm \
tex-PTMono-Slanted-tlf-ts1.tfm \
tex-PTMono-Slanted-tlf-ts1.vf \
tex-PTMono-Slanted-tlf-x2--base.tfm \
tex-PTMono-Slanted-tlf-x2.tfm \
tex-PTMono-Slanted-tlf-x2.vf \
tex-PTMono.sty \
tex-PTSans-Bold-tlf-il2.tfm \
tex-PTSans-Bold-tlf-ot1.tfm \
tex-PTSans-Bold-tlf-ot2.tfm \
tex-PTSans-Bold-tlf-t1--base.tfm \
tex-PTSans-Bold-tlf-t1.tfm \
tex-PTSans-Bold-tlf-t1.vf \
tex-PTSans-Bold-tlf-t2a--base.tfm \
tex-PTSans-Bold-tlf-t2a.tfm \
tex-PTSans-Bold-tlf-t2a.vf \
tex-PTSans-Bold-tlf-t2b--base.tfm \
tex-PTSans-Bold-tlf-t2b.tfm \
tex-PTSans-Bold-tlf-t2b.vf \
tex-PTSans-Bold-tlf-t2c--base.tfm \
tex-PTSans-Bold-tlf-t2c.tfm \
tex-PTSans-Bold-tlf-t2c.vf \
tex-PTSans-Bold-tlf-ts1--base.tfm \
tex-PTSans-Bold-tlf-ts1.tfm \
tex-PTSans-Bold-tlf-ts1.vf \
tex-PTSans-Bold-tlf-x2--base.tfm \
tex-PTSans-Bold-tlf-x2.tfm \
tex-PTSans-Bold-tlf-x2.vf \
tex-PTSans-BoldItalic-tlf-il2.tfm \
tex-PTSans-BoldItalic-tlf-ot1.tfm \
tex-PTSans-BoldItalic-tlf-ot2.tfm \
tex-PTSans-BoldItalic-tlf-t1--base.tfm \
tex-PTSans-BoldItalic-tlf-t1.tfm \
tex-PTSans-BoldItalic-tlf-t1.vf \
tex-PTSans-BoldItalic-tlf-t2a--base.tfm \
tex-PTSans-BoldItalic-tlf-t2a.tfm \
tex-PTSans-BoldItalic-tlf-t2a.vf \
tex-PTSans-BoldItalic-tlf-t2b--base.tfm \
tex-PTSans-BoldItalic-tlf-t2b.tfm \
tex-PTSans-BoldItalic-tlf-t2b.vf \
tex-PTSans-BoldItalic-tlf-t2c--base.tfm \
tex-PTSans-BoldItalic-tlf-t2c.tfm \
tex-PTSans-BoldItalic-tlf-t2c.vf \
tex-PTSans-BoldItalic-tlf-ts1--base.tfm \
tex-PTSans-BoldItalic-tlf-ts1.tfm \
tex-PTSans-BoldItalic-tlf-ts1.vf \
tex-PTSans-BoldItalic-tlf-x2--base.tfm \
tex-PTSans-BoldItalic-tlf-x2.tfm \
tex-PTSans-BoldItalic-tlf-x2.vf \
tex-PTSans-Caption-tlf-il2.tfm \
tex-PTSans-Caption-tlf-ot1.tfm \
tex-PTSans-Caption-tlf-ot2.tfm \
tex-PTSans-Caption-tlf-t1--base.tfm \
tex-PTSans-Caption-tlf-t1.tfm \
tex-PTSans-Caption-tlf-t1.vf \
tex-PTSans-Caption-tlf-t2a--base.tfm \
tex-PTSans-Caption-tlf-t2a.tfm \
tex-PTSans-Caption-tlf-t2a.vf \
tex-PTSans-Caption-tlf-t2b--base.tfm \
tex-PTSans-Caption-tlf-t2b.tfm \
tex-PTSans-Caption-tlf-t2b.vf \
tex-PTSans-Caption-tlf-t2c--base.tfm \
tex-PTSans-Caption-tlf-t2c.tfm \
tex-PTSans-Caption-tlf-t2c.vf \
tex-PTSans-Caption-tlf-ts1--base.tfm \
tex-PTSans-Caption-tlf-ts1.tfm \
tex-PTSans-Caption-tlf-ts1.vf \
tex-PTSans-Caption-tlf-x2--base.tfm \
tex-PTSans-Caption-tlf-x2.tfm \
tex-PTSans-Caption-tlf-x2.vf \
tex-PTSans-CaptionBold-tlf-il2.tfm \
tex-PTSans-CaptionBold-tlf-ot1.tfm \
tex-PTSans-CaptionBold-tlf-ot2.tfm \
tex-PTSans-CaptionBold-tlf-t1--base.tfm \
tex-PTSans-CaptionBold-tlf-t1.tfm \
tex-PTSans-CaptionBold-tlf-t1.vf \
tex-PTSans-CaptionBold-tlf-t2a--base.tfm \
tex-PTSans-CaptionBold-tlf-t2a.tfm \
tex-PTSans-CaptionBold-tlf-t2a.vf \
tex-PTSans-CaptionBold-tlf-t2b--base.tfm \
tex-PTSans-CaptionBold-tlf-t2b.tfm \
tex-PTSans-CaptionBold-tlf-t2b.vf \
tex-PTSans-CaptionBold-tlf-t2c--base.tfm \
tex-PTSans-CaptionBold-tlf-t2c.tfm \
tex-PTSans-CaptionBold-tlf-t2c.vf \
tex-PTSans-CaptionBold-tlf-ts1--base.tfm \
tex-PTSans-CaptionBold-tlf-ts1.tfm \
tex-PTSans-CaptionBold-tlf-ts1.vf \
tex-PTSans-CaptionBold-tlf-x2--base.tfm \
tex-PTSans-CaptionBold-tlf-x2.tfm \
tex-PTSans-CaptionBold-tlf-x2.vf \
tex-PTSans-CaptionBoldSlanted-tlf-il2.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-ot1.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-ot2.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-t1--base.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-t1.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-t1.vf \
tex-PTSans-CaptionBoldSlanted-tlf-t2a--base.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-t2a.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-t2a.vf \
tex-PTSans-CaptionBoldSlanted-tlf-t2b--base.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-t2b.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-t2b.vf \
tex-PTSans-CaptionBoldSlanted-tlf-t2c--base.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-t2c.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-t2c.vf \
tex-PTSans-CaptionBoldSlanted-tlf-ts1--base.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-ts1.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-ts1.vf \
tex-PTSans-CaptionBoldSlanted-tlf-x2--base.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-x2.tfm \
tex-PTSans-CaptionBoldSlanted-tlf-x2.vf \
tex-PTSans-CaptionSlanted-tlf-il2.tfm \
tex-PTSans-CaptionSlanted-tlf-ot1.tfm \
tex-PTSans-CaptionSlanted-tlf-ot2.tfm \
tex-PTSans-CaptionSlanted-tlf-t1--base.tfm \
tex-PTSans-CaptionSlanted-tlf-t1.tfm \
tex-PTSans-CaptionSlanted-tlf-t1.vf \
tex-PTSans-CaptionSlanted-tlf-t2a--base.tfm \
tex-PTSans-CaptionSlanted-tlf-t2a.tfm \
tex-PTSans-CaptionSlanted-tlf-t2a.vf \
tex-PTSans-CaptionSlanted-tlf-t2b--base.tfm \
tex-PTSans-CaptionSlanted-tlf-t2b.tfm \
tex-PTSans-CaptionSlanted-tlf-t2b.vf \
tex-PTSans-CaptionSlanted-tlf-t2c--base.tfm \
tex-PTSans-CaptionSlanted-tlf-t2c.tfm \
tex-PTSans-CaptionSlanted-tlf-t2c.vf \
tex-PTSans-CaptionSlanted-tlf-ts1--base.tfm \
tex-PTSans-CaptionSlanted-tlf-ts1.tfm \
tex-PTSans-CaptionSlanted-tlf-ts1.vf \
tex-PTSans-CaptionSlanted-tlf-x2--base.tfm \
tex-PTSans-CaptionSlanted-tlf-x2.tfm \
tex-PTSans-CaptionSlanted-tlf-x2.vf \
tex-PTSans-Italic-tlf-il2.tfm \
tex-PTSans-Italic-tlf-ot1.tfm \
tex-PTSans-Italic-tlf-ot2.tfm \
tex-PTSans-Italic-tlf-t1--base.tfm \
tex-PTSans-Italic-tlf-t1.tfm \
tex-PTSans-Italic-tlf-t1.vf \
tex-PTSans-Italic-tlf-t2a--base.tfm \
tex-PTSans-Italic-tlf-t2a.tfm \
tex-PTSans-Italic-tlf-t2a.vf \
tex-PTSans-Italic-tlf-t2b--base.tfm \
tex-PTSans-Italic-tlf-t2b.tfm \
tex-PTSans-Italic-tlf-t2b.vf \
tex-PTSans-Italic-tlf-t2c--base.tfm \
tex-PTSans-Italic-tlf-t2c.tfm \
tex-PTSans-Italic-tlf-t2c.vf \
tex-PTSans-Italic-tlf-ts1--base.tfm \
tex-PTSans-Italic-tlf-ts1.tfm \
tex-PTSans-Italic-tlf-ts1.vf \
tex-PTSans-Italic-tlf-x2--base.tfm \
tex-PTSans-Italic-tlf-x2.tfm \
tex-PTSans-Italic-tlf-x2.vf \
tex-PTSans-Narrow-tlf-il2.tfm \
tex-PTSans-Narrow-tlf-ot1.tfm \
tex-PTSans-Narrow-tlf-ot2.tfm \
tex-PTSans-Narrow-tlf-t1--base.tfm \
tex-PTSans-Narrow-tlf-t1.tfm \
tex-PTSans-Narrow-tlf-t1.vf \
tex-PTSans-Narrow-tlf-t2a--base.tfm \
tex-PTSans-Narrow-tlf-t2a.tfm \
tex-PTSans-Narrow-tlf-t2a.vf \
tex-PTSans-Narrow-tlf-t2b--base.tfm \
tex-PTSans-Narrow-tlf-t2b.tfm \
tex-PTSans-Narrow-tlf-t2b.vf \
tex-PTSans-Narrow-tlf-t2c--base.tfm \
tex-PTSans-Narrow-tlf-t2c.tfm \
tex-PTSans-Narrow-tlf-t2c.vf \
tex-PTSans-Narrow-tlf-ts1--base.tfm \
tex-PTSans-Narrow-tlf-ts1.tfm \
tex-PTSans-Narrow-tlf-ts1.vf \
tex-PTSans-Narrow-tlf-x2--base.tfm \
tex-PTSans-Narrow-tlf-x2.tfm \
tex-PTSans-Narrow-tlf-x2.vf \
tex-PTSans-NarrowBold-tlf-il2.tfm \
tex-PTSans-NarrowBold-tlf-ot1.tfm \
tex-PTSans-NarrowBold-tlf-ot2.tfm \
tex-PTSans-NarrowBold-tlf-t1--base.tfm \
tex-PTSans-NarrowBold-tlf-t1.tfm \
tex-PTSans-NarrowBold-tlf-t1.vf \
tex-PTSans-NarrowBold-tlf-t2a--base.tfm \
tex-PTSans-NarrowBold-tlf-t2a.tfm \
tex-PTSans-NarrowBold-tlf-t2a.vf \
tex-PTSans-NarrowBold-tlf-t2b--base.tfm \
tex-PTSans-NarrowBold-tlf-t2b.tfm \
tex-PTSans-NarrowBold-tlf-t2b.vf \
tex-PTSans-NarrowBold-tlf-t2c--base.tfm \
tex-PTSans-NarrowBold-tlf-t2c.tfm \
tex-PTSans-NarrowBold-tlf-t2c.vf \
tex-PTSans-NarrowBold-tlf-ts1--base.tfm \
tex-PTSans-NarrowBold-tlf-ts1.tfm \
tex-PTSans-NarrowBold-tlf-ts1.vf \
tex-PTSans-NarrowBold-tlf-x2--base.tfm \
tex-PTSans-NarrowBold-tlf-x2.tfm \
tex-PTSans-NarrowBold-tlf-x2.vf \
tex-PTSans-NarrowBoldSlanted-tlf-il2.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-ot1.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-ot2.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-t1--base.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-t1.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-t1.vf \
tex-PTSans-NarrowBoldSlanted-tlf-t2a--base.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-t2a.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-t2a.vf \
tex-PTSans-NarrowBoldSlanted-tlf-t2b--base.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-t2b.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-t2b.vf \
tex-PTSans-NarrowBoldSlanted-tlf-t2c--base.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-t2c.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-t2c.vf \
tex-PTSans-NarrowBoldSlanted-tlf-ts1--base.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-ts1.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-ts1.vf \
tex-PTSans-NarrowBoldSlanted-tlf-x2--base.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-x2.tfm \
tex-PTSans-NarrowBoldSlanted-tlf-x2.vf \
tex-PTSans-NarrowSlanted-tlf-il2.tfm \
tex-PTSans-NarrowSlanted-tlf-ot1.tfm \
tex-PTSans-NarrowSlanted-tlf-ot2.tfm \
tex-PTSans-NarrowSlanted-tlf-t1--base.tfm \
tex-PTSans-NarrowSlanted-tlf-t1.tfm \
tex-PTSans-NarrowSlanted-tlf-t1.vf \
tex-PTSans-NarrowSlanted-tlf-t2a--base.tfm \
tex-PTSans-NarrowSlanted-tlf-t2a.tfm \
tex-PTSans-NarrowSlanted-tlf-t2a.vf \
tex-PTSans-NarrowSlanted-tlf-t2b--base.tfm \
tex-PTSans-NarrowSlanted-tlf-t2b.tfm \
tex-PTSans-NarrowSlanted-tlf-t2b.vf \
tex-PTSans-NarrowSlanted-tlf-t2c--base.tfm \
tex-PTSans-NarrowSlanted-tlf-t2c.tfm \
tex-PTSans-NarrowSlanted-tlf-t2c.vf \
tex-PTSans-NarrowSlanted-tlf-ts1--base.tfm \
tex-PTSans-NarrowSlanted-tlf-ts1.tfm \
tex-PTSans-NarrowSlanted-tlf-ts1.vf \
tex-PTSans-NarrowSlanted-tlf-x2--base.tfm \
tex-PTSans-NarrowSlanted-tlf-x2.tfm \
tex-PTSans-NarrowSlanted-tlf-x2.vf \
tex-PTSans-Regular-tlf-il2.tfm \
tex-PTSans-Regular-tlf-ot1.tfm \
tex-PTSans-Regular-tlf-ot2.tfm \
tex-PTSans-Regular-tlf-t1--base.tfm \
tex-PTSans-Regular-tlf-t1.tfm \
tex-PTSans-Regular-tlf-t1.vf \
tex-PTSans-Regular-tlf-t2a--base.tfm \
tex-PTSans-Regular-tlf-t2a.tfm \
tex-PTSans-Regular-tlf-t2a.vf \
tex-PTSans-Regular-tlf-t2b--base.tfm \
tex-PTSans-Regular-tlf-t2b.tfm \
tex-PTSans-Regular-tlf-t2b.vf \
tex-PTSans-Regular-tlf-t2c--base.tfm \
tex-PTSans-Regular-tlf-t2c.tfm \
tex-PTSans-Regular-tlf-t2c.vf \
tex-PTSans-Regular-tlf-ts1--base.tfm \
tex-PTSans-Regular-tlf-ts1.tfm \
tex-PTSans-Regular-tlf-ts1.vf \
tex-PTSans-Regular-tlf-x2--base.tfm \
tex-PTSans-Regular-tlf-x2.tfm \
tex-PTSans-Regular-tlf-x2.vf \
tex-PTSans.sty \
tex-PTSansCaption.sty \
tex-PTSansNarrow.sty \
tex-PTSerif-Bold-tlf-il2.tfm \
tex-PTSerif-Bold-tlf-ot1.tfm \
tex-PTSerif-Bold-tlf-ot2.tfm \
tex-PTSerif-Bold-tlf-t1--base.tfm \
tex-PTSerif-Bold-tlf-t1.tfm \
tex-PTSerif-Bold-tlf-t1.vf \
tex-PTSerif-Bold-tlf-t2a--base.tfm \
tex-PTSerif-Bold-tlf-t2a.tfm \
tex-PTSerif-Bold-tlf-t2a.vf \
tex-PTSerif-Bold-tlf-t2b--base.tfm \
tex-PTSerif-Bold-tlf-t2b.tfm \
tex-PTSerif-Bold-tlf-t2b.vf \
tex-PTSerif-Bold-tlf-t2c--base.tfm \
tex-PTSerif-Bold-tlf-t2c.tfm \
tex-PTSerif-Bold-tlf-t2c.vf \
tex-PTSerif-Bold-tlf-ts1--base.tfm \
tex-PTSerif-Bold-tlf-ts1.tfm \
tex-PTSerif-Bold-tlf-ts1.vf \
tex-PTSerif-Bold-tlf-x2--base.tfm \
tex-PTSerif-Bold-tlf-x2.tfm \
tex-PTSerif-Bold-tlf-x2.vf \
tex-PTSerif-BoldItalic-tlf-il2.tfm \
tex-PTSerif-BoldItalic-tlf-ot1.tfm \
tex-PTSerif-BoldItalic-tlf-ot2.tfm \
tex-PTSerif-BoldItalic-tlf-t1--base.tfm \
tex-PTSerif-BoldItalic-tlf-t1.tfm \
tex-PTSerif-BoldItalic-tlf-t1.vf \
tex-PTSerif-BoldItalic-tlf-t2a--base.tfm \
tex-PTSerif-BoldItalic-tlf-t2a.tfm \
tex-PTSerif-BoldItalic-tlf-t2a.vf \
tex-PTSerif-BoldItalic-tlf-t2b--base.tfm \
tex-PTSerif-BoldItalic-tlf-t2b.tfm \
tex-PTSerif-BoldItalic-tlf-t2b.vf \
tex-PTSerif-BoldItalic-tlf-t2c--base.tfm \
tex-PTSerif-BoldItalic-tlf-t2c.tfm \
tex-PTSerif-BoldItalic-tlf-t2c.vf \
tex-PTSerif-BoldItalic-tlf-ts1--base.tfm \
tex-PTSerif-BoldItalic-tlf-ts1.tfm \
tex-PTSerif-BoldItalic-tlf-ts1.vf \
tex-PTSerif-BoldItalic-tlf-x2--base.tfm \
tex-PTSerif-BoldItalic-tlf-x2.tfm \
tex-PTSerif-BoldItalic-tlf-x2.vf \
tex-PTSerif-BoldSlanted-tlf-il2.tfm \
tex-PTSerif-BoldSlanted-tlf-ot1.tfm \
tex-PTSerif-BoldSlanted-tlf-ot2.tfm \
tex-PTSerif-BoldSlanted-tlf-t1--base.tfm \
tex-PTSerif-BoldSlanted-tlf-t1.tfm \
tex-PTSerif-BoldSlanted-tlf-t1.vf \
tex-PTSerif-BoldSlanted-tlf-t2a--base.tfm \
tex-PTSerif-BoldSlanted-tlf-t2a.tfm \
tex-PTSerif-BoldSlanted-tlf-t2a.vf \
tex-PTSerif-BoldSlanted-tlf-t2b--base.tfm \
tex-PTSerif-BoldSlanted-tlf-t2b.tfm \
tex-PTSerif-BoldSlanted-tlf-t2b.vf \
tex-PTSerif-BoldSlanted-tlf-t2c--base.tfm \
tex-PTSerif-BoldSlanted-tlf-t2c.tfm \
tex-PTSerif-BoldSlanted-tlf-t2c.vf \
tex-PTSerif-BoldSlanted-tlf-ts1--base.tfm \
tex-PTSerif-BoldSlanted-tlf-ts1.tfm \
tex-PTSerif-BoldSlanted-tlf-ts1.vf \
tex-PTSerif-BoldSlanted-tlf-x2--base.tfm \
tex-PTSerif-BoldSlanted-tlf-x2.tfm \
tex-PTSerif-BoldSlanted-tlf-x2.vf \
tex-PTSerif-BoldUprightItalic-tlf-il2.tfm \
tex-PTSerif-BoldUprightItalic-tlf-ot1.tfm \
tex-PTSerif-BoldUprightItalic-tlf-t1--base.tfm \
tex-PTSerif-BoldUprightItalic-tlf-t1.tfm \
tex-PTSerif-BoldUprightItalic-tlf-t1.vf \
tex-PTSerif-BoldUprightItalic-tlf-t2a--base.tfm \
tex-PTSerif-BoldUprightItalic-tlf-t2a.tfm \
tex-PTSerif-BoldUprightItalic-tlf-t2a.vf \
tex-PTSerif-BoldUprightItalic-tlf-t2b--base.tfm \
tex-PTSerif-BoldUprightItalic-tlf-t2b.tfm \
tex-PTSerif-BoldUprightItalic-tlf-t2b.vf \
tex-PTSerif-BoldUprightItalic-tlf-t2c--base.tfm \
tex-PTSerif-BoldUprightItalic-tlf-t2c.tfm \
tex-PTSerif-BoldUprightItalic-tlf-t2c.vf \
tex-PTSerif-BoldUprightItalic-tlf-ts1--base.tfm \
tex-PTSerif-BoldUprightItalic-tlf-ts1.tfm \
tex-PTSerif-BoldUprightItalic-tlf-ts1.vf \
tex-PTSerif-BoldUprightItalic-tlf-x2--base.tfm \
tex-PTSerif-BoldUprightItalic-tlf-x2.tfm \
tex-PTSerif-BoldUprightItalic-tlf-x2.vf \
tex-PTSerif-Caption-tlf-il2.tfm \
tex-PTSerif-Caption-tlf-ot1.tfm \
tex-PTSerif-Caption-tlf-ot2.tfm \
tex-PTSerif-Caption-tlf-t1--base.tfm \
tex-PTSerif-Caption-tlf-t1.tfm \
tex-PTSerif-Caption-tlf-t1.vf \
tex-PTSerif-Caption-tlf-t2a--base.tfm \
tex-PTSerif-Caption-tlf-t2a.tfm \
tex-PTSerif-Caption-tlf-t2a.vf \
tex-PTSerif-Caption-tlf-t2b--base.tfm \
tex-PTSerif-Caption-tlf-t2b.tfm \
tex-PTSerif-Caption-tlf-t2b.vf \
tex-PTSerif-Caption-tlf-t2c--base.tfm \
tex-PTSerif-Caption-tlf-t2c.tfm \
tex-PTSerif-Caption-tlf-t2c.vf \
tex-PTSerif-Caption-tlf-ts1--base.tfm \
tex-PTSerif-Caption-tlf-ts1.tfm \
tex-PTSerif-Caption-tlf-ts1.vf \
tex-PTSerif-Caption-tlf-x2--base.tfm \
tex-PTSerif-Caption-tlf-x2.tfm \
tex-PTSerif-Caption-tlf-x2.vf \
tex-PTSerif-CaptionItalic-tlf-il2.tfm \
tex-PTSerif-CaptionItalic-tlf-ot1.tfm \
tex-PTSerif-CaptionItalic-tlf-ot2.tfm \
tex-PTSerif-CaptionItalic-tlf-t1--base.tfm \
tex-PTSerif-CaptionItalic-tlf-t1.tfm \
tex-PTSerif-CaptionItalic-tlf-t1.vf \
tex-PTSerif-CaptionItalic-tlf-t2a--base.tfm \
tex-PTSerif-CaptionItalic-tlf-t2a.tfm \
tex-PTSerif-CaptionItalic-tlf-t2a.vf \
tex-PTSerif-CaptionItalic-tlf-t2b--base.tfm \
tex-PTSerif-CaptionItalic-tlf-t2b.tfm \
tex-PTSerif-CaptionItalic-tlf-t2b.vf \
tex-PTSerif-CaptionItalic-tlf-t2c--base.tfm \
tex-PTSerif-CaptionItalic-tlf-t2c.tfm \
tex-PTSerif-CaptionItalic-tlf-t2c.vf \
tex-PTSerif-CaptionItalic-tlf-ts1--base.tfm \
tex-PTSerif-CaptionItalic-tlf-ts1.tfm \
tex-PTSerif-CaptionItalic-tlf-ts1.vf \
tex-PTSerif-CaptionItalic-tlf-x2--base.tfm \
tex-PTSerif-CaptionItalic-tlf-x2.tfm \
tex-PTSerif-CaptionItalic-tlf-x2.vf \
tex-PTSerif-CaptionSlanted-tlf-il2.tfm \
tex-PTSerif-CaptionSlanted-tlf-ot1.tfm \
tex-PTSerif-CaptionSlanted-tlf-ot2.tfm \
tex-PTSerif-CaptionSlanted-tlf-t1--base.tfm \
tex-PTSerif-CaptionSlanted-tlf-t1.tfm \
tex-PTSerif-CaptionSlanted-tlf-t1.vf \
tex-PTSerif-CaptionSlanted-tlf-t2a--base.tfm \
tex-PTSerif-CaptionSlanted-tlf-t2a.tfm \
tex-PTSerif-CaptionSlanted-tlf-t2a.vf \
tex-PTSerif-CaptionSlanted-tlf-t2b--base.tfm \
tex-PTSerif-CaptionSlanted-tlf-t2b.tfm \
tex-PTSerif-CaptionSlanted-tlf-t2b.vf \
tex-PTSerif-CaptionSlanted-tlf-t2c--base.tfm \
tex-PTSerif-CaptionSlanted-tlf-t2c.tfm \
tex-PTSerif-CaptionSlanted-tlf-t2c.vf \
tex-PTSerif-CaptionSlanted-tlf-ts1--base.tfm \
tex-PTSerif-CaptionSlanted-tlf-ts1.tfm \
tex-PTSerif-CaptionSlanted-tlf-ts1.vf \
tex-PTSerif-CaptionSlanted-tlf-x2--base.tfm \
tex-PTSerif-CaptionSlanted-tlf-x2.tfm \
tex-PTSerif-CaptionSlanted-tlf-x2.vf \
tex-PTSerif-CaptionUprightItalic-tlf-il2.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-ot1.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-t1--base.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-t1.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-t1.vf \
tex-PTSerif-CaptionUprightItalic-tlf-t2a--base.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-t2a.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-t2a.vf \
tex-PTSerif-CaptionUprightItalic-tlf-t2b--base.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-t2b.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-t2b.vf \
tex-PTSerif-CaptionUprightItalic-tlf-t2c--base.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-t2c.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-t2c.vf \
tex-PTSerif-CaptionUprightItalic-tlf-ts1--base.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-ts1.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-ts1.vf \
tex-PTSerif-CaptionUprightItalic-tlf-x2--base.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-x2.tfm \
tex-PTSerif-CaptionUprightItalic-tlf-x2.vf \
tex-PTSerif-Italic-tlf-il2.tfm \
tex-PTSerif-Italic-tlf-ot1.tfm \
tex-PTSerif-Italic-tlf-ot2.tfm \
tex-PTSerif-Italic-tlf-t1--base.tfm \
tex-PTSerif-Italic-tlf-t1.tfm \
tex-PTSerif-Italic-tlf-t1.vf \
tex-PTSerif-Italic-tlf-t2a--base.tfm \
tex-PTSerif-Italic-tlf-t2a.tfm \
tex-PTSerif-Italic-tlf-t2a.vf \
tex-PTSerif-Italic-tlf-t2b--base.tfm \
tex-PTSerif-Italic-tlf-t2b.tfm \
tex-PTSerif-Italic-tlf-t2b.vf \
tex-PTSerif-Italic-tlf-t2c--base.tfm \
tex-PTSerif-Italic-tlf-t2c.tfm \
tex-PTSerif-Italic-tlf-t2c.vf \
tex-PTSerif-Italic-tlf-ts1--base.tfm \
tex-PTSerif-Italic-tlf-ts1.tfm \
tex-PTSerif-Italic-tlf-ts1.vf \
tex-PTSerif-Italic-tlf-x2--base.tfm \
tex-PTSerif-Italic-tlf-x2.tfm \
tex-PTSerif-Italic-tlf-x2.vf \
tex-PTSerif-Regular-tlf-il2.tfm \
tex-PTSerif-Regular-tlf-ot1.tfm \
tex-PTSerif-Regular-tlf-ot2.tfm \
tex-PTSerif-Regular-tlf-t1--base.tfm \
tex-PTSerif-Regular-tlf-t1.tfm \
tex-PTSerif-Regular-tlf-t1.vf \
tex-PTSerif-Regular-tlf-t2a--base.tfm \
tex-PTSerif-Regular-tlf-t2a.tfm \
tex-PTSerif-Regular-tlf-t2a.vf \
tex-PTSerif-Regular-tlf-t2b--base.tfm \
tex-PTSerif-Regular-tlf-t2b.tfm \
tex-PTSerif-Regular-tlf-t2b.vf \
tex-PTSerif-Regular-tlf-t2c--base.tfm \
tex-PTSerif-Regular-tlf-t2c.tfm \
tex-PTSerif-Regular-tlf-t2c.vf \
tex-PTSerif-Regular-tlf-ts1--base.tfm \
tex-PTSerif-Regular-tlf-ts1.tfm \
tex-PTSerif-Regular-tlf-ts1.vf \
tex-PTSerif-Regular-tlf-x2--base.tfm \
tex-PTSerif-Regular-tlf-x2.tfm \
tex-PTSerif-Regular-tlf-x2.vf \
tex-PTSerif-Slanted-tlf-il2.tfm \
tex-PTSerif-Slanted-tlf-ot1.tfm \
tex-PTSerif-Slanted-tlf-ot2.tfm \
tex-PTSerif-Slanted-tlf-t1--base.tfm \
tex-PTSerif-Slanted-tlf-t1.tfm \
tex-PTSerif-Slanted-tlf-t1.vf \
tex-PTSerif-Slanted-tlf-t2a--base.tfm \
tex-PTSerif-Slanted-tlf-t2a.tfm \
tex-PTSerif-Slanted-tlf-t2a.vf \
tex-PTSerif-Slanted-tlf-t2b--base.tfm \
tex-PTSerif-Slanted-tlf-t2b.tfm \
tex-PTSerif-Slanted-tlf-t2b.vf \
tex-PTSerif-Slanted-tlf-t2c--base.tfm \
tex-PTSerif-Slanted-tlf-t2c.tfm \
tex-PTSerif-Slanted-tlf-t2c.vf \
tex-PTSerif-Slanted-tlf-ts1--base.tfm \
tex-PTSerif-Slanted-tlf-ts1.tfm \
tex-PTSerif-Slanted-tlf-ts1.vf \
tex-PTSerif-Slanted-tlf-x2--base.tfm \
tex-PTSerif-Slanted-tlf-x2.tfm \
tex-PTSerif-Slanted-tlf-x2.vf \
tex-PTSerif-UprightItalic-tlf-il2.tfm \
tex-PTSerif-UprightItalic-tlf-ot1.tfm \
tex-PTSerif-UprightItalic-tlf-t1--base.tfm \
tex-PTSerif-UprightItalic-tlf-t1.tfm \
tex-PTSerif-UprightItalic-tlf-t1.vf \
tex-PTSerif-UprightItalic-tlf-t2a--base.tfm \
tex-PTSerif-UprightItalic-tlf-t2a.tfm \
tex-PTSerif-UprightItalic-tlf-t2a.vf \
tex-PTSerif-UprightItalic-tlf-t2b--base.tfm \
tex-PTSerif-UprightItalic-tlf-t2b.tfm \
tex-PTSerif-UprightItalic-tlf-t2b.vf \
tex-PTSerif-UprightItalic-tlf-t2c--base.tfm \
tex-PTSerif-UprightItalic-tlf-t2c.tfm \
tex-PTSerif-UprightItalic-tlf-t2c.vf \
tex-PTSerif-UprightItalic-tlf-ts1--base.tfm \
tex-PTSerif-UprightItalic-tlf-ts1.tfm \
tex-PTSerif-UprightItalic-tlf-ts1.vf \
tex-PTSerif-UprightItalic-tlf-x2--base.tfm \
tex-PTSerif-UprightItalic-tlf-x2.tfm \
tex-PTSerif-UprightItalic-tlf-x2.vf \
tex-PTSerif.sty \
tex-PTSerifCaption.sty \
tex-T1PTMono-TLF.fd \
tex-T1PTSans-TLF.fd \
tex-T1PTSansCaption-TLF.fd \
tex-T1PTSansNarrow-TLF.fd \
tex-T1PTSerif-TLF.fd \
tex-T1PTSerifCaption-TLF.fd \
tex-T2APTMono-TLF.fd \
tex-T2APTSans-TLF.fd \
tex-T2APTSansCaption-TLF.fd \
tex-T2APTSansNarrow-TLF.fd \
tex-T2APTSerif-TLF.fd \
tex-T2APTSerifCaption-TLF.fd \
tex-T2BPTMono-TLF.fd \
tex-T2BPTSans-TLF.fd \
tex-T2BPTSansCaption-TLF.fd \
tex-T2BPTSansNarrow-TLF.fd \
tex-T2BPTSerif-TLF.fd \
tex-T2BPTSerifCaption-TLF.fd \
tex-T2CPTMono-TLF.fd \
tex-T2CPTSans-TLF.fd \
tex-T2CPTSansCaption-TLF.fd \
tex-T2CPTSansNarrow-TLF.fd \
tex-T2CPTSerif-TLF.fd \
tex-T2CPTSerifCaption-TLF.fd \
tex-TS1PTMono-TLF.fd \
tex-TS1PTSans-TLF.fd \
tex-TS1PTSansCaption-TLF.fd \
tex-TS1PTSansNarrow-TLF.fd \
tex-TS1PTSerif-TLF.fd \
tex-TS1PTSerifCaption-TLF.fd \
tex-X2PTMono-TLF.fd \
tex-X2PTSans-TLF.fd \
tex-X2PTSansCaption-TLF.fd \
tex-X2PTSansNarrow-TLF.fd \
tex-X2PTSerif-TLF.fd \
tex-X2PTSerifCaption-TLF.fd \
tex-paratype-truetype.map \
tex-paratype-type1.map \
tex-paratype.sty \
tex-ptmono-il2.enc \
tex-ptmono-ot1.enc \
tex-ptmono-ot2.enc \
tex-ptmono-t1.enc \
tex-ptmono-t2a.enc \
tex-ptmono-t2b.enc \
tex-ptmono-t2c.enc \
tex-ptmono-ts1.enc \
tex-ptmono-x2.enc \
tex-ptsans-il2.enc \
tex-ptsans-ot1.enc \
tex-ptsans-ot2.enc \
tex-ptsans-t1.enc \
tex-ptsans-t2a.enc \
tex-ptsans-t2b.enc \
tex-ptsans-t2c.enc \
tex-ptsans-ts1.enc \
tex-ptsans-x2.enc \
tex-ptserif-il2.enc \
tex-ptserif-ot1.enc \
tex-ptserif-ot2.enc \
tex-ptserif-t1.enc \
tex-ptserif-t2a.enc \
tex-ptserif-t2b.enc \
tex-ptserif-t2c.enc \
tex-ptserif-ts1.enc \
tex-ptserif-x2.enc \
texlive-paratype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-paratype-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
