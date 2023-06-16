SUMMARY = "Mock hardware devices for creating unit tests and bug reporting"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. It also provides tools to record the properties \
and behaviour of particular devices, and to run a program or test suite under a \
test bed with the previously recorded devices loaded."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.17"

RPM_NAME = "umockdev-0.17.17-1.1.aarch64.rpm"
RPM_HASH = "3b8f8b30a9e90492cb7e8e6ec0a94adcd6951ff4ab87c468d8f8f58ba079a02af6a8d9c5d4b4dc8b51d7fa8569e3533f791bfa3dc23ce5bdd7a353d1dbb70ba2"

RPROVIDES:${PN} += "umockdev"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpcap.so.1 \
libumockdev.so.0"

inherit rpm
