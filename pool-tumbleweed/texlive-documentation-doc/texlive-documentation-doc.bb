SUMMARY = "Documentation for texlive-documentation"
DESCRIPTION = "This package includes the documentation for texlive-documentation"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn34521"

RPM_NAME = "texlive-documentation-doc-2023.201.0.0.1svn34521-52.1.noarch.rpm"
RPM_HASH = "f5bcb266d518b45a639adba23e66083dd571ba8d3c02d9cd60822b5f6315a6f7c06b63f7cb26c86a723e6b5d1e9b8635f6fe4bde491c0a6ce6994e576610238f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-documentation-doc"

RDEPENDS:${PN} += ""

inherit rpm
