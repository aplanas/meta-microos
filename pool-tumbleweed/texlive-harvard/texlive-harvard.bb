SUMMARY = "Harvard citation package for use with LaTeX 2e"
DESCRIPTION = "This is a re-implementation, for LaTeX 2e, of the original \
Harvard package. The bundle contains the LaTeX package, several \
BibTeX styles, and a 'Perl package' for use with LaTeX2HTML. \
Harvard is an author-year citation style (all but the first \
author are suppressed in second and subsequent citations of the \
same entry); the package defines several variant styles: \
apsr.bst for the American Political Science Review; agsm.bst \
for Australian Government publications; dcu.bst from the Design \
Computing Unit of the University of Sydney; kluwer.bstwhich \
aims at the format preferred in Kluwer publications; \
nederlands.bst which deals with sorting Dutch names with \
prefixes (such as van) according to Dutch rules, together with \
several styles whose authors offer no description of their \
behaviour."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.5svn15878"

RPM_NAME = "texlive-harvard-2023.201.2.0.5svn15878-53.1.noarch.rpm"
RPM_HASH = "ff41fa7c513a25504426214752b53bc155ef3ce26fbd509123459fc299f948dcb0377febf3cfb69530289e5c7d916a7dfbf30aeb55ed2aa2709faafb5509c2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harvard.sty \
texlive-harvard"

RDEPENDS:${PN} += "/bin/sh \
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
