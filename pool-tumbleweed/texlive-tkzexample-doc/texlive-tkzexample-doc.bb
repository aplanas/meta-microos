SUMMARY = "Documentation for texlive-tkzexample"
DESCRIPTION = "This package includes the documentation for texlive-tkzexample"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.45csvn63908"

RPM_NAME = "texlive-tkzexample-doc-2023.209.1.45csvn63908-53.1.noarch.rpm"
RPM_HASH = "d519ff0bf3dbb6c384428b3f1cffcf87d945ee103a30494f78f363427ad9d39164fb2c9b44bc69a9f203e10a6fee12f927fad07bd0cceac500607815c27ca69b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkzexample-doc"

RDEPENDS:${PN} += ""

inherit rpm
