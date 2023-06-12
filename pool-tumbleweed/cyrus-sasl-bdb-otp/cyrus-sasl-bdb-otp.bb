SUMMARY = "Plugin for the OTP SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-otp-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "6a35f09058c7e40d1f23793fc74974064db784f83295599e8ba80f4667de9de2f8076060000911b9d8202a49871d067ba35caade5c42b71ed06cc31b57a84a95"

RPROVIDES:${PN} += "cyrus-sasl-bdb-otp \
cyrus-sasl-bdb-otp(aarch-64) \
libotp.so.3()(64bit)"
RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
