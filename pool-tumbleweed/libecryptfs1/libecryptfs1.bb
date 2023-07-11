SUMMARY = "Shared library for ecryptfs-utils"
DESCRIPTION = "A stacked cryptographic filesystem for Linux."
LICENSE = "GPL-2.0-only"

PV = "111"

RPM_NAME = "libecryptfs1-111-7.5.aarch64.rpm"
RPM_HASH = "e6f2894178e131b8db9133afdf4a634d410462e226ccd7bbf556a4ba7ef4152182d7326f9b02e040087d39827bd099111bd42a24971015cead41bce143779ba1"

RPROVIDES:${PN} += "libecryptfs.so.1 \
libecryptfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
libnss3.so"

inherit rpm
