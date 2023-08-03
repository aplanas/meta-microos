SUMMARY = "Documentation for texlive-commedit"
DESCRIPTION = "This package includes the documentation for texlive-commedit"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn50116"

RPM_NAME = "texlive-commedit-doc-2023.209.1.02svn50116-54.1.noarch.rpm"
RPM_HASH = "3ed3d250ab2e2d0f9d2c703705ecc575d4c3e31a063c4b335d533e7996cccb3af5cd7840ef7bb7df81e994802dc5c7e06699ae1c219523de24a00dbdaa913d5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commedit-doc"

RDEPENDS:${PN} += ""

inherit rpm
