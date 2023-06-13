SUMMARY = "Captions on more than floats"
DESCRIPTION = "Defines a command \\captionof for putting a caption to something \
that's not a float. Note that the caption package includes a \
\\captionof command that is an extension of that provided by \
this package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29803"

RPM_NAME = "texlive-capt-of-2023.201.svn29803-52.1.noarch.rpm"
RPM_HASH = "39c4bbc999c801a34e44aa2f92fff0f39a10ab60f14dffa03e9828c1b7f69de43865d4bc52c9520a22b6af8c43ece2b117ecffdb8ac64ea844f104abe0578b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(capt-of.sty) \
texlive-capt-of"

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
