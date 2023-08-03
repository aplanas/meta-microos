SUMMARY = "A class for minutes of meetings"
DESCRIPTION = "The present version of the class supports German meeting \
minutes including vote results and action items. The author has \
ambitions to internationalise the code, and would welcome \
support in the work."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.13svn25562"

RPM_NAME = "texlive-protocol-2023.209.1.13svn25562-53.1.noarch.rpm"
RPM_HASH = "2b6acd2eebd6e23207a23b1b2ff303b5c10277243ddc23c24bd615c9970bc9fc91cdfdc79764e6eee53702d1410f05684c3e049686a8e83fd7867dda141cb7bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-protocol.cls \
texlive-protocol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-scrartcl.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
