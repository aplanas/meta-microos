SUMMARY = "All examples from 'The LaTeX Companion', third edition"
DESCRIPTION = "The PDFs (as used with spotcolor and trimming) and sources for \
all examples from the third edition (Parts I+II), together with \
necessary supporting files. The edition is published by \
Addison-Wesley, 2023, ISBN-13: 978-0-13-816648-9, ISBN-10: \
0-13-816648-X (bundle of Part I & II)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65496"

RPM_NAME = "texlive-tlc3-examples-2023.201.svn65496-52.1.noarch.rpm"
RPM_HASH = "0324df2f6509cfae2b4b058ff9a4140de11bdd6513b3d35e0a03c02d544ea38d76a65731d38f290122b691db271b7dc8081f842171cc8f02afbdab1add9f56da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlc3-examples"

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
