SUMMARY = "Documentation for texlive-underoverlap"
DESCRIPTION = "This package includes the documentation for texlive-underoverlap"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1_r1svn29019"

RPM_NAME = "texlive-underoverlap-doc-2023.201.0.0.0.1_r1svn29019-53.1.noarch.rpm"
RPM_HASH = "130b2bf0b6b028f3db3655a071e3bb3c161280f54c9e88e5783bd23dbbc7153195d7723346170e80f2331ff472ca084756f3aead8396594969d1c7b8c3da407c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-underoverlap-doc"

RDEPENDS:${PN} += ""

inherit rpm
