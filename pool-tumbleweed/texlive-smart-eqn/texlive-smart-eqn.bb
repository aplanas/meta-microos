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

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-smart-eqn-2023.209.1.0svn61719-58.1.noarch.rpm"
RPM_HASH = "ba21ffc8a94b1dbb565da3926a83010c457510f7bac62777c73cff4af3f4405c4ad8a5a803d79e63ad0b6aa5fb4c2ee6fd3869d332001f5381b0a8c2b602fc68"
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
