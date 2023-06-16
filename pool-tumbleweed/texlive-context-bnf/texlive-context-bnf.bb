SUMMARY = "A BNF module for ConTeXt"
DESCRIPTION = "The module provides a simple way to write good-looking \
BNF-style grammars in ConTeXt. Grammars are written using the \
BNF syntax right in your ConTeXt documents, so there is a clear \
separation between content and layout. This allows the user to \
decide exactly how the grammar is to be displayed, while also \
allowing the gist of the grammar to be understood from simply \
looking at the source ConTeXt document."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-bnf-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "0309d41fb1660086dcf25f45522435552d68f40befcadb966a7758565fe4f4c40f669a5a6588e477bc4f55a5184468c922fa6e480b8193cff74a7d8d56e3abcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-bnf.tex \
texlive-context-bnf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
