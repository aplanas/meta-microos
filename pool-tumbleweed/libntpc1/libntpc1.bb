SUMMARY = "Shared library for NTP client applications"
DESCRIPTION = "This package provides the shared library for ntp clients."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "libntpc1-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "a12cb3b483bd42c0e5eb2e08dcca0855a46ed2b9f2b7cd095d4a1ad7aa44e67cb6a19b399e3e0a0c77b2251e4ac83f40583d78524bb35046a0f1facbae28a8b1"

RPROVIDES:${PN} += "libntpc.so.1 \
libntpc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6"

inherit rpm
