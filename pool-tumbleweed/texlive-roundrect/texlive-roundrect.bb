SUMMARY = "MetaPost macros for highly configurable rounded rectangles (optionally with text)"
DESCRIPTION = "The roundrect macros for MetaPost provide ways to produce \
rounded rectangles, which may or may not contain a title bar or \
text (the title bar may itself contain text). They are \
extremely configurable."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn39796"

RPM_NAME = "texlive-roundrect-2023.201.2.2svn39796-53.1.noarch.rpm"
RPM_HASH = "c95835c1b1c4dbbe2b30a1e0d679952735c4cb3c1427b3b891dac278fde9a99528a4decef2723c6e539fa6a0d8d0b27bd870544e4a9ef6af24adf4b499a7e394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roundrect"

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
