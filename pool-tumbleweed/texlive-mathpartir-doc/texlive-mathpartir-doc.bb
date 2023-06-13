SUMMARY = "Documentation for texlive-mathpartir"
DESCRIPTION = "This package includes the documentation for texlive-mathpartir"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3.2svn39864"

RPM_NAME = "texlive-mathpartir-doc-2023.201.1.3.2svn39864-52.1.noarch.rpm"
RPM_HASH = "3c36856f78bcb23932174648a75b2be159f74d6ad577e71173c466fdda482c44952c1f0f987bd8c505ac91ebfbb25c18e9750e2c8dbbe2cfcf2c7415fc1189ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathpartir-doc"

RDEPENDS:${PN} += ""

inherit rpm
