SUMMARY = "Documentation for texlive-superiors"
DESCRIPTION = "This package includes the documentation for texlive-superiors"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn51909"

RPM_NAME = "texlive-superiors-doc-2023.201.1.06svn51909-57.1.noarch.rpm"
RPM_HASH = "8fa5a5922e6e9607ca39a79d7183b3f89b23d158add94744b528bdac8c70c98168e2fce706db02a26fc62656cb6cf3c9a73b4af0ae0e6e1b3c60fdec8a386bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-superiors-doc"
RDEPENDS:${PN} += ""

inherit rpm
