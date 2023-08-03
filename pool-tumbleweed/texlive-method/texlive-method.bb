SUMMARY = "Typeset method and variable declarations"
DESCRIPTION = "The package supports typesetting of programming language method \
and variable declarations. It supports declarations in German, \
French and English."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn17485"

RPM_NAME = "texlive-method-2023.209.2.0bsvn17485-55.1.noarch.rpm"
RPM_HASH = "e39df9d9c2fd7760fe66c3003a90c5549c2f0453a79b046944a3a8659387af9bb0004248ddc1dc97f5ce38069aefb227f236692b39156b020e9137bb018bdfeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-method.sty \
texlive-method"

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
