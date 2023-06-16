SUMMARY = "Font containing web-related icons"
DESCRIPTION = "The package offers access to the large number of web-related \
icons provided by the included font. The package requires the \
package, fontspec, if run with XeTeX or LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.6.3.2svn48145"

RPM_NAME = "texlive-fontawesome-2023.201.4.6.3.2svn48145-52.1.noarch.rpm"
RPM_HASH = "e5a41f21aa2728d353107b098f3b0a29f0122bcb678e0b46bab9fcfb0dddebe755c10a69e60f77d5a9303ac450f71861ab54e91b775d5a5d77bcbba864059576"
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
