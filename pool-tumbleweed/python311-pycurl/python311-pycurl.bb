SUMMARY = "PycURL -- cURL library module"
DESCRIPTION = "This module provides bindings for the cURL library."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.2"

RPM_NAME = "python311-pycurl-7.45.2-4.1.aarch64.rpm"
RPM_HASH = "cfb239fac577c9337f287876cab6a9ade1b6c6379984a9f8df196366ccdc6430eda29e3fd9f67ef9ec1c4e4541fcae1a0ff359c83a9953cb9287f4e973b3fac2"

RPROVIDES:${PN} += "python3.11dist(pycurl) \
python311-pycurl \
python311-pycurl(aarch-64) \
python3dist(pycurl)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
python(abi)"

inherit rpm
