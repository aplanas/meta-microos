SUMMARY = "Generate ConTeXt syntax highlighting code from vim"
DESCRIPTION = "ConTeXt has excellent pretty printing capabilities for many \
languages. The code for pretty printing is written in TeX, and \
due to catcode juggling, such verbatim typesetting is perhaps \
the trickiest part of TeX. This makes it difficult for a \
'normal' user to define syntax highlighting rules for a new \
language. This module takes the onus of defining syntax \
highlighting rules away from the user and uses ViM editor to \
generate the syntax highlighting. There is a helper \
2context.vim script to do the syntax parsing in ViM."
LICENSE = "BSD-3-Clause"

PV = "2023.204.svn62071"

RPM_NAME = "texlive-context-vim-2023.204.svn62071-54.1.noarch.rpm"
RPM_HASH = "eecba56de1ff6f9d0c6fb55a2e01772e409fb7aa27518a5e13ac357714885783116792f5488931a040212953b719166446f34257da4b955ffae4fbea7c7a5dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-vim.tex \
texlive-context-vim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-context-filter \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
