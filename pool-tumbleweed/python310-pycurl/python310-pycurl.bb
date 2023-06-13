SUMMARY = "PycURL -- cURL library module"
DESCRIPTION = "This module provides bindings for the cURL library."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.2"

RPM_NAME = "python310-pycurl-7.45.2-4.1.aarch64.rpm"
RPM_HASH = "82916f53134a32ba372aafee50b54d7d8159e32a2c44a09bbb1989f0aefd6f646f1867aede214313deea85a4b0129834cd673ad1b4ab2ae6597caa4348fee49b"

RPROVIDES:${PN} += "python3-pycurl \
python3.10dist(pycurl) \
python310-pycurl \
python310-pycurl(aarch-64) \
python3dist(pycurl)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libssl.so.3()(64bit) \
python(abi)"

inherit rpm
