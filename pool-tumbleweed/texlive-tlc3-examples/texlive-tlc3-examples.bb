SUMMARY = "All examples from 'The LaTeX Companion', third edition"
DESCRIPTION = "The PDFs (as used with spotcolor and trimming) and sources for \
all examples from the third edition (Parts I+II), together with \
necessary supporting files. The edition is published by \
Addison-Wesley, 2023, ISBN-13: 978-0-13-816648-9, ISBN-10: \
0-13-816648-X (bundle of Part I & II)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65496"

RPM_NAME = "texlive-tlc3-examples-2023.209.svn65496-53.1.noarch.rpm"
RPM_HASH = "b4a0399edc285d377466fc1b62a9184831a57993979a9ee1e7f997c0ee6624874ab1df7f3e1d9947a99606c04a8b99bf6401a1274345baea77e8f6933ee63fff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlc3-examples"

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
