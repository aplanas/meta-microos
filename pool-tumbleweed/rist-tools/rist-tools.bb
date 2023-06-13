SUMMARY = "User tools for librist"
DESCRIPTION = "This package contains the user tools for the RIST protocol library."
LICENSE = "BSD-2-Clause"

PV = "0.2.7"

RPM_NAME = "rist-tools-0.2.7-2.3.aarch64.rpm"
RPM_HASH = "fd4647ed3c79990ed0c0ae61ca4310194ee6d05e8c785ee777d0ad49afa8a8b1c450fb053934f7b8a09fab6fd75df21ff3bc87aa5bf5e9283c5fc64da7e5f81b"

RPROVIDES:${PN} += "rist-tools \
rist-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
librist.so.4()(64bit)"

inherit rpm
