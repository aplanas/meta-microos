SUMMARY = "A rich set of tools for editing LaTeX"
DESCRIPTION = "Vim-LaTeX (aka LaTeX-suite) is a mature project which aims at bringing \
together the rich set of LaTeX tools the vim community has produced over \
the years into one comprehensive package. It provides a set of tools \
which enable you to do all your LaTeX-ing without needing to quit Vim."
LICENSE = "Vim"

PV = "1.10.0+20220519"

RPM_NAME = "vim-plugin-latex-1.10.0+20220519-56.1.noarch.rpm"
RPM_HASH = "e513fc42738d5094eef4080ac38166dac5d4722024d9b9583b51d7bfa275629113e3d944f877185a11d1bc9a817b2ed1a3983c5099727a03ddfd88334796c63f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-latex"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
texlive-latex \
vim"

inherit rpm
