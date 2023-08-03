SUMMARY = "Generate slideshow with MetaPost"
DESCRIPTION = "The package provides a means of creating presentations in \
MetaPost, without intervention from other utilities (except a \
distiller). Such an arrangement has its advantages (though \
there are disadvantages too)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-slideshow-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "dc66de8f7d6711f186d60adec054ad9a0c0809ca85f6dbd4e970d27bb5b157c3946ddecd73abe165559a6c6f52ba155583026c95d8e0dc0b8a902ace274d683f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-slideshow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
