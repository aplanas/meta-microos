SUMMARY = "Derivation trees with MetaPost"
DESCRIPTION = "A set of MetaPost macros for typesetting derivation trees (such \
as used in sequent calculus, type inference, programming \
language semantics...). No MetaPost knowledge is needed to use \
these macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.97svn29349"

RPM_NAME = "texlive-drv-2023.209.0.0.97svn29349-53.1.noarch.rpm"
RPM_HASH = "397e85f8f469b5166d8ad438c45aff442b81b7cc784f86e2679bcd5c44cbaaa43b466646071a353886d950cc9f627bf963841365f70db2c05b14825083983f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drv"

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
