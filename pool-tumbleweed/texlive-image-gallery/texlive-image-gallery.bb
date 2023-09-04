SUMMARY = "Create an overview of pictures from a digital camera or from other sources"
DESCRIPTION = "The class may be used to create an overview of pictures from a \
digital camera or from other sources. It is possible to adjust \
the size of the pictures and all the margins. The example file \
shows the usage."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0jsvn15878"

RPM_NAME = "texlive-image-gallery-2023.209.1.0jsvn15878-54.1.noarch.rpm"
RPM_HASH = "022aa336bee89cbcd2bb50137564225488ac7d943966cb863f37ac3480672c3977a3df50b6595fda40ef80eedd586abbe7c986d95479b815cff6d95f70083c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-image-gallery.cls \
texlive-image-gallery"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-color.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
