SUMMARY = "Font containing web-related icons"
DESCRIPTION = "The package offers access to the large number of web-related \
icons provided by the included font. The package requires the \
package, fontspec, if run with XeTeX or LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.6.3.2svn48145"

RPM_NAME = "texlive-fontawesome-2023.209.4.6.3.2svn48145-53.1.noarch.rpm"
RPM_HASH = "e2c55d063d15f7b61f41ae10a1542c08e3730022e5b591308c560c4c0cc9181497550121491aa4abb7b162bc372b0f4ecc78019070ef5e3bc852878eaeb25e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-FontAwesome--fontawesomeone.tfm \
tex-FontAwesome--fontawesomethree.tfm \
tex-FontAwesome--fontawesometwo.tfm \
tex-fontawesome.map \
tex-fontawesome.sty \
tex-fontawesomeone.enc \
tex-fontawesomesymbols-generic.tex \
tex-fontawesomesymbols-pdftex.tex \
tex-fontawesomesymbols-xeluatex.tex \
tex-fontawesomethree.enc \
tex-fontawesometwo.enc \
tex-ufontawesomeone.fd \
tex-ufontawesomethree.fd \
tex-ufontawesometwo.fd \
texlive-fontawesome"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-fontawesome-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
