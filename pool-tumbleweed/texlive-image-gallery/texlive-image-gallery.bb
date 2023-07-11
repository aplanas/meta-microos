SUMMARY = "Create an overview of pictures from a digital camera or from other sources"
DESCRIPTION = "The class may be used to create an overview of pictures from a \
digital camera or from other sources. It is possible to adjust \
the size of the pictures and all the margins. The example file \
shows the usage."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0jsvn15878"

RPM_NAME = "texlive-image-gallery-2023.208.1.0jsvn15878-53.1.noarch.rpm"
RPM_HASH = "12c204efa81b72cff3ec214663f7b722846603554161066eb547f72e5fc18e0d73f5a82aa50167caf74f4a8591ae66ad07e681910da36d4e81e9098c9c61f742"
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
