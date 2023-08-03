SUMMARY = "Typeset tensors"
DESCRIPTION = "A package which allows the user to set tensor-style super- and \
subscripts with offsets between successive indices. It supports \
the typesetting of tensors with mixed upper and lower indices \
with spacing, also typset preposed indices. This is a complete \
revision and extension of the original 'tensor' package by Mike \
Piff."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-tensor-2023.209.2.1svn15878-55.1.noarch.rpm"
RPM_HASH = "b5e08ea5b9621e460c4efb1b076532285c9f15c0ae3578b836627f432b55cc221a53d7a9daa4255ef8a826c1bafda638b77ec5e4fefd760044b78c446b2bd2f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tensor.sty \
texlive-tensor"

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
