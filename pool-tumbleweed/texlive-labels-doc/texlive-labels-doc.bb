SUMMARY = "Documentation for texlive-labels"
DESCRIPTION = "This package includes the documentation for texlive-labels"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn15878"

RPM_NAME = "texlive-labels-doc-2023.201.0.0.13svn15878-55.1.noarch.rpm"
RPM_HASH = "bd70a95bd01faa41cd46d50736e997f63b6e13167fc1c757d05bf0258fbff7d2038271c425b41acd3ec9db15905b98f55e5c9042d563c89c3c4384195600e460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labels-doc"
RDEPENDS:${PN} += ""

inherit rpm
