SUMMARY = "Windows Portable Runtime"
DESCRIPTION = "WinPR provides API compatibility for applications targeting non-Windows \
environments. When on Windows, the original native API is being used instead of \
the equivalent WinPR implementation, without having to modify the code using it."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "libwinpr2-2-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "fb5399eb7d89ead5673894dd6cdc5583ce88dd1257becd176754d68f5e853481d25c6bf974811d724d4ff454bb5c751a5c190b496e58a5c9f51b99c982fd9dc1"

RPROVIDES:${PN} += "libwinpr-tools2.so.2 \
libwinpr2 \
libwinpr2-2 \
libwinpr2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libicuuc.so.73 \
libm.so.6 \
libssl.so.3 \
libsystemd.so.0"

inherit rpm
