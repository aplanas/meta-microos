SUMMARY = "Document non-LaTeX code"
DESCRIPTION = "Extends the doc package to cater for documenting non-LaTeX \
code, such as Metafont or MetaPost, or other programming \
languages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2dsvn15878"

RPM_NAME = "texlive-docmfp-2023.209.1.2dsvn15878-53.1.noarch.rpm"
RPM_HASH = "08d721ffe780ef3a813ff808a19e5d6cd01661482d5a88aa90a86020803cf56c267ff6cfe221975b0da4056af2576c9a7fb9724163135a9d810f1654f1d4a3a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docmfp.sty \
texlive-docmfp"

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
