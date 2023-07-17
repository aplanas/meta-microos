SUMMARY = "Documentation for qt6-opcua in HTML format"
DESCRIPTION = "This package contains documentation for qt6-opcua in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "de94a076be82f0acbea3536adb9495c014c70369824b51ab7db79d04f55bd216429ea2a641ff123d533d2d4d2d98967f426e962ae7c92436e5aa4f1688d24ebb"

RPROVIDES:${PN} += "qt6-opcua-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
