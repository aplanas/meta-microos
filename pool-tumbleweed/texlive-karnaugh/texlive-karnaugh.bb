SUMMARY = "Typeset Karnaugh-Veitch-maps"
DESCRIPTION = "The package provides macros for typesetting Karnaugh-Maps and \
Veitch-Charts in a simple and user-friendly way. Karnaugh-Maps \
and Veitch-Charts are used to display and simplify logic \
functions 'manually'. These macros can typeset Karnaugh-Maps \
and Veitch-Charts with up to ten variables (=1024 entries)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21338"

RPM_NAME = "texlive-karnaugh-2023.201.svn21338-55.1.noarch.rpm"
RPM_HASH = "19758d59224b357024066d6bbddec2dc052fa279ea7b4f5bc79464338dee242c61e7b9a69e029e8a7119ea16c9f61bb83ce6ead72e09a431c61a7937146b9507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kvmacros.tex) \
texlive-karnaugh"

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
