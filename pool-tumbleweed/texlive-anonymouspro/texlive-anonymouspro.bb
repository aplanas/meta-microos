SUMMARY = "Use AnonymousPro fonts with LaTeX"
DESCRIPTION = "The fonts are a monowidth set, designed for use by coders. They \
appear as a set of four TrueType, or Adobe Type 1 font files, \
and LaTeX support is also provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn51631"

RPM_NAME = "texlive-anonymouspro-2023.201.2.2svn51631-54.1.noarch.rpm"
RPM_HASH = "308488dbd9d7214b62e3bcd638c712a8d474b2cde3ac7cb0db994875ef144566d8078dcfeb1d92ac593e886837c3805fed94857b9cdfd8c8638afad8fe12ec7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AnonymousPro-01.enc \
tex-AnonymousPro-02.enc \
tex-AnonymousPro-03.enc \
tex-AnonymousPro-Bold-01.tfm \
tex-AnonymousPro-Bold-02.tfm \
tex-AnonymousPro-Bold-03.tfm \
tex-AnonymousPro-Bold-Symbols-base.tfm \
tex-AnonymousPro-Bold-Symbols-u.tfm \
tex-AnonymousPro-Bold-Symbols-u.vf \
tex-AnonymousPro-Bold-t1.tfm \
tex-AnonymousPro-Bold-t1.vf \
tex-AnonymousPro-Bold-ts1.tfm \
tex-AnonymousPro-Bold-ts1.vf \
tex-AnonymousPro-Bold.tfm \
tex-AnonymousPro-BoldItalic-01.tfm \
tex-AnonymousPro-BoldItalic-02.tfm \
tex-AnonymousPro-BoldItalic-03.tfm \
tex-AnonymousPro-BoldItalic-Symbols-base.tfm \
tex-AnonymousPro-BoldItalic-Symbols-u.tfm \
tex-AnonymousPro-BoldItalic-Symbols-u.vf \
tex-AnonymousPro-BoldItalic-t1.tfm \
tex-AnonymousPro-BoldItalic-t1.vf \
tex-AnonymousPro-BoldItalic-ts1.tfm \
tex-AnonymousPro-BoldItalic-ts1.vf \
tex-AnonymousPro-BoldItalic.tfm \
tex-AnonymousPro-BoldSC-t1.tfm \
tex-AnonymousPro-BoldSC-t1.vf \
tex-AnonymousPro-Italic-01.tfm \
tex-AnonymousPro-Italic-02.tfm \
tex-AnonymousPro-Italic-03.tfm \
tex-AnonymousPro-Italic-Symbols-base.tfm \
tex-AnonymousPro-Italic-Symbols-u.tfm \
tex-AnonymousPro-Italic-Symbols-u.vf \
tex-AnonymousPro-Italic-t1.tfm \
tex-AnonymousPro-Italic-t1.vf \
tex-AnonymousPro-Italic-ts1.tfm \
tex-AnonymousPro-Italic-ts1.vf \
tex-AnonymousPro-Italic.tfm \
tex-AnonymousPro-Regular-01.tfm \
tex-AnonymousPro-Regular-02.tfm \
tex-AnonymousPro-Regular-03.tfm \
tex-AnonymousPro-Regular-Symbols-base.tfm \
tex-AnonymousPro-Regular-Symbols-u.tfm \
tex-AnonymousPro-Regular-Symbols-u.vf \
tex-AnonymousPro-Regular-t1.tfm \
tex-AnonymousPro-Regular-t1.vf \
tex-AnonymousPro-Regular-ts1.tfm \
tex-AnonymousPro-Regular-ts1.vf \
tex-AnonymousPro-Regular.tfm \
tex-AnonymousPro-RegularSC-t1.tfm \
tex-AnonymousPro-RegularSC-t1.vf \
tex-AnonymousPro-symbols.enc \
tex-AnonymousPro.map \
tex-AnonymousPro.sty \
tex-t1anonymouspro.fd \
tex-ts1anonymouspro.fd \
tex-uanonymouspro.fd \
texlive-anonymouspro"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-updmap.cfg \
texlive \
texlive-anonymouspro-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
