SUMMARY = "Shared library for libnitrokey"
DESCRIPTION = "Libnitrokey is a project to communicate with Nitrokey Pro and Storage devices \
in a clean and easy manner. \
 \
This package holds the shared library."
LICENSE = "LGPL-3.0-only"

PV = "3.8"

RPM_NAME = "libnitrokey3-3.8-1.3.aarch64.rpm"
RPM_HASH = "f77e046897bd265fd6fe6c1965d7977e388648f58d86be7952b2dbcba84065d20882afe5b42783e2d7cb6281bbc6b94b6c26772bbe4df850254afd2c30f6e8fe"

RPROVIDES:${PN} += "libnitrokey.so.3 \
libnitrokey3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhidapi-libusb.so.0 \
libnitrokey-udev \
libstdc++.so.6"

inherit rpm
