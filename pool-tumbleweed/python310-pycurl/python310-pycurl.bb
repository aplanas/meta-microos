SUMMARY = "PycURL -- cURL library module"
DESCRIPTION = "This module provides bindings for the cURL library."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.2"

RPM_NAME = "python310-pycurl-7.45.2-4.4.aarch64.rpm"
RPM_HASH = "143914ed7fd8ab893a39a8effbee403263340a238b65103ee373c74ca1191139239f0c0528d1684308796964047bce584211f8285185695a684fc00cc63fb048"

RPROVIDES:${PN} += "python3.10dist-pycurl \
python310-pycurl \
python3dist-pycurl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3 \
python-abi"

inherit rpm
