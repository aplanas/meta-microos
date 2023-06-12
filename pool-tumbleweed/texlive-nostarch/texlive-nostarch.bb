SUMMARY = "LaTeX class for No Starch Press"
DESCRIPTION = "The package provides the 'official' LaTeX style for No Starch \
Press. Provided are a class, a package for interfacing to \
hyperref and an index style file. The style serves both for \
printed and for electronic books."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-nostarch-2023.201.1.3svn15878-54.1.noarch.rpm"
RPM_HASH = "6c5019af8c3e47724f34a06f6e670f670a807b2b10bf014eba687be88d1eba5eee6da12f6a4bd865d30060bcd7c58711df0b558eb95a913be5c9910fba4377f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nostarch.cls) \
tex(nshyper.sty) \
texlive-nostarch"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(book.cls) \
tex(ragged2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
