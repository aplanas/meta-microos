SUMMARY = "Documentation for texlive-rjlparshap"
DESCRIPTION = "This package includes the documentation for texlive-rjlparshap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-rjlparshap-doc-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "f5993caa2e6fd80cc7ce67b7232725a81fe5c333a6b86cfd8f093bea3690b5b30a0f30fe4882a3a506dad8b92f647526088d2992a8a6cb23c01d621cd353ec82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rjlparshap-doc"

RDEPENDS:${PN} += ""

inherit rpm
