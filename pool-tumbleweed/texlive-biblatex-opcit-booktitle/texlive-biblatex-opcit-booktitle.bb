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

PV = "2023.201.1.9.0svn48983"

RPM_NAME = "texlive-biblatex-opcit-booktitle-2023.201.1.9.0svn48983-53.1.noarch.rpm"
RPM_HASH = "b9208e82b108326766b5b1676ab057822c06c8c0e40a256f4b43c565d91ade3d1112b85327d9bf720cc4137f59efc5ec5b178806ebd0282d6ae3cb1d08fc9ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-opcit-booktitle.sty \
texlive-biblatex-opcit-booktitle"

RDEPENDS:${PN} += "/bin/sh \
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
