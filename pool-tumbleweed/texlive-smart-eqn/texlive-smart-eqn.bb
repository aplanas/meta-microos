SUMMARY = "Automatic math symbol styling for LaTeX documents"
DESCRIPTION = "In LaTeX typesetting, one usually needs to use different \
variants of a math symbol to clarify the meanings. For example, \
in linear algebra literature, it is common to use boldfaced \
symbols to represent vectors, and normal symbols to represent \
scalars. However, applying these variants by typing \\mathbf, \
\\mathrm commands manually can be daunting. This package aims to \
provide an automatic and customizable approach for math symbol \
styling which eliminates the need to enter style commands \
repeatedly."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-smart-eqn-2023.201.1.0svn61719-57.1.noarch.rpm"
RPM_HASH = "6facdfd56922a0027737107361d5f950c6503999c37be885e311c6487e2ec6efed4c62cfb8287ca9af754c111ee95ceacde54d679c5db430bd2eec87c8a0dce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-smart-eqn.sty \
texlive-smart-eqn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fancyvrb.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
