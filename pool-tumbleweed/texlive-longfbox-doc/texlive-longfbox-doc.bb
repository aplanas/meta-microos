SUMMARY = "Documentation for texlive-longfbox"
DESCRIPTION = "This package includes the documentation for texlive-longfbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39028"

RPM_NAME = "texlive-longfbox-doc-2023.201.1.0svn39028-54.1.noarch.rpm"
RPM_HASH = "f2f39064a7e8c8dc85c4f75e61c6eb1e9ee86d5c2849922dad46d28a991d526bfe3946f6ccc4087ba41678156231b3da1024f73800d793556992b2a82cb59e2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longfbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
