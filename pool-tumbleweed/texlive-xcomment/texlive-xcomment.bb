SUMMARY = "Allows selected environments to be included/excluded"
DESCRIPTION = "The package defines an environment that only typesets specified \
environments within its scope. So, for example, if you want \
nothing but the figure and table environments in your document, \
you can enclose the whole document with an xcomment environment \
that excludes everything but. This is a lot easier than \
excluding the chunks of text between the environments you want, \
or creating an entire document containing only those \
environments. The package was previously part of the seminar \
bundle for typesetting presentations."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn20031"

RPM_NAME = "texlive-xcomment-2023.209.1.3svn20031-53.1.noarch.rpm"
RPM_HASH = "ecf97da513a5a2c716c646fc9d3cc9fbcc8efa9bbd1f5e25671f43dc55afcb7f6155186bdfc2fcecfaefbb6d5f3a278d0559c1acfd5301c9a787f07d5cc4af4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcomment.sty \
tex-xcomment.tex \
texlive-xcomment"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
