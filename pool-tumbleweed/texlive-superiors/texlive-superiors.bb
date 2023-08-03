SUMMARY = "Attach superior figures to a font family"
DESCRIPTION = "The package allows the attachment of an arbitrary superior \
figures font to a font family that lacks one. (Superior figures \
are commonly used as footnote markers.) Two superior figures \
fonts are provided--one matching Times, the other matching \
Libertine."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn51909"

RPM_NAME = "texlive-superiors-2023.209.1.06svn51909-58.1.noarch.rpm"
RPM_HASH = "4adcb2b3875446ca572c362c7429492611577803a92b4d8c978ba57f44f9aac79079cf33ed2e4ccd974a136f1f0f342c609e84d7dffa6153c0b2b6acf02ab6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-libertinesups.tfm \
tex-superiors.map \
tex-superiors.sty \
tex-sups.enc \
texlive-superiors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-pgffor.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-superiors-fonts"

inherit rpm
