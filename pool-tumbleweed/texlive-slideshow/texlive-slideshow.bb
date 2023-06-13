SUMMARY = "Generate slideshow with MetaPost"
DESCRIPTION = "The package provides a means of creating presentations in \
MetaPost, without intervention from other utilities (except a \
distiller). Such an arrangement has its advantages (though \
there are disadvantages too)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-slideshow-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "5a42b92a069bba9f851f82e7aaf0389c2d2043ba797839b2da0afe67141c6a141e3266055188158138a0f9a35b1863b249e0968434ebd610166b1ad968c119f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-slideshow"

RDEPENDS:${PN} += "/bin/sh \
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
