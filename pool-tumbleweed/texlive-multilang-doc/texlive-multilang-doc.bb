SUMMARY = "Documentation for texlive-multilang"
DESCRIPTION = "This package includes the documentation for texlive-multilang"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9bsvn49065"

RPM_NAME = "texlive-multilang-doc-2023.209.0.0.9bsvn49065-55.1.noarch.rpm"
RPM_HASH = "eccae2f21c81fdba4cbe0d6fa8ddc5ce04d8c52219d606df4fcd083549e0a1db1e26a07ae9aeab8620ea00a2d2eb8b460870ea61ed6a4844b9b8b80deb498523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multilang-doc"

RDEPENDS:${PN} += ""

inherit rpm
