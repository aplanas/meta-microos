SUMMARY = "Documentation for texlive-gfsporson"
DESCRIPTION = "This package includes the documentation for texlive-gfsporson"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn18651"

RPM_NAME = "texlive-gfsporson-doc-2023.201.1.01svn18651-52.1.noarch.rpm"
RPM_HASH = "9631dd4a18826ac8e6266ece53cd9d80ab756621dce94fb0a5427f7b15712a22ad4b8fdf521890f184834a2a54ed485948ca31b1eb216461056bf038aa8da97d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsporson-doc"

RDEPENDS:${PN} += ""

inherit rpm
