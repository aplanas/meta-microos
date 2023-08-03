SUMMARY = "Marking things to do in a LaTeX document"
DESCRIPTION = "The package lets the user mark things to do later, in a simple \
and visually appealing way. The package takes several options \
to enable customization/finetuning of the visual appearance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.6svn65699"

RPM_NAME = "texlive-todonotes-2023.209.1.1.6svn65699-53.1.noarch.rpm"
RPM_HASH = "c3f53964ef3dc6995b490941e821e1bda207471c1a34bbede087a8ad7f47d30ea54892cfd3f85b4c8e376fa0a1d7d9ecb5e22efcc088377681a3224dd90b207e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-todonotes.sty \
texlive-todonotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-xcolor \
texlive-xkeyval"

inherit rpm
