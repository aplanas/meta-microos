SUMMARY = "Expandable arithmetic operations with integers"
DESCRIPTION = "This package provides expandable arithmetic operations with \
integers, using the e-TeX extension \\numexpr if it is \
available."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.3svn53168"

RPM_NAME = "texlive-intcalc-2023.208.1.3svn53168-53.1.noarch.rpm"
RPM_HASH = "f7be71556a949070cd338c459212d3a5ffc60e759c6a008662313df3815e5e5a7e835fef5512c36ddcd40ca5836a8bd6bc78955c25f31db5337d8fe0e15b1e32"
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
