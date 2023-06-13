SUMMARY = "Documentation for texlive-pst-light3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-light3d"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12svn15878"

RPM_NAME = "texlive-pst-light3d-doc-2023.201.0.0.12svn15878-52.1.noarch.rpm"
RPM_HASH = "fc87a5346697d70da8f24979050e7fe2c1119fe75930084f4917adbc0e40c8e46583546b297cd2609d1ced6ec5edfa2b42caa1106104eb52a61ffb45ced230eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-light3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
