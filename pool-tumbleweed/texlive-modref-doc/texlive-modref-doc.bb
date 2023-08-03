SUMMARY = "Documentation for texlive-modref"
DESCRIPTION = "This package includes the documentation for texlive-modref"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-modref-doc-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "247f26eae4dae57e46e0b6e327d2bda88a5e1f62f06273bea40608bc1c18c3ec8c39e7e8a8c51fba7b1eac46e002508d36ee194d0f67a59a6ed1d1dfcb446ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modref-doc"

RDEPENDS:${PN} += ""

inherit rpm
