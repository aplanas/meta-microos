SUMMARY = "Document configuration with tags"
DESCRIPTION = "The package allows the user to generate multiple documents from \
a single source, by marking pieces of the document with tags \
and specifying which marked pieces to include or exclude."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0.1svn52064"

RPM_NAME = "texlive-tagging-2023.209.1.1.0.1svn52064-55.1.noarch.rpm"
RPM_HASH = "7ba7952a56962ef9c07fef54e2712dd8a3454e72f384bbdb3c640e66c3d883a0f2d660249d7daf00aaaf9875f14e06dad887a6400e460b498ec175fefa2da806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tagging.sty \
texlive-tagging"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
