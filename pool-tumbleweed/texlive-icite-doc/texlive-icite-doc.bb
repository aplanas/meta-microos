SUMMARY = "Documentation for texlive-icite"
DESCRIPTION = "This package includes the documentation for texlive-icite"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3asvn54512"

RPM_NAME = "texlive-icite-doc-2023.209.1.3asvn54512-54.1.noarch.rpm"
RPM_HASH = "776ea2e1ee2d1e5b450e507795d16d9b7bc86fe9c42d035fae132849e71bf42326f57a7c564d34856a4f1e01b990c3458ab568d4c3007422a7e34a381fe57b69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-icite-doc"

RDEPENDS:${PN} += ""

inherit rpm
