SUMMARY = "Enumitem documentation, in German"
DESCRIPTION = "This is a translation of the manual for enumitem."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24196"

RPM_NAME = "texlive-translation-enumitem-de-2023.209.svn24196-53.1.noarch.rpm"
RPM_HASH = "41d09e189607a087f0ddd46416dd1abd9901e0dfc30ed88da128b1f11567b33c78faee4a77bd0e3d2806732758353c97fc6a2124a50b7917fe8eca350b05fbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-enumitem-de"

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
