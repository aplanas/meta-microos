SUMMARY = "Documentation for Scheme48"
DESCRIPTION = "Documentation for Scheme48 VM and interpreter"
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "scheme48-doc-1.9.2-2.18.aarch64.rpm"
RPM_HASH = "36c8cc80738c29e9d48f5231dd84a43136bd7dc51ec1c27a5aa3af004f2dc9cf57c212d310c05da396770c40fa5bbd18c07cea8624f374584d20e8f67e206fb8"

RPROVIDES:${PN} += "scheme48-doc \
scheme48-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
