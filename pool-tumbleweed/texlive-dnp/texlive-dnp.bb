SUMMARY = "Subfont numbers for DNP font encoding"
DESCRIPTION = "part of the CJK package, ctan.org/pkg/cjk"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-dnp-2023.209.svn54074-53.1.noarch.rpm"
RPM_HASH = "eb051c63b4c408cd5ef407b7d1cc7bb6e495fd211f158a76c0ac84e41bd060f3d5bf12277207d5bd379dfa549955bb52cac4aed3099b4e008299019cb08b797d"
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
