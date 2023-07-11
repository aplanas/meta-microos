SUMMARY = "Enhanced input encoding handling"
DESCRIPTION = "This package deals with input encodings. It provides a wider \
range of input encodings using standard mappings, than does \
inputenc; it also covers nearly all slots. In this way, it \
serves as more uptodate replacement for package inputenc."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.12svn52986"

RPM_NAME = "texlive-inputenx-2023.208.1.12svn52986-53.1.noarch.rpm"
RPM_HASH = "c802391d8858a45ff689dca080f554523a3385e99eac77b7ad69fef533d279cddd56ecf1acbe4b2962a908346e40ec8eacef115cedcc3ceb0fd16339f7ed3042"
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
