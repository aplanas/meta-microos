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

RPM_NAME = "texlive-xcomment-2023.209.1.3svn20031-53.2.noarch.rpm"
RPM_HASH = "1c53ceef1158d8cabaacbdf3b077a07e5dcd6b614ea37f6b24941df96a09b6786871c02b5ca82ce6c05e10a28e25075559a0a62259e11d195f39d4f811de5da9"
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
