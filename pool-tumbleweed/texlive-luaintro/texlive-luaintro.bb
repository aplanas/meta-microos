SUMMARY = "Examples from the book 'Einfuhrung in LuaTeX und LuaLaTeX'"
DESCRIPTION = "The bundle provides source of all the examples published in the \
German book 'Einfuhrung in LuaTeX und LuaLaTeX', published by \
Lehmans Media and DANTE, Berlin."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.03svn35490"

RPM_NAME = "texlive-luaintro-2023.208.0.0.03svn35490-53.1.noarch.rpm"
RPM_HASH = "a6124c699019ecfa5089480f2fadc5f44e6a57ab264e321cf7f03082a07dda5538ff3f7d0a39b1d2e8c07ace57031865d96677f305bd2c3f30aa9e1f9ca21aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaintro"

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
