SUMMARY = "Produces figures which text can flow around"
DESCRIPTION = "Allows figures or tables to have text wrapped around them. Does \
not work in combination with list environments, but can be used \
in a parbox or minipage, and in twocolumn format. Supports the \
float package."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn61719"

RPM_NAME = "texlive-wrapfig-2023.201.3.6svn61719-52.2.noarch.rpm"
RPM_HASH = "9a02bf00644cfc3021e6582f287cf7a46023a877e1a1fbb3b6fa107ba3059a3fe220765a9f09dc63754c7529659dd8aa5842241d4ca060c24540a3d4f5efabad"
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
