SUMMARY = "GuardTime KSI API"
DESCRIPTION = "LibKSI - Keyless Signature Infrastructure GuardTime client library"
LICENSE = "Apache-2.0"

PV = "3.4.0.5"

RPM_NAME = "libksi1-3.4.0.5-3.25.aarch64.rpm"
RPM_HASH = "1be5c895b70b5f196ec3a434533136f58d0a157c3c49d8b8df89f2ae4f4c6113d561b76e36c400777cdaab0dc6dc97f92dfda9f9287e2b83cb94e9f43020ce96"

RPROVIDES:${PN} += "libksi.so.1 \
libksi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4"

inherit rpm
