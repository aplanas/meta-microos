SUMMARY = "IBM's TPM 2.0 TSS headers"
DESCRIPTION = "Includes IBM's TPM 2.0 TSS C header files"
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ibmtss-devel-1.6.0-4.4.aarch64.rpm"
RPM_HASH = "17be1a4d402cc8a1ed691ca0b30263fbb0e1a6024f8a37f3c210966827efaa8478c7dbc26a0bce6baa882d1af151896c388eda879e6afabfa1a0b13fdbb93a66"

RPROVIDES:${PN} += "ibmtss-devel \
ibmtss-devel(aarch-64)"

RDEPENDS:${PN} += "ibmtss \
libibmtss1"

inherit rpm
