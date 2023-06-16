SUMMARY = "Subfont numbers for DNP font encoding"
DESCRIPTION = "part of the CJK package, ctan.org/pkg/cjk"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-dnp-2023.201.svn54074-52.1.noarch.rpm"
RPM_HASH = "a23f6f4bfdb195b2e9d366d3f90b238002a98ed391879ac9c938f91869a00193577074804ac9182e3ec356dc3c90958287a113fb7ece2d1e2b907d0243c51ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dnp"

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
