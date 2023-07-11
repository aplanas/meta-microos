SUMMARY = "Documentation for texlive-pst-vehicle"
DESCRIPTION = "This package includes the documentation for texlive-pst-vehicle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn61438"

RPM_NAME = "texlive-pst-vehicle-doc-2023.201.1.3svn61438-53.2.noarch.rpm"
RPM_HASH = "b4b352c3e31f0bdf8545c3c21260202dff2890e64d036161a741cc925e27e91e993a7723631ee19be4064788268d6d673c83709f4d9f39fe632db5ebda6c789a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-vehicle-doc-fr \
texlive-pst-vehicle-doc"

RDEPENDS:${PN} += ""

inherit rpm
