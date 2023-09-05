SUMMARY = "Windows Portable Runtime"
DESCRIPTION = "WinPR provides API compatibility for applications targeting non-Windows \
environments. When on Windows, the original native API is being used instead of \
the equivalent WinPR implementation, without having to modify the code using it."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "libwinpr2-2-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "b9714133a72aba7992b1c24beb4f7bdbebeb33e21cfa3124d3bf125dde0267db4511caddfad7e819111a34ae63bb293ec36fd7643d03f641c30b5e4372c9281c"

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
