SUMMARY = "Development pre-release of the LaTeX firstaid package"
DESCRIPTION = "This is a pre-release version of the standard LaTeX firstaid \
package. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0wsvn65181"

RPM_NAME = "texlive-latex-firstaid-dev-2023.201.1.0wsvn65181-55.1.noarch.rpm"
RPM_HASH = "0a187758bcf62d514b91a8a4a392c27aa1e018648e4ab84c80360693d285cb7a5228ec1660ea21c1f3dc5b6281995d62aff3f79433351ba4ddff043f56ada5bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-everysel-ltx.sty \
texdev-filehook-ltx.sty \
texlive-latex-firstaid-dev"

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
