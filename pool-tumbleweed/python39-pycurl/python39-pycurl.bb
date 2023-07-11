SUMMARY = "PycURL -- cURL library module"
DESCRIPTION = "This module provides bindings for the cURL library."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.2"

RPM_NAME = "python39-pycurl-7.45.2-4.4.aarch64.rpm"
RPM_HASH = "fe9c0cb80b24f27fd990fdd3764699cb24786eb8923ef776d45262bab82a0395520865de9d23a460990c94abc81f838f7dbdab9cdf8532cbe84c27e632237ca0"

RPROVIDES:${PN} += "python3.9dist-pycurl \
python39-pycurl \
python3dist-pycurl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3 \
python-abi"

inherit rpm
