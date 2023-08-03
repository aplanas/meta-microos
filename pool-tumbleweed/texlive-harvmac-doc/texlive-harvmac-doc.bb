SUMMARY = "Documentation for texlive-harvmac"
DESCRIPTION = "This package includes the documentation for texlive-harvmac"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-harvmac-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "3e6e1995ccb925532851ddc1e61fc5edebf5a53c7e67bf0e504d51014715fd87c3f35750c575af1302d84b9807f983fbe568b0020ac8ce691e3e03255e7c46c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harvmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
