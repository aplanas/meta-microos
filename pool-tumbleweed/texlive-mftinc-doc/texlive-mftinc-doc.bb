SUMMARY = "Documentation for texlive-mftinc"
DESCRIPTION = "This package includes the documentation for texlive-mftinc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn15878"

RPM_NAME = "texlive-mftinc-doc-2023.209.1.0asvn15878-55.1.noarch.rpm"
RPM_HASH = "eba02327c5068f6ab98a746c3013773c68260f5c7029cc5ceac74a61ea2923a827d061c84d68d983b4c58d240ac8d37fd0d04ba206a7070354f2e3313f53610d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mftinc-doc"

RDEPENDS:${PN} += ""

inherit rpm
