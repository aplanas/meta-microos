SUMMARY = "Documentation for texlive-vaucanson-g"
DESCRIPTION = "This package includes the documentation for texlive-vaucanson-g"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn15878"

RPM_NAME = "texlive-vaucanson-g-doc-2023.209.0.0.4svn15878-54.1.noarch.rpm"
RPM_HASH = "72da653b63420a3a9efc97e91be76717d89408279511a9e7f4e467f8892eae7dd3037b78983fe359902f8047bc4ab45281068c4f0d4cd73a1d1904980b4eb3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vaucanson-g-doc"

RDEPENDS:${PN} += ""

inherit rpm
