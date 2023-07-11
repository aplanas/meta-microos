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

PV = "2023.201.1.3svn20031"

RPM_NAME = "texlive-xcomment-2023.201.1.3svn20031-52.2.noarch.rpm"
RPM_HASH = "6ef75468686af1ea472ff1f234896587906eabbada2195a7e837419f54b8cccb728ca064af83dae4af298f3cd8cdba89f8614b8499311a3b75a0301b58dca288"
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
