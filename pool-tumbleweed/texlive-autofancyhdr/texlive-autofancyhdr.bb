SUMMARY = "Automatically compute headlength for fancyhdr package"
DESCRIPTION = "The package automatically computes headlength for the fancyhdr \
package"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn54049"

RPM_NAME = "texlive-autofancyhdr-2023.201.0.0.1svn54049-53.1.noarch.rpm"
RPM_HASH = "134e3b25593b2e7ec0869222e51ce68af087dd8dcfc57dbf36ba4db07ea1dba8d2051a203645db76bb70c7e9502bf077020cd5a2bb8b5fcc6e9d901f3cbd7b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autofancyhdr.sty \
texlive-autofancyhdr"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
tex-fancyhdr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
