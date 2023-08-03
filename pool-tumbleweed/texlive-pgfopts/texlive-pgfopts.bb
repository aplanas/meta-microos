SUMMARY = "LaTeX package options with pgfkeys"
DESCRIPTION = "The pgfkeys package (part of the pgf distribution) is a \
well-designed way of defining and using large numbers of keys \
for key-value syntaxes. However, pgfkeys itself does not offer \
means of handling LaTeX class and package options. This package \
adds such option handling to pgfkeys, in the same way that \
kvoptions adds the same facility to the LaTeX standard keyval \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1asvn56615"

RPM_NAME = "texlive-pgfopts-2023.209.2.1asvn56615-52.1.noarch.rpm"
RPM_HASH = "2f24925607a34ee677f9276c1992a803e5b4dfb8dcacf2f1721059007c0a71cd8a38fd60e18e8c642df776036ef96f79ceba1e3c9410d2ad6962c47656ff3479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfopts.sty \
texlive-pgfopts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
