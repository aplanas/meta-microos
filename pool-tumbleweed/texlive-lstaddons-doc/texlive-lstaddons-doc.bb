SUMMARY = "Documentation for texlive-lstaddons"
DESCRIPTION = "This package includes the documentation for texlive-lstaddons"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn64967"

RPM_NAME = "texlive-lstaddons-doc-2023.201.0.0.1svn64967-52.1.noarch.rpm"
RPM_HASH = "8a099b9977e13866761b142ca73d80b6aaa4a0d4b622cce56d7c12d85901a3d814cc968be2244ab7cc4c1a0ed3767ccffa25d7540bee674a18ddbf302b35f4b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lstaddons-doc"

RDEPENDS:${PN} += ""

inherit rpm
