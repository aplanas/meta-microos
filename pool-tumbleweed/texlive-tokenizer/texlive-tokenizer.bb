SUMMARY = "A tokenizer"
DESCRIPTION = "A tokenizer for LaTeX. \\GetTokens{Target1}{Target2}{Source} \
splits source into two tokens at the first encounter of a \
comma. The first token is saved in a newly created command with \
the name passed as <Target1> and the second token likewise. A \
package option 'trim' causes leading and trailing space to be \
removed from each token; with this option, the \\TrimSpaces \
command is defined, which removes leading and trailing spaces \
from its argument."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn15878"

RPM_NAME = "texlive-tokenizer-2023.209.1.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "004ace7331c2c496b100d549b1f8beb6e4bc4bbaad85679541b2fe7743179febcdb0cfe322ca69c849dd659055663e6c3a53dfee1985ad41e1e800240c6eb9f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tokenizer.sty \
texlive-tokenizer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
