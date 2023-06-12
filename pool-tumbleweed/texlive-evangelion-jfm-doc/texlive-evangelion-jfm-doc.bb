SUMMARY = "Documentation for texlive-evangelion-jfm"
DESCRIPTION = "This package includes the documentation for texlive-evangelion-jfm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0_bsvn65824"

RPM_NAME = "texlive-evangelion-jfm-doc-2023.201.1.0.0_bsvn65824-52.1.noarch.rpm"
RPM_HASH = "d43d61fda54b9af9737e39f9816c2964d83732ddeff2ce0fd81a26c4389213d9e6dec4d5b8e523c2de2ed0a21e1f5bcc4cb8379a19dd5d294cf386d36cc019c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-evangelion-jfm-doc"
RDEPENDS:${PN} += ""

inherit rpm
