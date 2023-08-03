SUMMARY = "St. Mary's Road font support for plain TeX"
DESCRIPTION = "The package provides commands to produce all the symbols of the \
St Mary's Road fonts, in a Plain TeX environment."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.5csvn31088"

RPM_NAME = "texlive-plstmary-2023.209.0.0.5csvn31088-53.1.noarch.rpm"
RPM_HASH = "b441fe2f0f8090661f9037007f415569c330db39b9bb8dd8cbafc622c9f76f558534d412d5429019cb7dcb929bbcf1f2169f2d544963eed7485786d38de1d0a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stmary.tex \
texlive-plstmary"

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
