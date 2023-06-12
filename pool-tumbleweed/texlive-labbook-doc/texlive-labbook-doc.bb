SUMMARY = "Documentation for texlive-labbook"
DESCRIPTION = "This package includes the documentation for texlive-labbook"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-labbook-doc-2023.201.svn15878-55.1.noarch.rpm"
RPM_HASH = "f2f4fadfd840e24edcd0a953ff8b5766bb3b05614a576dc94043ee9e55001519f56c90fed229aac3975569d74aab8d17c78a6c00403b75483c2e8a67d22f500c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-labbook-doc:de;en) \
texlive-labbook-doc"
RDEPENDS:${PN} += ""

inherit rpm
