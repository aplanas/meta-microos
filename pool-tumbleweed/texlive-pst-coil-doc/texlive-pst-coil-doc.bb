SUMMARY = "Documentation for texlive-pst-coil"
DESCRIPTION = "This package includes the documentation for texlive-pst-coil"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.07svn62977"

RPM_NAME = "texlive-pst-coil-doc-2023.201.1.07svn62977-52.1.noarch.rpm"
RPM_HASH = "6154fc5a8e37ab0aa1a1f5f439fc3ee12f36b0df2caa2b981af76c893a8c1ae36f80ff7984b40392bb8dc6a54b6666e6103c6d3f1032e832bc7e2191bd173187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-coil-doc"

RDEPENDS:${PN} += ""

inherit rpm
