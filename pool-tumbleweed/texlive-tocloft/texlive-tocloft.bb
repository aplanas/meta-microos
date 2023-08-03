SUMMARY = "Control table of contents, figures, etcetera"
DESCRIPTION = "Provides control over the typography of the Table of Contents, \
List of Figures and List of Tables, and the ability to create \
new 'List of ...'. The ToC \\parskip may be changed."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3jsvn53364"

RPM_NAME = "texlive-tocloft-2023.209.2.3jsvn53364-53.1.noarch.rpm"
RPM_HASH = "29f92a8fea2306a6f238641b17652eb8fdbf9fd86cee801a2e17697ba69dbd1d84e52806f68f3f326b0156bd302382763fc9ef6a8314378e4c22d131695597a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tocloft.sty \
texlive-tocloft"

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
