SUMMARY = "Editor plugin for LaTeX, ConTeXt etcetera"
DESCRIPTION = "Digestif is a code analyzer, and a language server, for LaTeX, \
plain TeX, ConTeXt and Texinfo. It provides context-sensitive \
completion, documentation, code navigation, and related \
functionality to any text editor that speaks the LSP protocol."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5.1svn65223"

RPM_NAME = "texlive-digestif-2023.209.0.0.5.1svn65223-53.1.noarch.rpm"
RPM_HASH = "df2f4b4e9070aac5b30e52f643c22159b8fd02a7deefa87d251c0a3ee91ed9c62b5ab35d60dbf272fc3f051940c7ab33a0cb996c9b1c39063d2e21edb15ece39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-digestif"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-digestif-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
