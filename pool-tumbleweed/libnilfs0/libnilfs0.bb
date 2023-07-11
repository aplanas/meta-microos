SUMMARY = "Library for interacting with nilfs"
DESCRIPTION = "This package contains shared library needed for some applications to \
interface with nilfs"
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "libnilfs0-2.2.9-1.5.aarch64.rpm"
RPM_HASH = "8f869d323d92791eaa8d58fc9b274c495fbe242d67f51ddf2b8b1cb37f8a050eb58e772ea77890adce2f5f0e53691aa877aee21bbe3ea4d7b38f3a2a8968bd95"

RPROVIDES:${PN} += "libnilfs.so.0 \
libnilfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
