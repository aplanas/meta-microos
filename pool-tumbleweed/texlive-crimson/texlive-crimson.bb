SUMMARY = "Crimson fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX, and LuaLaTeX \
support for the Crimson family of fonts, designed by Sebastian \
Kosch. The Crimson family is for book production in the \
tradition of beautiful oldstyle typefaces, inspired \
particularly by the work of people like Jan Tschichold (Sabon), \
Robert Slimbach (Arno, Minion), and Jonathan Hoefler (Hoefler \
Text). Support for small caps and old-style numerals is still \
'under construction'; these features are not supported by this \
version of the package."
LICENSE = "OFL-1.1"

PV = "2023.204.svn64559"

RPM_NAME = "texlive-crimson-2023.204.svn64559-54.1.noarch.rpm"
RPM_HASH = "d1bb2e8b2ccb789daca7d84aef3f41c8366c0f031af2c73200b0c0729bd130f03552068d91162187647201f3f2d7f157718478ae3ffdcc5d6f16defdc282c113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Crimson-Bold-tlf-ly1--base.tfm \
tex-Crimson-Bold-tlf-ly1.tfm \
tex-Crimson-Bold-tlf-ly1.vf \
tex-Crimson-Bold-tlf-ot1.tfm \
tex-Crimson-Bold-tlf-t1--base.tfm \
tex-Crimson-Bold-tlf-t1.tfm \
tex-Crimson-Bold-tlf-t1.vf \
tex-Crimson-Bold-tlf-ts1--base.tfm \
tex-Crimson-Bold-tlf-ts1.tfm \
tex-Crimson-Bold-tlf-ts1.vf \
tex-Crimson-BoldItalic-tlf-ly1--base.tfm \
tex-Crimson-BoldItalic-tlf-ly1.tfm \
tex-Crimson-BoldItalic-tlf-ly1.vf \
tex-Crimson-BoldItalic-tlf-ot1.tfm \
tex-Crimson-BoldItalic-tlf-t1--base.tfm \
tex-Crimson-BoldItalic-tlf-t1.tfm \
tex-Crimson-BoldItalic-tlf-t1.vf \
tex-Crimson-BoldItalic-tlf-ts1--base.tfm \
tex-Crimson-BoldItalic-tlf-ts1.tfm \
tex-Crimson-BoldItalic-tlf-ts1.vf \
tex-Crimson-Italic-tlf-ly1--base.tfm \
tex-Crimson-Italic-tlf-ly1.tfm \
tex-Crimson-Italic-tlf-ly1.vf \
tex-Crimson-Italic-tlf-ot1.tfm \
tex-Crimson-Italic-tlf-t1--base.tfm \
tex-Crimson-Italic-tlf-t1.tfm \
tex-Crimson-Italic-tlf-t1.vf \
tex-Crimson-Italic-tlf-ts1--base.tfm \
tex-Crimson-Italic-tlf-ts1.tfm \
tex-Crimson-Italic-tlf-ts1.vf \
tex-Crimson-Roman-tlf-ly1.tfm \
tex-Crimson-Roman-tlf-ot1.tfm \
tex-Crimson-Roman-tlf-t1--base.tfm \
tex-Crimson-Roman-tlf-t1.tfm \
tex-Crimson-Roman-tlf-t1.vf \
tex-Crimson-Roman-tlf-ts1--base.tfm \
tex-Crimson-Roman-tlf-ts1.tfm \
tex-Crimson-Roman-tlf-ts1.vf \
tex-Crimson-Semibold-tlf-ly1--base.tfm \
tex-Crimson-Semibold-tlf-ly1.tfm \
tex-Crimson-Semibold-tlf-ly1.vf \
tex-Crimson-Semibold-tlf-ot1.tfm \
tex-Crimson-Semibold-tlf-t1--base.tfm \
tex-Crimson-Semibold-tlf-t1.tfm \
tex-Crimson-Semibold-tlf-t1.vf \
tex-Crimson-Semibold-tlf-ts1--base.tfm \
tex-Crimson-Semibold-tlf-ts1.tfm \
tex-Crimson-Semibold-tlf-ts1.vf \
tex-Crimson-SemiboldItalic-tlf-ly1--base.tfm \
tex-Crimson-SemiboldItalic-tlf-ly1.tfm \
tex-Crimson-SemiboldItalic-tlf-ly1.vf \
tex-Crimson-SemiboldItalic-tlf-ot1.tfm \
tex-Crimson-SemiboldItalic-tlf-t1--base.tfm \
tex-Crimson-SemiboldItalic-tlf-t1.tfm \
tex-Crimson-SemiboldItalic-tlf-t1.vf \
tex-Crimson-SemiboldItalic-tlf-ts1--base.tfm \
tex-Crimson-SemiboldItalic-tlf-ts1.tfm \
tex-Crimson-SemiboldItalic-tlf-ts1.vf \
tex-LY1Crimson-TLF.fd \
tex-OT1Crimson-TLF.fd \
tex-T1Crimson-TLF.fd \
tex-TS1Crimson-TLF.fd \
tex-crimson.map \
tex-crimson.sty \
tex-crm-3bejww.enc \
tex-crm-axwm4k.enc \
tex-crm-ayvnmf.enc \
tex-crm-bchha2.enc \
tex-crm-fllea6.enc \
tex-crm-g4bzis.enc \
tex-crm-izufyi.enc \
tex-crm-jdlmpi.enc \
tex-crm-kwsa5r.enc \
tex-crm-myjoho.enc \
tex-crm-n3gbj7.enc \
tex-crm-odbuza.enc \
tex-crm-ory2k7.enc \
tex-crm-qrsm2e.enc \
tex-crm-qst7o4.enc \
tex-crm-tyw3ea.enc \
tex-crm-uafi7a.enc \
tex-crm-ue2axx.enc \
tex-crm-vcz7kx.enc \
tex-crm-wef5am.enc \
tex-crm-wsbs26.enc \
tex-crm-wttfgh.enc \
texlive-crimson"

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
tex-mweights.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-crimson-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
