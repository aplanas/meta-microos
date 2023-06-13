SUMMARY = "Documentation for texlive-minibox"
DESCRIPTION = "This package includes the documentation for texlive-minibox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn30914"

RPM_NAME = "texlive-minibox-doc-2023.201.0.0.2asvn30914-54.1.noarch.rpm"
RPM_HASH = "03e040c14bab0e597677558480044f8afa619b30b090e72aa074a78314b1d335e2cb5535306ce24b4f85a25b65a5a02084c20fa67eccb25a1b1bdb1decf7bc59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minibox-doc"

RDEPENDS:${PN} += ""

inherit rpm
