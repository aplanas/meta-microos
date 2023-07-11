SUMMARY = "PycURL -- cURL library module"
DESCRIPTION = "This module provides bindings for the cURL library."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.2"

RPM_NAME = "python311-pycurl-7.45.2-4.4.aarch64.rpm"
RPM_HASH = "cba9267d1362b503fc5e195215098b8a3150b8f10f97e5dfab2d1b1b0d16d357f95109eb266d17811ebecc2fbe1733d6ef8a41b3ad7c0beae617c626d5c53766"

RPROVIDES:${PN} += "python3-pycurl \
python3.11dist-pycurl \
python311-pycurl \
python3dist-pycurl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3 \
python-abi"

inherit rpm
