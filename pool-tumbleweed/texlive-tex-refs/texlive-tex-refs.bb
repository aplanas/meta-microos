SUMMARY = "References for TeX and Friends"
DESCRIPTION = "This is an ongoing project with the aim of providing a help \
file for LaTeX (and its friends like ConTeXt, MetaPost, \
Metafont, etc.) using a state-of-the-art source format, aka \
DocBook/XML."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.8svn57349"

RPM_NAME = "texlive-tex-refs-2023.209.0.0.4.8svn57349-55.1.noarch.rpm"
RPM_HASH = "d75dc578d3e44b4e8210b86cf74d26726322544035309e4a366f044b692a63b121563fde66c718e11516de1fc283a9baf950bc16f62f68115cc090eb942e78f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-refs"

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
