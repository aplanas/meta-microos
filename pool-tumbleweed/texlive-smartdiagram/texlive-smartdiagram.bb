SUMMARY = "Generate diagrams from lists"
DESCRIPTION = "The package will create 'smart' diagrams from lists of items, \
for simple documents and for presentations."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3bsvn42781"

RPM_NAME = "texlive-smartdiagram-2023.201.0.0.3bsvn42781-57.1.noarch.rpm"
RPM_HASH = "ab863b6400f58fa848ac5579c8fe66e69e09adbfcbd257358c1cc29e1490ed6a15499403be8b7c0867ac8e904f25745f23d5ed61fa713dbdd070a9847a781d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(smartdiagram.sty) \
tex(smartdiagramlibraryadditions.code.tex) \
tex(smartdiagramlibrarycore.commands.code.tex) \
tex(smartdiagramlibrarycore.definitions.code.tex) \
tex(smartdiagramlibrarycore.styles.code.tex) \
texlive-smartdiagram"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(tikz.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
