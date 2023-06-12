SUMMARY = "Documentation for texlive-authorindex"
DESCRIPTION = "This package includes the documentation for texlive-authorindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn51757"

RPM_NAME = "texlive-authorindex-doc-2023.201.svn51757-53.1.noarch.rpm"
RPM_HASH = "ca9e9cc3aad49f6624fdb6a6e6104cc4d2433c9e6bdb51bcedc4a607b6983e2891ac08d5e65f770c577958cb7908628fda57576e2a0b26ef9150389a643330dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authorindex-doc"
RDEPENDS:${PN} += ""

inherit rpm
