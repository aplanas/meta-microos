SUMMARY = "Use op. cit. for the booktitle of a subentry"
DESCRIPTION = "The default citation styles verbose-trad1+; verbose-trad2 ; \
verbose-trad3 use the op. cit. form in order to have a shorter \
reference when a title has already been cited. However, when \
you cite two entries which share the same booktitle but not the \
same title, the op. cit. mechanism does not work. This package \
enables to obtain references like this: Author1, Title, in \
Booktitle, Location, Publisher, Year, pages xxx Author2, \
Title2, in Booktitle, op. cit, pages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.0svn48983"

RPM_NAME = "texlive-biblatex-opcit-booktitle-2023.209.1.9.0svn48983-54.1.noarch.rpm"
RPM_HASH = "4760ac7be278a3fba1e549a8ffd90c6e3e30b74e4c5393c6df0d1359599f30968ef78455180b08452600a9a477f958032304f590f36f1eeec12d3a100df9c25f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-opcit-booktitle.sty \
texlive-biblatex-opcit-booktitle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxcmds.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
