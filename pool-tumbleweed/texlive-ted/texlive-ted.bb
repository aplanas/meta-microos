SUMMARY = "A (primitive) token list editor"
DESCRIPTION = "Just like sed is a stream editor, ted is a token list editor. \
Actually, it is not as powerful as sed, but its main feature \
is that it really works with tokens, not only characters. The \
ted package provides two user macros: \\Substitute and \
\\ShowTokens. The first is maybe the most useful: it performs \
substitutions in token lists (even inside braces). The second \
displays each token of the list (one per line) with its catcode \
(in the list, not just the current one), and can be useful for \
debugging or for TeX learners. Ted is designed to work well \
even if strange tokens (that is, unusual {charcode, catcode} \
pairs or tokens with a confusing meaning) occur in the list."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn15878"

RPM_NAME = "texlive-ted-2023.209.1.06svn15878-55.1.noarch.rpm"
RPM_HASH = "4ce614c7d01a161f309126566ebb16282cf63700459dd507df7ba917dd09127f7edc07a3497046b73530bec0e967d592436af98ec841ec4190957983e15cc43f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ted.sty \
texlive-ted"

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
