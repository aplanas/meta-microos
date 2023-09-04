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

RPM_NAME = "texlive-harvard-2023.209.2.0.5svn15878-54.2.noarch.rpm"
RPM_HASH = "356abd78b9a07d5478dfd7f3bb4668e6205f448950e547ed2e9fa3036c3a0e7a08f14056c17523da9f03ad6f23857d3313adb5ebe554e7d0442e5a1005f67610"
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
