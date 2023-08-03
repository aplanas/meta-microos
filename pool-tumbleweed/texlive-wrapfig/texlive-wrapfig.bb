SUMMARY = "Produces figures which text can flow around"
DESCRIPTION = "Allows figures or tables to have text wrapped around them. Does \
not work in combination with list environments, but can be used \
in a parbox or minipage, and in twocolumn format. Supports the \
float package."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn61719"

RPM_NAME = "texlive-wrapfig-2023.209.3.6svn61719-53.1.noarch.rpm"
RPM_HASH = "4441e5eadaa4554821830912dcbeb09207e88cee7abc017e7b37f57e9b6661d565bac29399fbe32d0f3769ab466f326d5e80ba53c8084e4d7c94ce0513decd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wrapfig.sty \
texlive-wrapfig"

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
