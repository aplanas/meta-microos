SUMMARY = "Inria fonts with LaTeX support"
DESCRIPTION = "Inria is a free font designed by Black[Foundry] for Inria \
research institute. The font is available for free. It comes as \
Serif and Sans Serif, each with three weights and matching \
italics. Using these fonts with XeLaTeX and LuaLaTeX is easy \
using the fontspec package; we refer to the documentation of \
fontspec for more information. The present package provides a \
way of using them with LaTeX and pdfLaTeX: it provides two \
style files, InriaSerif.sty and InriaSans.sty, together with \
the PostScript version of the fonts and their associated files. \
These were created using autoinst."
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn54512"

RPM_NAME = "texlive-inriafonts-2023.201.1.0svn54512-52.1.noarch.rpm"
RPM_HASH = "e6a250f169cddf15972d04b2fa213272c9e2855cedd061c8e3bf49c9e3d5f8c1e434f5a384a91e0152d847486b3c33ba7463500c8d925f381ecc4cd526668aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(InriaSans-Bold-lf-ly1--base.tfm) \
tex(InriaSans-Bold-lf-ly1.tfm) \
tex(InriaSans-Bold-lf-ly1.vf) \
tex(InriaSans-Bold-lf-ot1.tfm) \
tex(InriaSans-Bold-lf-t1--base.tfm) \
tex(InriaSans-Bold-lf-t1.tfm) \
tex(InriaSans-Bold-lf-t1.vf) \
tex(InriaSans-Bold-lf-titling-ly1--base.tfm) \
tex(InriaSans-Bold-lf-titling-ly1.tfm) \
tex(InriaSans-Bold-lf-titling-ly1.vf) \
tex(InriaSans-Bold-lf-titling-ot1.tfm) \
tex(InriaSans-Bold-lf-titling-t1--base.tfm) \
tex(InriaSans-Bold-lf-titling-t1.tfm) \
tex(InriaSans-Bold-lf-titling-t1.vf) \
tex(InriaSans-Bold-lf-ts1--base.tfm) \
tex(InriaSans-Bold-lf-ts1.tfm) \
tex(InriaSans-Bold-lf-ts1.vf) \
tex(InriaSans-Bold-osf-ly1--base.tfm) \
tex(InriaSans-Bold-osf-ly1.tfm) \
tex(InriaSans-Bold-osf-ly1.vf) \
tex(InriaSans-Bold-osf-ot1.tfm) \
tex(InriaSans-Bold-osf-t1--base.tfm) \
tex(InriaSans-Bold-osf-t1.tfm) \
tex(InriaSans-Bold-osf-t1.vf) \
tex(InriaSans-Bold-osf-ts1--base.tfm) \
tex(InriaSans-Bold-osf-ts1.tfm) \
tex(InriaSans-Bold-osf-ts1.vf) \
tex(InriaSans-Bold-sup-ly1--base.tfm) \
tex(InriaSans-Bold-sup-ly1.tfm) \
tex(InriaSans-Bold-sup-ly1.vf) \
tex(InriaSans-Bold-sup-ot1.tfm) \
tex(InriaSans-Bold-sup-t1--base.tfm) \
tex(InriaSans-Bold-sup-t1.tfm) \
tex(InriaSans-Bold-sup-t1.vf) \
tex(InriaSans-Bold-tlf-ly1--base.tfm) \
tex(InriaSans-Bold-tlf-ly1.tfm) \
tex(InriaSans-Bold-tlf-ly1.vf) \
tex(InriaSans-Bold-tlf-ot1.tfm) \
tex(InriaSans-Bold-tlf-t1--base.tfm) \
tex(InriaSans-Bold-tlf-t1.tfm) \
tex(InriaSans-Bold-tlf-t1.vf) \
tex(InriaSans-Bold-tlf-titling-ly1--base.tfm) \
tex(InriaSans-Bold-tlf-titling-ly1.tfm) \
tex(InriaSans-Bold-tlf-titling-ly1.vf) \
tex(InriaSans-Bold-tlf-titling-ot1.tfm) \
tex(InriaSans-Bold-tlf-titling-t1--base.tfm) \
tex(InriaSans-Bold-tlf-titling-t1.tfm) \
tex(InriaSans-Bold-tlf-titling-t1.vf) \
tex(InriaSans-Bold-tlf-ts1--base.tfm) \
tex(InriaSans-Bold-tlf-ts1.tfm) \
tex(InriaSans-Bold-tlf-ts1.vf) \
tex(InriaSans-Bold-tosf-ly1--base.tfm) \
tex(InriaSans-Bold-tosf-ly1.tfm) \
tex(InriaSans-Bold-tosf-ly1.vf) \
tex(InriaSans-Bold-tosf-ot1.tfm) \
tex(InriaSans-Bold-tosf-t1--base.tfm) \
tex(InriaSans-Bold-tosf-t1.tfm) \
tex(InriaSans-Bold-tosf-t1.vf) \
tex(InriaSans-Bold-tosf-ts1--base.tfm) \
tex(InriaSans-Bold-tosf-ts1.tfm) \
tex(InriaSans-Bold-tosf-ts1.vf) \
tex(InriaSans-BoldItalic-lf-ly1--base.tfm) \
tex(InriaSans-BoldItalic-lf-ly1.tfm) \
tex(InriaSans-BoldItalic-lf-ly1.vf) \
tex(InriaSans-BoldItalic-lf-ot1.tfm) \
tex(InriaSans-BoldItalic-lf-t1--base.tfm) \
tex(InriaSans-BoldItalic-lf-t1.tfm) \
tex(InriaSans-BoldItalic-lf-t1.vf) \
tex(InriaSans-BoldItalic-lf-titling-ly1--base.tfm) \
tex(InriaSans-BoldItalic-lf-titling-ly1.tfm) \
tex(InriaSans-BoldItalic-lf-titling-ly1.vf) \
tex(InriaSans-BoldItalic-lf-titling-ot1.tfm) \
tex(InriaSans-BoldItalic-lf-titling-t1--base.tfm) \
tex(InriaSans-BoldItalic-lf-titling-t1.tfm) \
tex(InriaSans-BoldItalic-lf-titling-t1.vf) \
tex(InriaSans-BoldItalic-lf-ts1--base.tfm) \
tex(InriaSans-BoldItalic-lf-ts1.tfm) \
tex(InriaSans-BoldItalic-lf-ts1.vf) \
tex(InriaSans-BoldItalic-osf-ly1--base.tfm) \
tex(InriaSans-BoldItalic-osf-ly1.tfm) \
tex(InriaSans-BoldItalic-osf-ly1.vf) \
tex(InriaSans-BoldItalic-osf-ot1.tfm) \
tex(InriaSans-BoldItalic-osf-t1--base.tfm) \
tex(InriaSans-BoldItalic-osf-t1.tfm) \
tex(InriaSans-BoldItalic-osf-t1.vf) \
tex(InriaSans-BoldItalic-osf-ts1--base.tfm) \
tex(InriaSans-BoldItalic-osf-ts1.tfm) \
tex(InriaSans-BoldItalic-osf-ts1.vf) \
tex(InriaSans-BoldItalic-sup-ly1--base.tfm) \
tex(InriaSans-BoldItalic-sup-ly1.tfm) \
tex(InriaSans-BoldItalic-sup-ly1.vf) \
tex(InriaSans-BoldItalic-sup-ot1.tfm) \
tex(InriaSans-BoldItalic-sup-t1--base.tfm) \
tex(InriaSans-BoldItalic-sup-t1.tfm) \
tex(InriaSans-BoldItalic-sup-t1.vf) \
tex(InriaSans-BoldItalic-tlf-ly1--base.tfm) \
tex(InriaSans-BoldItalic-tlf-ly1.tfm) \
tex(InriaSans-BoldItalic-tlf-ly1.vf) \
tex(InriaSans-BoldItalic-tlf-ot1.tfm) \
tex(InriaSans-BoldItalic-tlf-t1--base.tfm) \
tex(InriaSans-BoldItalic-tlf-t1.tfm) \
tex(InriaSans-BoldItalic-tlf-t1.vf) \
tex(InriaSans-BoldItalic-tlf-titling-ly1--base.tfm) \
tex(InriaSans-BoldItalic-tlf-titling-ly1.tfm) \
tex(InriaSans-BoldItalic-tlf-titling-ly1.vf) \
tex(InriaSans-BoldItalic-tlf-titling-ot1.tfm) \
tex(InriaSans-BoldItalic-tlf-titling-t1--base.tfm) \
tex(InriaSans-BoldItalic-tlf-titling-t1.tfm) \
tex(InriaSans-BoldItalic-tlf-titling-t1.vf) \
tex(InriaSans-BoldItalic-tlf-ts1--base.tfm) \
tex(InriaSans-BoldItalic-tlf-ts1.tfm) \
tex(InriaSans-BoldItalic-tlf-ts1.vf) \
tex(InriaSans-BoldItalic-tosf-ly1--base.tfm) \
tex(InriaSans-BoldItalic-tosf-ly1.tfm) \
tex(InriaSans-BoldItalic-tosf-ly1.vf) \
tex(InriaSans-BoldItalic-tosf-ot1.tfm) \
tex(InriaSans-BoldItalic-tosf-t1--base.tfm) \
tex(InriaSans-BoldItalic-tosf-t1.tfm) \
tex(InriaSans-BoldItalic-tosf-t1.vf) \
tex(InriaSans-BoldItalic-tosf-ts1--base.tfm) \
tex(InriaSans-BoldItalic-tosf-ts1.tfm) \
tex(InriaSans-BoldItalic-tosf-ts1.vf) \
tex(InriaSans-Italic-lf-ly1--base.tfm) \
tex(InriaSans-Italic-lf-ly1.tfm) \
tex(InriaSans-Italic-lf-ly1.vf) \
tex(InriaSans-Italic-lf-ot1.tfm) \
tex(InriaSans-Italic-lf-t1--base.tfm) \
tex(InriaSans-Italic-lf-t1.tfm) \
tex(InriaSans-Italic-lf-t1.vf) \
tex(InriaSans-Italic-lf-titling-ly1--base.tfm) \
tex(InriaSans-Italic-lf-titling-ly1.tfm) \
tex(InriaSans-Italic-lf-titling-ly1.vf) \
tex(InriaSans-Italic-lf-titling-ot1.tfm) \
tex(InriaSans-Italic-lf-titling-t1--base.tfm) \
tex(InriaSans-Italic-lf-titling-t1.tfm) \
tex(InriaSans-Italic-lf-titling-t1.vf) \
tex(InriaSans-Italic-lf-ts1--base.tfm) \
tex(InriaSans-Italic-lf-ts1.tfm) \
tex(InriaSans-Italic-lf-ts1.vf) \
tex(InriaSans-Italic-osf-ly1--base.tfm) \
tex(InriaSans-Italic-osf-ly1.tfm) \
tex(InriaSans-Italic-osf-ly1.vf) \
tex(InriaSans-Italic-osf-ot1.tfm) \
tex(InriaSans-Italic-osf-t1--base.tfm) \
tex(InriaSans-Italic-osf-t1.tfm) \
tex(InriaSans-Italic-osf-t1.vf) \
tex(InriaSans-Italic-osf-ts1--base.tfm) \
tex(InriaSans-Italic-osf-ts1.tfm) \
tex(InriaSans-Italic-osf-ts1.vf) \
tex(InriaSans-Italic-sup-ly1--base.tfm) \
tex(InriaSans-Italic-sup-ly1.tfm) \
tex(InriaSans-Italic-sup-ly1.vf) \
tex(InriaSans-Italic-sup-ot1.tfm) \
tex(InriaSans-Italic-sup-t1--base.tfm) \
tex(InriaSans-Italic-sup-t1.tfm) \
tex(InriaSans-Italic-sup-t1.vf) \
tex(InriaSans-Italic-tlf-ly1--base.tfm) \
tex(InriaSans-Italic-tlf-ly1.tfm) \
tex(InriaSans-Italic-tlf-ly1.vf) \
tex(InriaSans-Italic-tlf-ot1.tfm) \
tex(InriaSans-Italic-tlf-t1--base.tfm) \
tex(InriaSans-Italic-tlf-t1.tfm) \
tex(InriaSans-Italic-tlf-t1.vf) \
tex(InriaSans-Italic-tlf-titling-ly1--base.tfm) \
tex(InriaSans-Italic-tlf-titling-ly1.tfm) \
tex(InriaSans-Italic-tlf-titling-ly1.vf) \
tex(InriaSans-Italic-tlf-titling-ot1.tfm) \
tex(InriaSans-Italic-tlf-titling-t1--base.tfm) \
tex(InriaSans-Italic-tlf-titling-t1.tfm) \
tex(InriaSans-Italic-tlf-titling-t1.vf) \
tex(InriaSans-Italic-tlf-ts1--base.tfm) \
tex(InriaSans-Italic-tlf-ts1.tfm) \
tex(InriaSans-Italic-tlf-ts1.vf) \
tex(InriaSans-Italic-tosf-ly1--base.tfm) \
tex(InriaSans-Italic-tosf-ly1.tfm) \
tex(InriaSans-Italic-tosf-ly1.vf) \
tex(InriaSans-Italic-tosf-ot1.tfm) \
tex(InriaSans-Italic-tosf-t1--base.tfm) \
tex(InriaSans-Italic-tosf-t1.tfm) \
tex(InriaSans-Italic-tosf-t1.vf) \
tex(InriaSans-Italic-tosf-ts1--base.tfm) \
tex(InriaSans-Italic-tosf-ts1.tfm) \
tex(InriaSans-Italic-tosf-ts1.vf) \
tex(InriaSans-Light-lf-ly1--base.tfm) \
tex(InriaSans-Light-lf-ly1.tfm) \
tex(InriaSans-Light-lf-ly1.vf) \
tex(InriaSans-Light-lf-ot1.tfm) \
tex(InriaSans-Light-lf-t1--base.tfm) \
tex(InriaSans-Light-lf-t1.tfm) \
tex(InriaSans-Light-lf-t1.vf) \
tex(InriaSans-Light-lf-titling-ly1--base.tfm) \
tex(InriaSans-Light-lf-titling-ly1.tfm) \
tex(InriaSans-Light-lf-titling-ly1.vf) \
tex(InriaSans-Light-lf-titling-ot1.tfm) \
tex(InriaSans-Light-lf-titling-t1--base.tfm) \
tex(InriaSans-Light-lf-titling-t1.tfm) \
tex(InriaSans-Light-lf-titling-t1.vf) \
tex(InriaSans-Light-lf-ts1--base.tfm) \
tex(InriaSans-Light-lf-ts1.tfm) \
tex(InriaSans-Light-lf-ts1.vf) \
tex(InriaSans-Light-osf-ly1--base.tfm) \
tex(InriaSans-Light-osf-ly1.tfm) \
tex(InriaSans-Light-osf-ly1.vf) \
tex(InriaSans-Light-osf-ot1.tfm) \
tex(InriaSans-Light-osf-t1--base.tfm) \
tex(InriaSans-Light-osf-t1.tfm) \
tex(InriaSans-Light-osf-t1.vf) \
tex(InriaSans-Light-osf-ts1--base.tfm) \
tex(InriaSans-Light-osf-ts1.tfm) \
tex(InriaSans-Light-osf-ts1.vf) \
tex(InriaSans-Light-sup-ly1--base.tfm) \
tex(InriaSans-Light-sup-ly1.tfm) \
tex(InriaSans-Light-sup-ly1.vf) \
tex(InriaSans-Light-sup-ot1.tfm) \
tex(InriaSans-Light-sup-t1--base.tfm) \
tex(InriaSans-Light-sup-t1.tfm) \
tex(InriaSans-Light-sup-t1.vf) \
tex(InriaSans-Light-tlf-ly1--base.tfm) \
tex(InriaSans-Light-tlf-ly1.tfm) \
tex(InriaSans-Light-tlf-ly1.vf) \
tex(InriaSans-Light-tlf-ot1.tfm) \
tex(InriaSans-Light-tlf-t1--base.tfm) \
tex(InriaSans-Light-tlf-t1.tfm) \
tex(InriaSans-Light-tlf-t1.vf) \
tex(InriaSans-Light-tlf-titling-ly1--base.tfm) \
tex(InriaSans-Light-tlf-titling-ly1.tfm) \
tex(InriaSans-Light-tlf-titling-ly1.vf) \
tex(InriaSans-Light-tlf-titling-ot1.tfm) \
tex(InriaSans-Light-tlf-titling-t1--base.tfm) \
tex(InriaSans-Light-tlf-titling-t1.tfm) \
tex(InriaSans-Light-tlf-titling-t1.vf) \
tex(InriaSans-Light-tlf-ts1--base.tfm) \
tex(InriaSans-Light-tlf-ts1.tfm) \
tex(InriaSans-Light-tlf-ts1.vf) \
tex(InriaSans-Light-tosf-ly1--base.tfm) \
tex(InriaSans-Light-tosf-ly1.tfm) \
tex(InriaSans-Light-tosf-ly1.vf) \
tex(InriaSans-Light-tosf-ot1.tfm) \
tex(InriaSans-Light-tosf-t1--base.tfm) \
tex(InriaSans-Light-tosf-t1.tfm) \
tex(InriaSans-Light-tosf-t1.vf) \
tex(InriaSans-Light-tosf-ts1--base.tfm) \
tex(InriaSans-Light-tosf-ts1.tfm) \
tex(InriaSans-Light-tosf-ts1.vf) \
tex(InriaSans-LightItalic-lf-ly1--base.tfm) \
tex(InriaSans-LightItalic-lf-ly1.tfm) \
tex(InriaSans-LightItalic-lf-ly1.vf) \
tex(InriaSans-LightItalic-lf-ot1.tfm) \
tex(InriaSans-LightItalic-lf-t1--base.tfm) \
tex(InriaSans-LightItalic-lf-t1.tfm) \
tex(InriaSans-LightItalic-lf-t1.vf) \
tex(InriaSans-LightItalic-lf-titling-ly1--base.tfm) \
tex(InriaSans-LightItalic-lf-titling-ly1.tfm) \
tex(InriaSans-LightItalic-lf-titling-ly1.vf) \
tex(InriaSans-LightItalic-lf-titling-ot1.tfm) \
tex(InriaSans-LightItalic-lf-titling-t1--base.tfm) \
tex(InriaSans-LightItalic-lf-titling-t1.tfm) \
tex(InriaSans-LightItalic-lf-titling-t1.vf) \
tex(InriaSans-LightItalic-lf-ts1--base.tfm) \
tex(InriaSans-LightItalic-lf-ts1.tfm) \
tex(InriaSans-LightItalic-lf-ts1.vf) \
tex(InriaSans-LightItalic-osf-ly1--base.tfm) \
tex(InriaSans-LightItalic-osf-ly1.tfm) \
tex(InriaSans-LightItalic-osf-ly1.vf) \
tex(InriaSans-LightItalic-osf-ot1.tfm) \
tex(InriaSans-LightItalic-osf-t1--base.tfm) \
tex(InriaSans-LightItalic-osf-t1.tfm) \
tex(InriaSans-LightItalic-osf-t1.vf) \
tex(InriaSans-LightItalic-osf-ts1--base.tfm) \
tex(InriaSans-LightItalic-osf-ts1.tfm) \
tex(InriaSans-LightItalic-osf-ts1.vf) \
tex(InriaSans-LightItalic-sup-ly1--base.tfm) \
tex(InriaSans-LightItalic-sup-ly1.tfm) \
tex(InriaSans-LightItalic-sup-ly1.vf) \
tex(InriaSans-LightItalic-sup-ot1.tfm) \
tex(InriaSans-LightItalic-sup-t1--base.tfm) \
tex(InriaSans-LightItalic-sup-t1.tfm) \
tex(InriaSans-LightItalic-sup-t1.vf) \
tex(InriaSans-LightItalic-tlf-ly1--base.tfm) \
tex(InriaSans-LightItalic-tlf-ly1.tfm) \
tex(InriaSans-LightItalic-tlf-ly1.vf) \
tex(InriaSans-LightItalic-tlf-ot1.tfm) \
tex(InriaSans-LightItalic-tlf-t1--base.tfm) \
tex(InriaSans-LightItalic-tlf-t1.tfm) \
tex(InriaSans-LightItalic-tlf-t1.vf) \
tex(InriaSans-LightItalic-tlf-titling-ly1--base.tfm) \
tex(InriaSans-LightItalic-tlf-titling-ly1.tfm) \
tex(InriaSans-LightItalic-tlf-titling-ly1.vf) \
tex(InriaSans-LightItalic-tlf-titling-ot1.tfm) \
tex(InriaSans-LightItalic-tlf-titling-t1--base.tfm) \
tex(InriaSans-LightItalic-tlf-titling-t1.tfm) \
tex(InriaSans-LightItalic-tlf-titling-t1.vf) \
tex(InriaSans-LightItalic-tlf-ts1--base.tfm) \
tex(InriaSans-LightItalic-tlf-ts1.tfm) \
tex(InriaSans-LightItalic-tlf-ts1.vf) \
tex(InriaSans-LightItalic-tosf-ly1--base.tfm) \
tex(InriaSans-LightItalic-tosf-ly1.tfm) \
tex(InriaSans-LightItalic-tosf-ly1.vf) \
tex(InriaSans-LightItalic-tosf-ot1.tfm) \
tex(InriaSans-LightItalic-tosf-t1--base.tfm) \
tex(InriaSans-LightItalic-tosf-t1.tfm) \
tex(InriaSans-LightItalic-tosf-t1.vf) \
tex(InriaSans-LightItalic-tosf-ts1--base.tfm) \
tex(InriaSans-LightItalic-tosf-ts1.tfm) \
tex(InriaSans-LightItalic-tosf-ts1.vf) \
tex(InriaSans-Regular-lf-ly1--base.tfm) \
tex(InriaSans-Regular-lf-ly1.tfm) \
tex(InriaSans-Regular-lf-ly1.vf) \
tex(InriaSans-Regular-lf-ot1.tfm) \
tex(InriaSans-Regular-lf-t1--base.tfm) \
tex(InriaSans-Regular-lf-t1.tfm) \
tex(InriaSans-Regular-lf-t1.vf) \
tex(InriaSans-Regular-lf-titling-ly1--base.tfm) \
tex(InriaSans-Regular-lf-titling-ly1.tfm) \
tex(InriaSans-Regular-lf-titling-ly1.vf) \
tex(InriaSans-Regular-lf-titling-ot1.tfm) \
tex(InriaSans-Regular-lf-titling-t1--base.tfm) \
tex(InriaSans-Regular-lf-titling-t1.tfm) \
tex(InriaSans-Regular-lf-titling-t1.vf) \
tex(InriaSans-Regular-lf-ts1--base.tfm) \
tex(InriaSans-Regular-lf-ts1.tfm) \
tex(InriaSans-Regular-lf-ts1.vf) \
tex(InriaSans-Regular-osf-ly1--base.tfm) \
tex(InriaSans-Regular-osf-ly1.tfm) \
tex(InriaSans-Regular-osf-ly1.vf) \
tex(InriaSans-Regular-osf-ot1.tfm) \
tex(InriaSans-Regular-osf-t1--base.tfm) \
tex(InriaSans-Regular-osf-t1.tfm) \
tex(InriaSans-Regular-osf-t1.vf) \
tex(InriaSans-Regular-osf-ts1--base.tfm) \
tex(InriaSans-Regular-osf-ts1.tfm) \
tex(InriaSans-Regular-osf-ts1.vf) \
tex(InriaSans-Regular-sup-ly1--base.tfm) \
tex(InriaSans-Regular-sup-ly1.tfm) \
tex(InriaSans-Regular-sup-ly1.vf) \
tex(InriaSans-Regular-sup-ot1.tfm) \
tex(InriaSans-Regular-sup-t1--base.tfm) \
tex(InriaSans-Regular-sup-t1.tfm) \
tex(InriaSans-Regular-sup-t1.vf) \
tex(InriaSans-Regular-tlf-ly1--base.tfm) \
tex(InriaSans-Regular-tlf-ly1.tfm) \
tex(InriaSans-Regular-tlf-ly1.vf) \
tex(InriaSans-Regular-tlf-ot1.tfm) \
tex(InriaSans-Regular-tlf-t1--base.tfm) \
tex(InriaSans-Regular-tlf-t1.tfm) \
tex(InriaSans-Regular-tlf-t1.vf) \
tex(InriaSans-Regular-tlf-titling-ly1--base.tfm) \
tex(InriaSans-Regular-tlf-titling-ly1.tfm) \
tex(InriaSans-Regular-tlf-titling-ly1.vf) \
tex(InriaSans-Regular-tlf-titling-ot1.tfm) \
tex(InriaSans-Regular-tlf-titling-t1--base.tfm) \
tex(InriaSans-Regular-tlf-titling-t1.tfm) \
tex(InriaSans-Regular-tlf-titling-t1.vf) \
tex(InriaSans-Regular-tlf-ts1--base.tfm) \
tex(InriaSans-Regular-tlf-ts1.tfm) \
tex(InriaSans-Regular-tlf-ts1.vf) \
tex(InriaSans-Regular-tosf-ly1--base.tfm) \
tex(InriaSans-Regular-tosf-ly1.tfm) \
tex(InriaSans-Regular-tosf-ly1.vf) \
tex(InriaSans-Regular-tosf-ot1.tfm) \
tex(InriaSans-Regular-tosf-t1--base.tfm) \
tex(InriaSans-Regular-tosf-t1.tfm) \
tex(InriaSans-Regular-tosf-t1.vf) \
tex(InriaSans-Regular-tosf-ts1--base.tfm) \
tex(InriaSans-Regular-tosf-ts1.tfm) \
tex(InriaSans-Regular-tosf-ts1.vf) \
tex(InriaSans.map) \
tex(InriaSans.sty) \
tex(InriaSerif-Bold-lf-ly1--base.tfm) \
tex(InriaSerif-Bold-lf-ly1.tfm) \
tex(InriaSerif-Bold-lf-ly1.vf) \
tex(InriaSerif-Bold-lf-ot1.tfm) \
tex(InriaSerif-Bold-lf-t1--base.tfm) \
tex(InriaSerif-Bold-lf-t1.tfm) \
tex(InriaSerif-Bold-lf-t1.vf) \
tex(InriaSerif-Bold-lf-titling-ly1--base.tfm) \
tex(InriaSerif-Bold-lf-titling-ly1.tfm) \
tex(InriaSerif-Bold-lf-titling-ly1.vf) \
tex(InriaSerif-Bold-lf-titling-ot1.tfm) \
tex(InriaSerif-Bold-lf-titling-t1--base.tfm) \
tex(InriaSerif-Bold-lf-titling-t1.tfm) \
tex(InriaSerif-Bold-lf-titling-t1.vf) \
tex(InriaSerif-Bold-lf-ts1--base.tfm) \
tex(InriaSerif-Bold-lf-ts1.tfm) \
tex(InriaSerif-Bold-lf-ts1.vf) \
tex(InriaSerif-Bold-osf-ly1--base.tfm) \
tex(InriaSerif-Bold-osf-ly1.tfm) \
tex(InriaSerif-Bold-osf-ly1.vf) \
tex(InriaSerif-Bold-osf-ot1.tfm) \
tex(InriaSerif-Bold-osf-t1--base.tfm) \
tex(InriaSerif-Bold-osf-t1.tfm) \
tex(InriaSerif-Bold-osf-t1.vf) \
tex(InriaSerif-Bold-osf-ts1--base.tfm) \
tex(InriaSerif-Bold-osf-ts1.tfm) \
tex(InriaSerif-Bold-osf-ts1.vf) \
tex(InriaSerif-Bold-sup-ly1--base.tfm) \
tex(InriaSerif-Bold-sup-ly1.tfm) \
tex(InriaSerif-Bold-sup-ly1.vf) \
tex(InriaSerif-Bold-sup-ot1.tfm) \
tex(InriaSerif-Bold-sup-t1--base.tfm) \
tex(InriaSerif-Bold-sup-t1.tfm) \
tex(InriaSerif-Bold-sup-t1.vf) \
tex(InriaSerif-Bold-tlf-ly1--base.tfm) \
tex(InriaSerif-Bold-tlf-ly1.tfm) \
tex(InriaSerif-Bold-tlf-ly1.vf) \
tex(InriaSerif-Bold-tlf-ot1.tfm) \
tex(InriaSerif-Bold-tlf-t1--base.tfm) \
tex(InriaSerif-Bold-tlf-t1.tfm) \
tex(InriaSerif-Bold-tlf-t1.vf) \
tex(InriaSerif-Bold-tlf-titling-ly1--base.tfm) \
tex(InriaSerif-Bold-tlf-titling-ly1.tfm) \
tex(InriaSerif-Bold-tlf-titling-ly1.vf) \
tex(InriaSerif-Bold-tlf-titling-ot1.tfm) \
tex(InriaSerif-Bold-tlf-titling-t1--base.tfm) \
tex(InriaSerif-Bold-tlf-titling-t1.tfm) \
tex(InriaSerif-Bold-tlf-titling-t1.vf) \
tex(InriaSerif-Bold-tlf-ts1--base.tfm) \
tex(InriaSerif-Bold-tlf-ts1.tfm) \
tex(InriaSerif-Bold-tlf-ts1.vf) \
tex(InriaSerif-Bold-tosf-ly1--base.tfm) \
tex(InriaSerif-Bold-tosf-ly1.tfm) \
tex(InriaSerif-Bold-tosf-ly1.vf) \
tex(InriaSerif-Bold-tosf-ot1.tfm) \
tex(InriaSerif-Bold-tosf-t1--base.tfm) \
tex(InriaSerif-Bold-tosf-t1.tfm) \
tex(InriaSerif-Bold-tosf-t1.vf) \
tex(InriaSerif-Bold-tosf-ts1--base.tfm) \
tex(InriaSerif-Bold-tosf-ts1.tfm) \
tex(InriaSerif-Bold-tosf-ts1.vf) \
tex(InriaSerif-BoldItalic-lf-ly1--base.tfm) \
tex(InriaSerif-BoldItalic-lf-ly1.tfm) \
tex(InriaSerif-BoldItalic-lf-ly1.vf) \
tex(InriaSerif-BoldItalic-lf-ot1.tfm) \
tex(InriaSerif-BoldItalic-lf-t1--base.tfm) \
tex(InriaSerif-BoldItalic-lf-t1.tfm) \
tex(InriaSerif-BoldItalic-lf-t1.vf) \
tex(InriaSerif-BoldItalic-lf-titling-ly1--base.tfm) \
tex(InriaSerif-BoldItalic-lf-titling-ly1.tfm) \
tex(InriaSerif-BoldItalic-lf-titling-ly1.vf) \
tex(InriaSerif-BoldItalic-lf-titling-ot1.tfm) \
tex(InriaSerif-BoldItalic-lf-titling-t1--base.tfm) \
tex(InriaSerif-BoldItalic-lf-titling-t1.tfm) \
tex(InriaSerif-BoldItalic-lf-titling-t1.vf) \
tex(InriaSerif-BoldItalic-lf-ts1--base.tfm) \
tex(InriaSerif-BoldItalic-lf-ts1.tfm) \
tex(InriaSerif-BoldItalic-lf-ts1.vf) \
tex(InriaSerif-BoldItalic-osf-ly1--base.tfm) \
tex(InriaSerif-BoldItalic-osf-ly1.tfm) \
tex(InriaSerif-BoldItalic-osf-ly1.vf) \
tex(InriaSerif-BoldItalic-osf-ot1.tfm) \
tex(InriaSerif-BoldItalic-osf-t1--base.tfm) \
tex(InriaSerif-BoldItalic-osf-t1.tfm) \
tex(InriaSerif-BoldItalic-osf-t1.vf) \
tex(InriaSerif-BoldItalic-osf-ts1--base.tfm) \
tex(InriaSerif-BoldItalic-osf-ts1.tfm) \
tex(InriaSerif-BoldItalic-osf-ts1.vf) \
tex(InriaSerif-BoldItalic-sup-ly1--base.tfm) \
tex(InriaSerif-BoldItalic-sup-ly1.tfm) \
tex(InriaSerif-BoldItalic-sup-ly1.vf) \
tex(InriaSerif-BoldItalic-sup-ot1.tfm) \
tex(InriaSerif-BoldItalic-sup-t1--base.tfm) \
tex(InriaSerif-BoldItalic-sup-t1.tfm) \
tex(InriaSerif-BoldItalic-sup-t1.vf) \
tex(InriaSerif-BoldItalic-tlf-ly1--base.tfm) \
tex(InriaSerif-BoldItalic-tlf-ly1.tfm) \
tex(InriaSerif-BoldItalic-tlf-ly1.vf) \
tex(InriaSerif-BoldItalic-tlf-ot1.tfm) \
tex(InriaSerif-BoldItalic-tlf-t1--base.tfm) \
tex(InriaSerif-BoldItalic-tlf-t1.tfm) \
tex(InriaSerif-BoldItalic-tlf-t1.vf) \
tex(InriaSerif-BoldItalic-tlf-titling-ly1--base.tfm) \
tex(InriaSerif-BoldItalic-tlf-titling-ly1.tfm) \
tex(InriaSerif-BoldItalic-tlf-titling-ly1.vf) \
tex(InriaSerif-BoldItalic-tlf-titling-ot1.tfm) \
tex(InriaSerif-BoldItalic-tlf-titling-t1--base.tfm) \
tex(InriaSerif-BoldItalic-tlf-titling-t1.tfm) \
tex(InriaSerif-BoldItalic-tlf-titling-t1.vf) \
tex(InriaSerif-BoldItalic-tlf-ts1--base.tfm) \
tex(InriaSerif-BoldItalic-tlf-ts1.tfm) \
tex(InriaSerif-BoldItalic-tlf-ts1.vf) \
tex(InriaSerif-BoldItalic-tosf-ly1--base.tfm) \
tex(InriaSerif-BoldItalic-tosf-ly1.tfm) \
tex(InriaSerif-BoldItalic-tosf-ly1.vf) \
tex(InriaSerif-BoldItalic-tosf-ot1.tfm) \
tex(InriaSerif-BoldItalic-tosf-t1--base.tfm) \
tex(InriaSerif-BoldItalic-tosf-t1.tfm) \
tex(InriaSerif-BoldItalic-tosf-t1.vf) \
tex(InriaSerif-BoldItalic-tosf-ts1--base.tfm) \
tex(InriaSerif-BoldItalic-tosf-ts1.tfm) \
tex(InriaSerif-BoldItalic-tosf-ts1.vf) \
tex(InriaSerif-Italic-lf-ly1--base.tfm) \
tex(InriaSerif-Italic-lf-ly1.tfm) \
tex(InriaSerif-Italic-lf-ly1.vf) \
tex(InriaSerif-Italic-lf-ot1.tfm) \
tex(InriaSerif-Italic-lf-t1--base.tfm) \
tex(InriaSerif-Italic-lf-t1.tfm) \
tex(InriaSerif-Italic-lf-t1.vf) \
tex(InriaSerif-Italic-lf-titling-ly1--base.tfm) \
tex(InriaSerif-Italic-lf-titling-ly1.tfm) \
tex(InriaSerif-Italic-lf-titling-ly1.vf) \
tex(InriaSerif-Italic-lf-titling-ot1.tfm) \
tex(InriaSerif-Italic-lf-titling-t1--base.tfm) \
tex(InriaSerif-Italic-lf-titling-t1.tfm) \
tex(InriaSerif-Italic-lf-titling-t1.vf) \
tex(InriaSerif-Italic-lf-ts1--base.tfm) \
tex(InriaSerif-Italic-lf-ts1.tfm) \
tex(InriaSerif-Italic-lf-ts1.vf) \
tex(InriaSerif-Italic-osf-ly1--base.tfm) \
tex(InriaSerif-Italic-osf-ly1.tfm) \
tex(InriaSerif-Italic-osf-ly1.vf) \
tex(InriaSerif-Italic-osf-ot1.tfm) \
tex(InriaSerif-Italic-osf-t1--base.tfm) \
tex(InriaSerif-Italic-osf-t1.tfm) \
tex(InriaSerif-Italic-osf-t1.vf) \
tex(InriaSerif-Italic-osf-ts1--base.tfm) \
tex(InriaSerif-Italic-osf-ts1.tfm) \
tex(InriaSerif-Italic-osf-ts1.vf) \
tex(InriaSerif-Italic-sup-ly1--base.tfm) \
tex(InriaSerif-Italic-sup-ly1.tfm) \
tex(InriaSerif-Italic-sup-ly1.vf) \
tex(InriaSerif-Italic-sup-ot1.tfm) \
tex(InriaSerif-Italic-sup-t1--base.tfm) \
tex(InriaSerif-Italic-sup-t1.tfm) \
tex(InriaSerif-Italic-sup-t1.vf) \
tex(InriaSerif-Italic-tlf-ly1--base.tfm) \
tex(InriaSerif-Italic-tlf-ly1.tfm) \
tex(InriaSerif-Italic-tlf-ly1.vf) \
tex(InriaSerif-Italic-tlf-ot1.tfm) \
tex(InriaSerif-Italic-tlf-t1--base.tfm) \
tex(InriaSerif-Italic-tlf-t1.tfm) \
tex(InriaSerif-Italic-tlf-t1.vf) \
tex(InriaSerif-Italic-tlf-titling-ly1--base.tfm) \
tex(InriaSerif-Italic-tlf-titling-ly1.tfm) \
tex(InriaSerif-Italic-tlf-titling-ly1.vf) \
tex(InriaSerif-Italic-tlf-titling-ot1.tfm) \
tex(InriaSerif-Italic-tlf-titling-t1--base.tfm) \
tex(InriaSerif-Italic-tlf-titling-t1.tfm) \
tex(InriaSerif-Italic-tlf-titling-t1.vf) \
tex(InriaSerif-Italic-tlf-ts1--base.tfm) \
tex(InriaSerif-Italic-tlf-ts1.tfm) \
tex(InriaSerif-Italic-tlf-ts1.vf) \
tex(InriaSerif-Italic-tosf-ly1--base.tfm) \
tex(InriaSerif-Italic-tosf-ly1.tfm) \
tex(InriaSerif-Italic-tosf-ly1.vf) \
tex(InriaSerif-Italic-tosf-ot1.tfm) \
tex(InriaSerif-Italic-tosf-t1--base.tfm) \
tex(InriaSerif-Italic-tosf-t1.tfm) \
tex(InriaSerif-Italic-tosf-t1.vf) \
tex(InriaSerif-Italic-tosf-ts1--base.tfm) \
tex(InriaSerif-Italic-tosf-ts1.tfm) \
tex(InriaSerif-Italic-tosf-ts1.vf) \
tex(InriaSerif-Light-lf-ly1--base.tfm) \
tex(InriaSerif-Light-lf-ly1.tfm) \
tex(InriaSerif-Light-lf-ly1.vf) \
tex(InriaSerif-Light-lf-ot1.tfm) \
tex(InriaSerif-Light-lf-t1--base.tfm) \
tex(InriaSerif-Light-lf-t1.tfm) \
tex(InriaSerif-Light-lf-t1.vf) \
tex(InriaSerif-Light-lf-titling-ly1--base.tfm) \
tex(InriaSerif-Light-lf-titling-ly1.tfm) \
tex(InriaSerif-Light-lf-titling-ly1.vf) \
tex(InriaSerif-Light-lf-titling-ot1.tfm) \
tex(InriaSerif-Light-lf-titling-t1--base.tfm) \
tex(InriaSerif-Light-lf-titling-t1.tfm) \
tex(InriaSerif-Light-lf-titling-t1.vf) \
tex(InriaSerif-Light-lf-ts1--base.tfm) \
tex(InriaSerif-Light-lf-ts1.tfm) \
tex(InriaSerif-Light-lf-ts1.vf) \
tex(InriaSerif-Light-osf-ly1--base.tfm) \
tex(InriaSerif-Light-osf-ly1.tfm) \
tex(InriaSerif-Light-osf-ly1.vf) \
tex(InriaSerif-Light-osf-ot1.tfm) \
tex(InriaSerif-Light-osf-t1--base.tfm) \
tex(InriaSerif-Light-osf-t1.tfm) \
tex(InriaSerif-Light-osf-t1.vf) \
tex(InriaSerif-Light-osf-ts1--base.tfm) \
tex(InriaSerif-Light-osf-ts1.tfm) \
tex(InriaSerif-Light-osf-ts1.vf) \
tex(InriaSerif-Light-sup-ly1--base.tfm) \
tex(InriaSerif-Light-sup-ly1.tfm) \
tex(InriaSerif-Light-sup-ly1.vf) \
tex(InriaSerif-Light-sup-ot1.tfm) \
tex(InriaSerif-Light-sup-t1--base.tfm) \
tex(InriaSerif-Light-sup-t1.tfm) \
tex(InriaSerif-Light-sup-t1.vf) \
tex(InriaSerif-Light-tlf-ly1--base.tfm) \
tex(InriaSerif-Light-tlf-ly1.tfm) \
tex(InriaSerif-Light-tlf-ly1.vf) \
tex(InriaSerif-Light-tlf-ot1.tfm) \
tex(InriaSerif-Light-tlf-t1--base.tfm) \
tex(InriaSerif-Light-tlf-t1.tfm) \
tex(InriaSerif-Light-tlf-t1.vf) \
tex(InriaSerif-Light-tlf-titling-ly1--base.tfm) \
tex(InriaSerif-Light-tlf-titling-ly1.tfm) \
tex(InriaSerif-Light-tlf-titling-ly1.vf) \
tex(InriaSerif-Light-tlf-titling-ot1.tfm) \
tex(InriaSerif-Light-tlf-titling-t1--base.tfm) \
tex(InriaSerif-Light-tlf-titling-t1.tfm) \
tex(InriaSerif-Light-tlf-titling-t1.vf) \
tex(InriaSerif-Light-tlf-ts1--base.tfm) \
tex(InriaSerif-Light-tlf-ts1.tfm) \
tex(InriaSerif-Light-tlf-ts1.vf) \
tex(InriaSerif-Light-tosf-ly1--base.tfm) \
tex(InriaSerif-Light-tosf-ly1.tfm) \
tex(InriaSerif-Light-tosf-ly1.vf) \
tex(InriaSerif-Light-tosf-ot1.tfm) \
tex(InriaSerif-Light-tosf-t1--base.tfm) \
tex(InriaSerif-Light-tosf-t1.tfm) \
tex(InriaSerif-Light-tosf-t1.vf) \
tex(InriaSerif-Light-tosf-ts1--base.tfm) \
tex(InriaSerif-Light-tosf-ts1.tfm) \
tex(InriaSerif-Light-tosf-ts1.vf) \
tex(InriaSerif-LightItalic-lf-ly1--base.tfm) \
tex(InriaSerif-LightItalic-lf-ly1.tfm) \
tex(InriaSerif-LightItalic-lf-ly1.vf) \
tex(InriaSerif-LightItalic-lf-ot1.tfm) \
tex(InriaSerif-LightItalic-lf-t1--base.tfm) \
tex(InriaSerif-LightItalic-lf-t1.tfm) \
tex(InriaSerif-LightItalic-lf-t1.vf) \
tex(InriaSerif-LightItalic-lf-titling-ly1--base.tfm) \
tex(InriaSerif-LightItalic-lf-titling-ly1.tfm) \
tex(InriaSerif-LightItalic-lf-titling-ly1.vf) \
tex(InriaSerif-LightItalic-lf-titling-ot1.tfm) \
tex(InriaSerif-LightItalic-lf-titling-t1--base.tfm) \
tex(InriaSerif-LightItalic-lf-titling-t1.tfm) \
tex(InriaSerif-LightItalic-lf-titling-t1.vf) \
tex(InriaSerif-LightItalic-lf-ts1--base.tfm) \
tex(InriaSerif-LightItalic-lf-ts1.tfm) \
tex(InriaSerif-LightItalic-lf-ts1.vf) \
tex(InriaSerif-LightItalic-osf-ly1--base.tfm) \
tex(InriaSerif-LightItalic-osf-ly1.tfm) \
tex(InriaSerif-LightItalic-osf-ly1.vf) \
tex(InriaSerif-LightItalic-osf-ot1.tfm) \
tex(InriaSerif-LightItalic-osf-t1--base.tfm) \
tex(InriaSerif-LightItalic-osf-t1.tfm) \
tex(InriaSerif-LightItalic-osf-t1.vf) \
tex(InriaSerif-LightItalic-osf-ts1--base.tfm) \
tex(InriaSerif-LightItalic-osf-ts1.tfm) \
tex(InriaSerif-LightItalic-osf-ts1.vf) \
tex(InriaSerif-LightItalic-sup-ly1--base.tfm) \
tex(InriaSerif-LightItalic-sup-ly1.tfm) \
tex(InriaSerif-LightItalic-sup-ly1.vf) \
tex(InriaSerif-LightItalic-sup-ot1.tfm) \
tex(InriaSerif-LightItalic-sup-t1--base.tfm) \
tex(InriaSerif-LightItalic-sup-t1.tfm) \
tex(InriaSerif-LightItalic-sup-t1.vf) \
tex(InriaSerif-LightItalic-tlf-ly1--base.tfm) \
tex(InriaSerif-LightItalic-tlf-ly1.tfm) \
tex(InriaSerif-LightItalic-tlf-ly1.vf) \
tex(InriaSerif-LightItalic-tlf-ot1.tfm) \
tex(InriaSerif-LightItalic-tlf-t1--base.tfm) \
tex(InriaSerif-LightItalic-tlf-t1.tfm) \
tex(InriaSerif-LightItalic-tlf-t1.vf) \
tex(InriaSerif-LightItalic-tlf-titling-ly1--base.tfm) \
tex(InriaSerif-LightItalic-tlf-titling-ly1.tfm) \
tex(InriaSerif-LightItalic-tlf-titling-ly1.vf) \
tex(InriaSerif-LightItalic-tlf-titling-ot1.tfm) \
tex(InriaSerif-LightItalic-tlf-titling-t1--base.tfm) \
tex(InriaSerif-LightItalic-tlf-titling-t1.tfm) \
tex(InriaSerif-LightItalic-tlf-titling-t1.vf) \
tex(InriaSerif-LightItalic-tlf-ts1--base.tfm) \
tex(InriaSerif-LightItalic-tlf-ts1.tfm) \
tex(InriaSerif-LightItalic-tlf-ts1.vf) \
tex(InriaSerif-LightItalic-tosf-ly1--base.tfm) \
tex(InriaSerif-LightItalic-tosf-ly1.tfm) \
tex(InriaSerif-LightItalic-tosf-ly1.vf) \
tex(InriaSerif-LightItalic-tosf-ot1.tfm) \
tex(InriaSerif-LightItalic-tosf-t1--base.tfm) \
tex(InriaSerif-LightItalic-tosf-t1.tfm) \
tex(InriaSerif-LightItalic-tosf-t1.vf) \
tex(InriaSerif-LightItalic-tosf-ts1--base.tfm) \
tex(InriaSerif-LightItalic-tosf-ts1.tfm) \
tex(InriaSerif-LightItalic-tosf-ts1.vf) \
tex(InriaSerif-Regular-lf-ly1--base.tfm) \
tex(InriaSerif-Regular-lf-ly1.tfm) \
tex(InriaSerif-Regular-lf-ly1.vf) \
tex(InriaSerif-Regular-lf-ot1.tfm) \
tex(InriaSerif-Regular-lf-t1--base.tfm) \
tex(InriaSerif-Regular-lf-t1.tfm) \
tex(InriaSerif-Regular-lf-t1.vf) \
tex(InriaSerif-Regular-lf-titling-ly1--base.tfm) \
tex(InriaSerif-Regular-lf-titling-ly1.tfm) \
tex(InriaSerif-Regular-lf-titling-ly1.vf) \
tex(InriaSerif-Regular-lf-titling-ot1.tfm) \
tex(InriaSerif-Regular-lf-titling-t1--base.tfm) \
tex(InriaSerif-Regular-lf-titling-t1.tfm) \
tex(InriaSerif-Regular-lf-titling-t1.vf) \
tex(InriaSerif-Regular-lf-ts1--base.tfm) \
tex(InriaSerif-Regular-lf-ts1.tfm) \
tex(InriaSerif-Regular-lf-ts1.vf) \
tex(InriaSerif-Regular-osf-ly1--base.tfm) \
tex(InriaSerif-Regular-osf-ly1.tfm) \
tex(InriaSerif-Regular-osf-ly1.vf) \
tex(InriaSerif-Regular-osf-ot1.tfm) \
tex(InriaSerif-Regular-osf-t1--base.tfm) \
tex(InriaSerif-Regular-osf-t1.tfm) \
tex(InriaSerif-Regular-osf-t1.vf) \
tex(InriaSerif-Regular-osf-ts1--base.tfm) \
tex(InriaSerif-Regular-osf-ts1.tfm) \
tex(InriaSerif-Regular-osf-ts1.vf) \
tex(InriaSerif-Regular-sup-ly1--base.tfm) \
tex(InriaSerif-Regular-sup-ly1.tfm) \
tex(InriaSerif-Regular-sup-ly1.vf) \
tex(InriaSerif-Regular-sup-ot1.tfm) \
tex(InriaSerif-Regular-sup-t1--base.tfm) \
tex(InriaSerif-Regular-sup-t1.tfm) \
tex(InriaSerif-Regular-sup-t1.vf) \
tex(InriaSerif-Regular-tlf-ly1--base.tfm) \
tex(InriaSerif-Regular-tlf-ly1.tfm) \
tex(InriaSerif-Regular-tlf-ly1.vf) \
tex(InriaSerif-Regular-tlf-ot1.tfm) \
tex(InriaSerif-Regular-tlf-t1--base.tfm) \
tex(InriaSerif-Regular-tlf-t1.tfm) \
tex(InriaSerif-Regular-tlf-t1.vf) \
tex(InriaSerif-Regular-tlf-titling-ly1--base.tfm) \
tex(InriaSerif-Regular-tlf-titling-ly1.tfm) \
tex(InriaSerif-Regular-tlf-titling-ly1.vf) \
tex(InriaSerif-Regular-tlf-titling-ot1.tfm) \
tex(InriaSerif-Regular-tlf-titling-t1--base.tfm) \
tex(InriaSerif-Regular-tlf-titling-t1.tfm) \
tex(InriaSerif-Regular-tlf-titling-t1.vf) \
tex(InriaSerif-Regular-tlf-ts1--base.tfm) \
tex(InriaSerif-Regular-tlf-ts1.tfm) \
tex(InriaSerif-Regular-tlf-ts1.vf) \
tex(InriaSerif-Regular-tosf-ly1--base.tfm) \
tex(InriaSerif-Regular-tosf-ly1.tfm) \
tex(InriaSerif-Regular-tosf-ly1.vf) \
tex(InriaSerif-Regular-tosf-ot1.tfm) \
tex(InriaSerif-Regular-tosf-t1--base.tfm) \
tex(InriaSerif-Regular-tosf-t1.tfm) \
tex(InriaSerif-Regular-tosf-t1.vf) \
tex(InriaSerif-Regular-tosf-ts1--base.tfm) \
tex(InriaSerif-Regular-tosf-ts1.tfm) \
tex(InriaSerif-Regular-tosf-ts1.vf) \
tex(InriaSerif.map) \
tex(InriaSerif.sty) \
tex(LY1InriaSans-LF.fd) \
tex(LY1InriaSans-OsF.fd) \
tex(LY1InriaSans-Sup.fd) \
tex(LY1InriaSans-TLF.fd) \
tex(LY1InriaSans-TOsF.fd) \
tex(LY1InriaSerif-LF.fd) \
tex(LY1InriaSerif-OsF.fd) \
tex(LY1InriaSerif-Sup.fd) \
tex(LY1InriaSerif-TLF.fd) \
tex(LY1InriaSerif-TOsF.fd) \
tex(OT1InriaSans-LF.fd) \
tex(OT1InriaSans-OsF.fd) \
tex(OT1InriaSans-Sup.fd) \
tex(OT1InriaSans-TLF.fd) \
tex(OT1InriaSans-TOsF.fd) \
tex(OT1InriaSerif-LF.fd) \
tex(OT1InriaSerif-OsF.fd) \
tex(OT1InriaSerif-Sup.fd) \
tex(OT1InriaSerif-TLF.fd) \
tex(OT1InriaSerif-TOsF.fd) \
tex(T1InriaSans-LF.fd) \
tex(T1InriaSans-OsF.fd) \
tex(T1InriaSans-Sup.fd) \
tex(T1InriaSans-TLF.fd) \
tex(T1InriaSans-TOsF.fd) \
tex(T1InriaSerif-LF.fd) \
tex(T1InriaSerif-OsF.fd) \
tex(T1InriaSerif-Sup.fd) \
tex(T1InriaSerif-TLF.fd) \
tex(T1InriaSerif-TOsF.fd) \
tex(TS1InriaSans-LF.fd) \
tex(TS1InriaSans-OsF.fd) \
tex(TS1InriaSans-TLF.fd) \
tex(TS1InriaSans-TOsF.fd) \
tex(TS1InriaSerif-LF.fd) \
tex(TS1InriaSerif-OsF.fd) \
tex(TS1InriaSerif-TLF.fd) \
tex(TS1InriaSerif-TOsF.fd) \
tex(inriasans_2ikqt3.enc) \
tex(inriasans_aeswfl.enc) \
tex(inriasans_azhk4k.enc) \
tex(inriasans_clzm26.enc) \
tex(inriasans_dl3y4j.enc) \
tex(inriasans_efwr3l.enc) \
tex(inriasans_fhoe3z.enc) \
tex(inriasans_g56wvz.enc) \
tex(inriasans_gn4bcn.enc) \
tex(inriasans_kgbpoz.enc) \
tex(inriasans_necsus.enc) \
tex(inriasans_psyc4t.enc) \
tex(inriasans_pv4xsz.enc) \
tex(inriasans_rhfpoz.enc) \
tex(inriasans_rriqaz.enc) \
tex(inriasans_svhg3d.enc) \
tex(inriasans_x5ybkq.enc) \
tex(inriasans_yeotsr.enc) \
tex(inriasans_yl5fy2.enc) \
tex(inriaserif_2ikqt3.enc) \
tex(inriaserif_aeswfl.enc) \
tex(inriaserif_azhk4k.enc) \
tex(inriaserif_clzm26.enc) \
tex(inriaserif_dl3y4j.enc) \
tex(inriaserif_efwr3l.enc) \
tex(inriaserif_fhoe3z.enc) \
tex(inriaserif_g56wvz.enc) \
tex(inriaserif_gn4bcn.enc) \
tex(inriaserif_kgbpoz.enc) \
tex(inriaserif_necsus.enc) \
tex(inriaserif_psyc4t.enc) \
tex(inriaserif_pv4xsz.enc) \
tex(inriaserif_rhfpoz.enc) \
tex(inriaserif_rriqaz.enc) \
tex(inriaserif_svhg3d.enc) \
tex(inriaserif_x5ybkq.enc) \
tex(inriaserif_yeotsr.enc) \
tex(inriaserif_yl5fy2.enc) \
texlive-inriafonts"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontaxes.sty) \
tex(fontenc.sty) \
tex(mweights.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-inriafonts-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
