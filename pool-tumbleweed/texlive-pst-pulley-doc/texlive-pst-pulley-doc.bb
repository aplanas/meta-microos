SUMMARY = "Documentation for texlive-pst-pulley"
DESCRIPTION = "This package includes the documentation for texlive-pst-pulley"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn62977"

RPM_NAME = "texlive-pst-pulley-doc-2023.201.0.0.02svn62977-53.2.noarch.rpm"
RPM_HASH = "5db40e11ffd25f4b8eca08403af36e25b29048f3d476478562a18d1115c898bdaed3857b9dde2ca6c506de4386ca96fe0e9cc549c3cbeec34f22fa263955f82c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-pulley-doc"

RDEPENDS:${PN} += ""

inherit rpm
