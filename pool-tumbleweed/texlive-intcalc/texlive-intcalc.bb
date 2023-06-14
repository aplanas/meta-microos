SUMMARY = "Expandable arithmetic operations with integers"
DESCRIPTION = "This package provides expandable arithmetic operations with \
integers, using the e-TeX extension \\numexpr if it is \
available."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53168"

RPM_NAME = "texlive-intcalc-2023.201.1.3svn53168-52.1.noarch.rpm"
RPM_HASH = "8afde2dfa59da729acafe6529c7cd3c03c628f85e6e08021a9e3acb5f868f02fdab9aef661a1682290cba254b5bf3d5e11a32b27a22368dc95a9f7d46799da85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-intcalc.sty \
texlive-intcalc"

RDEPENDS:${PN} += "/bin/sh \
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
