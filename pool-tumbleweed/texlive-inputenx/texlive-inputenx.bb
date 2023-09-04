SUMMARY = "Enhanced input encoding handling"
DESCRIPTION = "This package deals with input encodings. It provides a wider \
range of input encodings using standard mappings, than does \
inputenc; it also covers nearly all slots. In this way, it \
serves as more uptodate replacement for package inputenc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn52986"

RPM_NAME = "texlive-inputenx-2023.209.1.12svn52986-54.1.noarch.rpm"
RPM_HASH = "6b79a558ad5284c166633084d6e9b7a89eafa6fe1589d28118153d43dab74ae8f029f5ff16c3b374d584e1123fc52671ece797a95806d188fe048b394d46cfcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inputenx.sty \
tex-ix-alias.def \
tex-ix-math.def \
tex-ix-name.def \
tex-ix-slot.def \
tex-ix-uc.def \
tex-x-ascii.def \
tex-x-atarist.def \
tex-x-cp1250.def \
tex-x-cp1251.def \
tex-x-cp1252.def \
tex-x-cp1255.def \
tex-x-cp1257.def \
tex-x-cp437.def \
tex-x-cp850.def \
tex-x-cp852.def \
tex-x-cp855.def \
tex-x-cp858.def \
tex-x-cp865.def \
tex-x-cp866.def \
tex-x-dec-mcs.def \
tex-x-iso-8859-1.def \
tex-x-iso-8859-10.def \
tex-x-iso-8859-13.def \
tex-x-iso-8859-14.def \
tex-x-iso-8859-15.def \
tex-x-iso-8859-16.def \
tex-x-iso-8859-2.def \
tex-x-iso-8859-3.def \
tex-x-iso-8859-4.def \
tex-x-iso-8859-5.def \
tex-x-iso-8859-8.def \
tex-x-iso-8859-9.def \
tex-x-koi8-r.def \
tex-x-mac-centeuro.def \
tex-x-mac-cyrillic.def \
tex-x-mac-roman.def \
tex-x-nextstep.def \
tex-x-verbatim.def \
texlive-inputenx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
