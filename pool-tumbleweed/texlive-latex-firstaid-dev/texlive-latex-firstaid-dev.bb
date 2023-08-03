SUMMARY = "Development pre-release of the LaTeX firstaid package"
DESCRIPTION = "This is a pre-release version of the standard LaTeX firstaid \
package. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0wsvn65181"

RPM_NAME = "texlive-latex-firstaid-dev-2023.209.1.0wsvn65181-56.1.noarch.rpm"
RPM_HASH = "afe2df949252b8632deb29a9b2701f59d9d3fd41038f10d695f380f45595566c6aa479bed49b6d6c220b141d47ac0dac110f53999754803ab20c431fc9525e67"
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
