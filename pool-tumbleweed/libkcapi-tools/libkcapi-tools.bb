SUMMARY = "Linux Kernel Crypto API User Space Tools"
DESCRIPTION = "libkcapi user space tools to access certain hash algorithms."
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "libkcapi-tools-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "5fd462d029ce7a87057d6743208dac5cf627f515964aa3e7ac2a4cc65433df6a5c2afa92b0084e3c1e5d977a6144a5c6f7608edc1f14b40c891404a48d64a84d"

RPROVIDES:${PN} += "libkcapi-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkcapi.so.1"

inherit rpm
