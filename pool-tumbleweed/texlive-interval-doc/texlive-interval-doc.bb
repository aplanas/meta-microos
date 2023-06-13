SUMMARY = "Documentation for texlive-interval"
DESCRIPTION = "This package includes the documentation for texlive-interval"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn50265"

RPM_NAME = "texlive-interval-doc-2023.201.0.0.4svn50265-52.1.noarch.rpm"
RPM_HASH = "bb9d54aad4c8d2c0295c14522d163678cff7e40f11616ef882413ac409123b3032df069e11d19f084246ad01729316f1097bd724c6c959bc6680ba427b861cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interval-doc"

RDEPENDS:${PN} += ""

inherit rpm
