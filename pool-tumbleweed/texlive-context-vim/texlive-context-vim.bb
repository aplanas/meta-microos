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

PV = "2023.209.svn62071"

RPM_NAME = "texlive-context-vim-2023.209.svn62071-55.1.noarch.rpm"
RPM_HASH = "029872f1f5829b44a52986826ded34ae86a718ed71f761ed3c967b6bad5782c23a8b41f16cc53c5bba768fde6d0cbe6e641b46755981b4aeb1a4dc2b7870a4d7"
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
