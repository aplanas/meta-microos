SUMMARY = "Mock hardware devices for creating unit tests and bug reporting"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. It also provides tools to record the properties \
and behaviour of particular devices, and to run a program or test suite under a \
test bed with the previously recorded devices loaded."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.17"

RPM_NAME = "umockdev-0.17.17-1.2.aarch64.rpm"
RPM_HASH = "42d093a5aa0d85e99afe603518150eb2521855d37fe00f8d704599736a21061fae5db9bddc476971f302c5e322bde87c63e1431bbf36c543357598a60bb782c4"

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
