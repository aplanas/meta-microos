SUMMARY = "Documentation for texlive-sphdthesis"
DESCRIPTION = "This package includes the documentation for texlive-sphdthesis"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn34374"

RPM_NAME = "texlive-sphdthesis-doc-2023.201.1.0svn34374-57.1.noarch.rpm"
RPM_HASH = "9df9225cecf220cf2d3bb6ec06498cab79863b73e4bb2c9d8895b859d3cf8ddc4fd1e782a0fe4b749abfb4448714920768cc716d876661c90e7e6e1c95d95d46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sphdthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
