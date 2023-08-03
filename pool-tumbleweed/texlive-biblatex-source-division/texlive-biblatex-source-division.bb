SUMMARY = "References by 'division' in classical sources"
DESCRIPTION = "The package enables the user to make reference to 'division \
marks' (such as book, chapter, section), in the document being \
referenced, in addition to the page-based references that \
BibTeX-based citations have always had. The citation is made in \
the same way as the LaTeX standard, but what's inside the \
square brackets may include the 'division' specification, as in \
\\cite[(<division spec.>)<page number>]{<document>}"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4.2svn45379"

RPM_NAME = "texlive-biblatex-source-division-2023.209.2.4.2svn45379-54.1.noarch.rpm"
RPM_HASH = "0a362368d8584b4b5c553edb21dbf09b344419dae15a1da7f722673eee54e2b14287287f8aca704f0d48074f1169298186ffe7119d93c45658d2a102a0e2d632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-source-division.sty \
texlive-biblatex-source-division"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
