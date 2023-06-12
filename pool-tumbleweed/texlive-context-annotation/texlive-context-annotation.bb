SUMMARY = "Annotate text blocks"
DESCRIPTION = "The annotation module lets you create your own commands and \
environments to mark text blocks."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-annotation-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "1bb6a4d63b3656668183be569670a241c0f80c6f599a0fdead5d3a3324b9b67b154db068562963e5994f526f8702e4c0e0bcf710ac62255dedde576a684f4e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-annotation"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
