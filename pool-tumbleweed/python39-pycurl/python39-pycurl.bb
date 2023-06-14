SUMMARY = "PycURL -- cURL library module"
DESCRIPTION = "This module provides bindings for the cURL library."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.2"

RPM_NAME = "python39-pycurl-7.45.2-4.1.aarch64.rpm"
RPM_HASH = "b5f23835eb71a6d9f58e0e7b2fb3bd04abfdfb15270c96fc0d48ca0ee11e02cb6ccd29f0e0e6f81a787e7f69ec5830b9a9fb57d0ca7566264d054ebb2067f8d0"

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
