SUMMARY = "Examples for the librdmacm library"
DESCRIPTION = "Example test programs for the librdmacm library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "librdmacm-utils-47.0-3.1.aarch64.rpm"
RPM_HASH = "4e01f8e08ab68d06800d644b2526a27761245f7361988629f3cdf79178809478cea4ea3061a429a3172bcec3fff9f1c0f6af210f4770b72be89031b481c0d77b"

RPROVIDES:${PN} += "librdmacm-tools \
librdmacm-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
