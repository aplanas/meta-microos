SUMMARY = "Documentation for texlive-handin"
DESCRIPTION = "This package includes the documentation for texlive-handin"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn48255"

RPM_NAME = "texlive-handin-doc-2023.201.0.0.1.1svn48255-53.1.noarch.rpm"
RPM_HASH = "8710a8b95eec9ebb26d74b4115cb9a47d3fd903d3d18e845f761f1d28ea72b1ccf942461dfb5cdfc8149197327a73fe7f445f3f81394e5856bab6e28a4501311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handin-doc"

RDEPENDS:${PN} += ""

inherit rpm
