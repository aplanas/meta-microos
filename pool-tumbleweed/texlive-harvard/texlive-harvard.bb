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

PV = "2023.209.2.0.5svn15878"

RPM_NAME = "texlive-harvard-2023.209.2.0.5svn15878-54.1.noarch.rpm"
RPM_HASH = "889765b959220e5ac3e02af2be9edd8ce1c2a6ca408337dccbf1d3ffc6c3544249765d359f8eb6c966b8fb7fc81d5c390670ebe342094802889b4cbe4ac52380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harvard.sty \
texlive-harvard"

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
