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

PV = "2023.201.1.1.0svn15878"

RPM_NAME = "texlive-tokenizer-2023.201.1.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "65f4b1f33db8a069cad2601b8f1d14280452085838be82688365b3245110014906ab7cd32cf68f50bff4e38dd84b9990f586ba31479fc870885acef522ab45ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tokenizer.sty) \
texlive-tokenizer"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
