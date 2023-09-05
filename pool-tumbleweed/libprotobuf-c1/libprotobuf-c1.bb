SUMMARY = "C bindings for Google's Protocol Buffers"
DESCRIPTION = "This package provides a code generator and runtime libraries to use Protocol \
Buffers from pure C (not C++)."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "libprotobuf-c1-1.4.1-6.1.aarch64.rpm"
RPM_HASH = "cd2fa3182597f64755897961a92205d9940ad71cdeef089bae35b32d169d4480fe2cab74c0c4cb54697de8373cb455ca911bebaabb94d0c1c4571d98ab6fd3c2"

RPROVIDES:${PN} += "libprotobuf-c.so.1 \
libprotobuf-c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
