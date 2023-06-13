SUMMARY = "Documentation for texlive-arimo"
DESCRIPTION = "This package includes the documentation for texlive-arimo"
LICENSE = "Apache-1.0"

PV = "2023.201.svn64548"

RPM_NAME = "texlive-arimo-doc-2023.201.svn64548-54.1.noarch.rpm"
RPM_HASH = "8d0448ccd7deff1f2806cca8c7f724aaa07781f465c253c819879bddcd79f6b9160ee60b8bdfd90133b221453181635cd8a972601ddb1227812166be24211d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arimo-doc"

RDEPENDS:${PN} += ""

inherit rpm
