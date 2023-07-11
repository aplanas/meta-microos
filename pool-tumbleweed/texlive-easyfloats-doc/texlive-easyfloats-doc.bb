SUMMARY = "Documentation for texlive-easyfloats"
DESCRIPTION = "This package includes the documentation for texlive-easyfloats"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn57204"

RPM_NAME = "texlive-easyfloats-doc-2023.201.1.0.0svn57204-53.2.noarch.rpm"
RPM_HASH = "1ee74f4c0282d7319222e8aaf618c6202ce8dd3c9006c790709d065e2d68bf751d2bc3eb5377b2f65db9f0968d91ee568b3edf3261478869abbc922c8fa5b216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyfloats-doc"

RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
