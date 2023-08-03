SUMMARY = "Facilitate optional printing of parts of a document"
DESCRIPTION = "Optional provides simple, flexible, optional compilation of \
LaTeX documents. Option switches may be given via package \
options, by the \\UseOption command, or interactively via the \
\\AskOption command (help text may be provided, by defining the \
\\ExplainOptions command). The package is not robust, in the way \
that comment package is, against ill-behaved text. In \
particular, verbatim text may not be directly included in \
optional sections (whether they're included or not)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2bsvn18131"

RPM_NAME = "texlive-optional-2023.209.2.2bsvn18131-55.1.noarch.rpm"
RPM_HASH = "c461b800b2979821fe40876103300df8d1576717c708df8b7bb51d302af87499db6e0afeb3b458b92b7834d8c8c6a8c2e1357b991f241ef16e9c11262e3e565d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-optional.sty \
texlive-optional"

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
