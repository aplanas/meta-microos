SUMMARY = "Notations for typesetting the 'Principia Mathematica'"
DESCRIPTION = "This package supports typesetting the Peanese notation in \
Volume I of Whitehead and Russell's 1910 'Principia \
Mathematica'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn58927"

RPM_NAME = "texlive-principia-2023.209.1.3svn58927-53.1.noarch.rpm"
RPM_HASH = "a4a7a1b8a1e9da14f057f138f3b7ea9bbc5cfdee0164e611c9fef2485cfcccd2c63365e4dafb9c256aabf180c1f159440834db7d315d7e272ce2b4ccafa3cca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-principia.sty \
texlive-principia"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-graphicx.sty \
tex-pifont.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
