SUMMARY = "Produces figures which text can flow around"
DESCRIPTION = "Allows figures or tables to have text wrapped around them. Does \
not work in combination with list environments, but can be used \
in a parbox or minipage, and in twocolumn format. Supports the \
float package."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn61719"

RPM_NAME = "texlive-wrapfig-2023.201.3.6svn61719-52.1.noarch.rpm"
RPM_HASH = "afee530c2d85cc95f9d8c146517c317c8af1eb597bb39d4af63a5ca6b58b2cf1248cf0d0af6d834dab1b1bf1229326567dfda58343da5306853a92b9f9a18180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wrapfig.sty) \
texlive-wrapfig"
RDEPENDS:${PN} += "/bin/sh \
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
