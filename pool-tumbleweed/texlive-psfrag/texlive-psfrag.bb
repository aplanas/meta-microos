SUMMARY = "Replace strings in encapsulated PostScript figures"
DESCRIPTION = "Allows LaTeX constructions (equations, picture environments, \
etc.) to be precisely superimposed over Encapsulated PostScript \
figures, using your own favorite drawing tool to create an EPS \
figure and placing simple text 'tags' where each replacement is \
to be placed, with PSfrag automatically removing these tags \
from the figure and replacing them with a user specified LaTeX \
construction, properly aligned, scaled, and/or rotated."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.04svn15878"

RPM_NAME = "texlive-psfrag-2023.209.3.04svn15878-53.1.noarch.rpm"
RPM_HASH = "47a56601e0ff4b2ce28710510efb3eba7ebba716294109ab24f3a03e9f4f2df34fd6ed274cad36cecdf6e8a950c0412308856054ca3172faf94f444cfe75308a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-psfrag.sty \
texlive-psfrag"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
