SUMMARY = "Documentation for texlive-boondox"
DESCRIPTION = "This package includes the documentation for texlive-boondox"
LICENSE = "OFL-1.1"

PV = "2023.209.1.02dsvn54512"

RPM_NAME = "texlive-boondox-doc-2023.209.1.02dsvn54512-53.1.noarch.rpm"
RPM_HASH = "a71ea9e67976ca6abeda3a3a074bd40586d84e4bd6d0f55420c7fa2d290695bfb80f2c9b08e1f895de985081c50fd89fd63101c0376c3d584e2ce9cd6642e462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boondox-doc"

RDEPENDS:${PN} += ""

inherit rpm
