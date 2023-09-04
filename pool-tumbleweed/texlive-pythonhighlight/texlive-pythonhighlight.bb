SUMMARY = "Highlighting of Python code, based on the listings package"
DESCRIPTION = "Highlighting of Python code, based on the listings package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43191"

RPM_NAME = "texlive-pythonhighlight-2023.209.svn43191-54.2.noarch.rpm"
RPM_HASH = "1aad7df1c87a3075073ed986d7fe2a40575b1e5724a72adffebc95bd541ba66f78014445551943ae1d7874074ae1ed233aaf5204e168ca65ec13b4a5d5335b18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pythonhighlight.sty \
texlive-pythonhighlight"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
