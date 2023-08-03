SUMMARY = "An 'end of proof' sign"
DESCRIPTION = "This package provides an additional 'end of proof' sign. The \
command's name is \\wasserdicht."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55643"

RPM_NAME = "texlive-endofproofwd-2023.209.svn55643-54.1.noarch.rpm"
RPM_HASH = "195049e1fa2b5a9d1521546dc6761945b4b9b85736c93c08c0f3fac211219a3452f3fdca89b951920e102815c7720fd3a6a1c634f053a2c1c6ec36bb413cfb97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endofproofwd.sty \
texlive-endofproofwd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-import.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
