SUMMARY = "Documentation for texlive-unamthesis"
DESCRIPTION = "This package includes the documentation for texlive-unamthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn43639"

RPM_NAME = "texlive-unamthesis-doc-2023.201.2.1svn43639-53.1.noarch.rpm"
RPM_HASH = "061a8579c44168c6c869ef3064837ecdb4cfb2b0fdf1b52c2c1ac8832a92b62be8c386976c8ce90bdbf7ed35c7b6afe5f0c750db273849fc97c9fb19fbcd2856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unamthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
