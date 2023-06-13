SUMMARY = "Documentation for texlive-asana-math"
DESCRIPTION = "This package includes the documentation for texlive-asana-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.000.958svn59629"

RPM_NAME = "texlive-asana-math-doc-2023.201.0.000.958svn59629-53.1.noarch.rpm"
RPM_HASH = "7ff29a542980f175158d84e0a8ad22c395e974007ea52e6ab7dccaae6e3e5cb86571dfa2a2e30d37c824e47abce98bf9f7e45aeecbb663e391a25fce6315cdb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asana-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
