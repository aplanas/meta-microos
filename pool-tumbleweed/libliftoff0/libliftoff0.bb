SUMMARY = "Lightweight KMS plane library"
DESCRIPTION = "libliftoff offers using KMS planes from userspace. Users create \
'virtual planes' called layers, set KMS properties on them, and \
libliftoff will pick hardware planes for these layers if possible."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "libliftoff0-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "f525d41978f8bccd01f16d971aa9b85c0baa198c54b65cf5ae5d4b3f7ad3ee58cc8b2a6159d98354127209227ee46873aed708f7248e991f0729211886a9ddb0"

RPROVIDES:${PN} += "libliftoff.so.0()(64bit) \
libliftoff0 \
libliftoff0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrm.so.2()(64bit)"

inherit rpm
