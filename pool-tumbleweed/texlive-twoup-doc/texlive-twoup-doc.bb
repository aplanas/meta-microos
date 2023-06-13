SUMMARY = "Documentation for texlive-twoup"
DESCRIPTION = "This package includes the documentation for texlive-twoup"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-twoup-doc-2023.201.1.3svn15878-52.1.noarch.rpm"
RPM_HASH = "cfe3447ea7421842a7bbf18501fe77f3d0b782acc242fc6e8de944973fee65bcd7b0685f5171e5577596e8aeda66070a2cbf88757b5d75dc67f6f0dcabd7c75e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twoup-doc"

RDEPENDS:${PN} += ""

inherit rpm
