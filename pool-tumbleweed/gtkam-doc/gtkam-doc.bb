SUMMARY = "Documentation for gtkcam"
DESCRIPTION = "Documentation for gtkam."
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "gtkam-doc-1.0-2.27.aarch64.rpm"
RPM_HASH = "d153f6b5ea1e6a5ad5273198ed698ba19487a47cd9ec2ecd27acc0fbf5928d5f00e262b499c10cd1e68daa865a73d25f93f571e16ef7aa3857a3c8149c7bfc6d"

RPROVIDES:${PN} += "gtkam-doc \
gtkam-doc(aarch-64)"

RDEPENDS:${PN} += "gtkam"

inherit rpm
