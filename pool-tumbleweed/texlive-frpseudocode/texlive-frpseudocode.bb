SUMMARY = "French translation for the algorithmicx package"
DESCRIPTION = "This package is intended for use alongside Szasz Janos' \
algorithmicx package. Its aim is to provide a French \
translation of terms and words used in algorithms to make it \
integrate seamlessly in a French written document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn56088"

RPM_NAME = "texlive-frpseudocode-2023.209.0.0.3.0svn56088-53.1.noarch.rpm"
RPM_HASH = "2bc77c72f5fa644b5697601efd74638525efd9b2b86922210ef36df999e5f61561e6f41038c5eea0738616a3fd7799f638db6738f8a5efab4a33af02a42568d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frpseudocode.sty \
texlive-frpseudocode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algpseudocode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
