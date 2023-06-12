SUMMARY = "LaTeX package options with pgfkeys"
DESCRIPTION = "The pgfkeys package (part of the pgf distribution) is a \
well-designed way of defining and using large numbers of keys \
for key-value syntaxes. However, pgfkeys itself does not offer \
means of handling LaTeX class and package options. This package \
adds such option handling to pgfkeys, in the same way that \
kvoptions adds the same facility to the LaTeX standard keyval \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1asvn56615"

RPM_NAME = "texlive-pgfopts-2023.201.2.1asvn56615-51.1.noarch.rpm"
RPM_HASH = "497d447a4ef1d62da40a6019ca394a49091d83924ddcfee280aad87d11c5399f0e6169a544f30f16a606d126167b6277676a25b17052ebccf5c7be16d7e29eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgfopts.sty) \
texlive-pgfopts"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pgfkeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
