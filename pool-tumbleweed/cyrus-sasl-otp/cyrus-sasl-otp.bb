SUMMARY = "Plugin for the OTP SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-otp-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "742ceb02a64214f460ddb544c720d85530e19f0f2cf2f1669d6c37a3a5cc17a90ca0d4089fece18155b41579ceb884e2d22098bfd90da89bac31fd17466c3440"

RPROVIDES:${PN} += "cyrus-sasl-otp \
cyrus-sasl-otp(aarch-64) \
libotp.so.3()(64bit)"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
