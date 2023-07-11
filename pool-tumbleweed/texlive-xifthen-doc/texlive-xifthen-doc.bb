SUMMARY = "Documentation for texlive-xifthen"
DESCRIPTION = "This package includes the documentation for texlive-xifthen"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn38929"

RPM_NAME = "texlive-xifthen-doc-2023.201.1.4.0svn38929-52.2.noarch.rpm"
RPM_HASH = "4111120992892cbc4cda22c34509514c85d7d1f8a2449afcdf14c56e78dc3e7d22a651649e8b80aa4eb537622f5c210139887934eed7ec23b34fc2e02d4c7d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xifthen-doc"

RDEPENDS:${PN} += ""

inherit rpm
