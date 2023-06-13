SUMMARY = "French translation for the algorithmicx package"
DESCRIPTION = "This package is intended for use alongside Szasz Janos' \
algorithmicx package. Its aim is to provide a French \
translation of terms and words used in algorithms to make it \
integrate seamlessly in a French written document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn56088"

RPM_NAME = "texlive-frpseudocode-2023.201.0.0.3.0svn56088-52.1.noarch.rpm"
RPM_HASH = "3f70ecf70453f09c10bb37e3778c41a5a2d570c82ee20ef60ea2782a1c278617cab88c9d7b9e8b2bd1690b14341bc2dc64e8cc91d7686bccd37a7fde5b0875d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(frpseudocode.sty) \
texlive-frpseudocode"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(algpseudocode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
