SUMMARY = "Library implementing the PKCS11 API"
DESCRIPTION = "This component provides the PKCS11 API using the PKCS11 trusted \
application executing in OP-TEE.For a general overview of OP-TEE, the \
Open Platform Trusted Execution Environment, see the Notice.md file."
LICENSE = "BSD-2-Clause"

PV = "3.9.0"

RPM_NAME = "libckteec0-3.9.0-1.12.aarch64.rpm"
RPM_HASH = "621c631fe67d3386aabb7f372108449eb13bec7cf1463ae0b38f5e82bbb3ba6c2d93bdcd85467d4c5832809e7b5ee93d72d8c3ffaa4badfd317744de328885e3"

RPROVIDES:${PN} += "libckteec.so.0 \
libckteec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libteec.so.1"

inherit rpm
