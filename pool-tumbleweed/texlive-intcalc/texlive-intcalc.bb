SUMMARY = "Expandable arithmetic operations with integers"
DESCRIPTION = "This package provides expandable arithmetic operations with \
integers, using the e-TeX extension \\numexpr if it is \
available."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53168"

RPM_NAME = "texlive-intcalc-2023.209.1.3svn53168-54.1.noarch.rpm"
RPM_HASH = "49839fee994bc61323d3ce36e4bc3368a9141f6b9580f9eeae7bf38f01d8c27b140e4a375b6d17aafe12d1e2286f71eb1c6f5922c7def5b6b73bab45cd077a9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-intcalc.sty \
texlive-intcalc"

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
