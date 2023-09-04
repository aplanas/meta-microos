SUMMARY = "Documentation for texlive-easyfloats"
DESCRIPTION = "This package includes the documentation for texlive-easyfloats"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn57204"

RPM_NAME = "texlive-easyfloats-doc-2023.209.1.0.0svn57204-54.2.noarch.rpm"
RPM_HASH = "5cada418782d2e5005b8e3cc78cefa69d0d6b7f9bda76c0ac1f1af25c2940777505389b2d47533cbb705a3429d25f7337db9a69a9798a45f3c8553487c7cadf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyfloats-doc"

RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
