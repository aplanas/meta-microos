SUMMARY = "Documentation for OpenStack oslo.rootwrap"
DESCRIPTION = "Documentation for the OpenStack oslo.rootwrap library."
LICENSE = "Apache-2.0"

PV = "7.0.1"

RPM_NAME = "python-oslo.rootwrap-doc-7.0.1-1.3.noarch.rpm"
RPM_HASH = "a0df4fc1d6a324816e8db1fdacee68606288a1eac407ac30a3c1736dde0e7647e72e88de05e9286599264956105fcab86eaab181ce1f5dccd60b57960ab42ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.rootwrap-doc"

RDEPENDS:${PN} += ""

inherit rpm
