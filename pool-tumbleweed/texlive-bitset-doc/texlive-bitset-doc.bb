SUMMARY = "Documentation for texlive-bitset"
DESCRIPTION = "This package includes the documentation for texlive-bitset"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53837"

RPM_NAME = "texlive-bitset-doc-2023.209.1.3svn53837-53.1.noarch.rpm"
RPM_HASH = "2f0248aed67eeafc8ff542da9c0bd908a86a04e17b12615083537c6217298a11e835abd45134ed98b389239742822933d0da15b997c7309d43a37ccd79b84633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitset-doc"

RDEPENDS:${PN} += ""

inherit rpm
