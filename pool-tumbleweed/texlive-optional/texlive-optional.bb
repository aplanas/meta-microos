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

PV = "2023.201.2.2bsvn18131"

RPM_NAME = "texlive-optional-2023.201.2.2bsvn18131-54.1.noarch.rpm"
RPM_HASH = "926a0ce9f5a939ca6a3cfd0e6d07511c7f06705afd5156bf519ce253368cc3ed8ae18c79c4e3434eae590cd1c90cb3cb4089222f5744f502c551f7b817739c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-optional.sty \
texlive-optional"

RDEPENDS:${PN} += "/bin/sh \
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
