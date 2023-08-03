SUMMARY = "Generate diagrams from lists"
DESCRIPTION = "The package will create 'smart' diagrams from lists of items, \
for simple documents and for presentations."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3bsvn42781"

RPM_NAME = "texlive-smartdiagram-2023.209.0.0.3bsvn42781-58.1.noarch.rpm"
RPM_HASH = "5eef6d2b39b81b6b5d85412e252e161bd35f5207660051ddf8180416de46dffed3158dc1536266d9d49cf92f7856923508612288c487bed5c49a4d9e41d6e6fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-smartdiagram.sty \
tex-smartdiagramlibraryadditions.code.tex \
tex-smartdiagramlibrarycore.commands.code.tex \
tex-smartdiagramlibrarycore.definitions.code.tex \
tex-smartdiagramlibrarycore.styles.code.tex \
texlive-smartdiagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
