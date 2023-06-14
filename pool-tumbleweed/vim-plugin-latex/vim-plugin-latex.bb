SUMMARY = "A rich set of tools for editing LaTeX"
DESCRIPTION = "Vim-LaTeX (aka LaTeX-suite) is a mature project which aims at bringing \
together the rich set of LaTeX tools the vim community has produced over \
the years into one comprehensive package. It provides a set of tools \
which enable you to do all your LaTeX-ing without needing to quit Vim."
LICENSE = "Vim"

PV = "1.10.0+20220519"

RPM_NAME = "vim-plugin-latex-1.10.0+20220519-55.1.noarch.rpm"
RPM_HASH = "403924f602b18ef77a4a380940e6c65268470f068f5ec78736344b83cac62d4e4f2aa1c63de6bfde7622b5a3a48c9b428e1404d137c6a61e8843d24cbd14e7fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-latex"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/perl \
texlive-latex \
vim"

inherit rpm
