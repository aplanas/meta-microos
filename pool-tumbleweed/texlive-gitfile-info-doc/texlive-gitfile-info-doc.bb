SUMMARY = "Documentation for texlive-gitfile-info"
DESCRIPTION = "This package includes the documentation for texlive-gitfile-info"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn51928"

RPM_NAME = "texlive-gitfile-info-doc-2023.209.0.0.5svn51928-54.1.noarch.rpm"
RPM_HASH = "050bd0537d96d254376b9cef7d169448194992a48ccc2d3586d9a313c9e8e157cd55d8c714d7deeb0d5674e214961543efa6e420fd3f3b15400238e4f5fcbb79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitfile-info-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
