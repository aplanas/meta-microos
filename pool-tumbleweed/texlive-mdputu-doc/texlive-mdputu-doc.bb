SUMMARY = "Documentation for texlive-mdputu"
DESCRIPTION = "This package includes the documentation for texlive-mdputu"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn20298"

RPM_NAME = "texlive-mdputu-doc-2023.201.1.2svn20298-52.1.noarch.rpm"
RPM_HASH = "ecebe67e4de954402408e9315b3f2745e48439a5a53116139f35c796c7c24b8797b2939d61f9c8738236b03e82e7929057ef43bb0e7bb26f3f21003aec546b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdputu-doc"

RDEPENDS:${PN} += ""

inherit rpm
