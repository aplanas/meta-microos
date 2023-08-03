SUMMARY = "A BNF module for ConTeXt"
DESCRIPTION = "The module provides a simple way to write good-looking \
BNF-style grammars in ConTeXt. Grammars are written using the \
BNF syntax right in your ConTeXt documents, so there is a clear \
separation between content and layout. This allows the user to \
decide exactly how the grammar is to be displayed, while also \
allowing the gist of the grammar to be understood from simply \
looking at the source ConTeXt document."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-bnf-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "68e8322698db194831d2671b24a3bfbe1b16a5a27b4977a27693bdff47e082bebf8b8d7c6bb5ded9f41b330779d54a4f10a9fc382bbcb893d94a03ef0fc89789"
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
