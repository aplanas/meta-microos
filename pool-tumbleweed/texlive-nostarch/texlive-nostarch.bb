SUMMARY = "LaTeX class for No Starch Press"
DESCRIPTION = "The package provides the 'official' LaTeX style for No Starch \
Press. Provided are a class, a package for interfacing to \
hyperref and an index style file. The style serves both for \
printed and for electronic books."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-nostarch-2023.209.1.3svn15878-55.1.noarch.rpm"
RPM_HASH = "9ab3fd9c7215a39465868d52943f2fc1e10b098873adee17cd8dc386022897cd447bf98ea515c95a2af66a84bb028e6bc71005e4d31e898ccece6c7f8e260b41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nostarch.cls \
tex-nshyper.sty \
texlive-nostarch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-ragged2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
