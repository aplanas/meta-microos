SUMMARY = "Documentation for salt, a parallel remote execution system"
DESCRIPTION = "This contains the documentation of salt, it is an offline version of http://docs.saltstack.com."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-doc-3006.0-1.1.aarch64.rpm"
RPM_HASH = "4149903f15ef690a762a11afbaf0492d4d25440b9a1dc3b221d24191b14199bcd350df7e287e0501638b4d10acc45e48a2b5f8785e39cf3e18f01ea2055f1d66"

RPROVIDES:${PN} += "salt-doc \
salt-doc(aarch-64)"
RDEPENDS:${PN} += "salt"

inherit rpm
