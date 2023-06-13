SUMMARY = "Documentation for texlive-ukrhyph"
DESCRIPTION = "This package includes the documentation for texlive-ukrhyph"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21081"

RPM_NAME = "texlive-ukrhyph-doc-2023.201.svn21081-53.1.noarch.rpm"
RPM_HASH = "3c3cf2863e20b703a6146795fa69e66adf43e15779940a46bc96791720938cf6daae445bad97b9f55262d0e428c912c85a00d2cf4b84ce17246035760e54def5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ukrhyph-doc:en_GB) \
texlive-ukrhyph-doc"

RDEPENDS:${PN} += ""

inherit rpm
