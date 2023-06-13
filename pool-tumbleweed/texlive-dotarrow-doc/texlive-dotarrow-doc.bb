SUMMARY = "Documentation for texlive-dotarrow"
DESCRIPTION = "This package includes the documentation for texlive-dotarrow"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01asvn15878"

RPM_NAME = "texlive-dotarrow-doc-2023.201.0.0.01asvn15878-52.1.noarch.rpm"
RPM_HASH = "07c0d78a7be84d823e1adf6b4f4b8bc7e0d112225441fa326c0ec1af3eea4a297b1d117e8506caa44bf8838cbe91eee322f941011de31ac6e936765ae956b0ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dotarrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
