SUMMARY = "Create an overview of pictures from a digital camera or from other sources"
DESCRIPTION = "The class may be used to create an overview of pictures from a \
digital camera or from other sources. It is possible to adjust \
the size of the pictures and all the margins. The example file \
shows the usage."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0jsvn15878"

RPM_NAME = "texlive-image-gallery-2023.201.1.0jsvn15878-52.1.noarch.rpm"
RPM_HASH = "769b60023dc2e1ecac70b2b42c993436289601c67eb226b8227ed5797ee977a6ac196ea63862f3318b88b40e1dfb1e18a9b05e185fdd8db9f2a3dab16f0fbe5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(image-gallery.cls) \
texlive-image-gallery"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(color.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(keyval.sty) \
tex(url.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
