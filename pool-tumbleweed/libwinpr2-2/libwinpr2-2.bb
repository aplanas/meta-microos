SUMMARY = "Windows Portable Runtime"
DESCRIPTION = "WinPR provides API compatibility for applications targeting non-Windows \
environments. When on Windows, the original native API is being used instead of \
the equivalent WinPR implementation, without having to modify the code using it."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "libwinpr2-2-2.10.0-3.2.aarch64.rpm"
RPM_HASH = "f9d35213164f819f5b3005beb3577b18918b917bbc2d121c1281c27f2aeb5ff49731aefb816e2b077e11a4abb58377ab0e26129e41566cfd14124221af4ed727"

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
