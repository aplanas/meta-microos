SUMMARY = "Examples for the librdmacm library"
DESCRIPTION = "Example test programs for the librdmacm library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "librdmacm-utils-47.0-2.2.aarch64.rpm"
RPM_HASH = "94305d8d441a5c69066a4f1f39317804614b04581e971e1ec32fae3d0f1baedbc35094532d946e403ab79e583cf90b7de610d2b2d08ec9a28a57cc87f77022ad"

RPROVIDES:${PN} += "librdmacm-tools \
librdmacm-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
