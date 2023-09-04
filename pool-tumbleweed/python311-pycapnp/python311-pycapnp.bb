SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "python311-pycapnp-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "f483e5e6b31f6f17e439c58c2c6d1eeedf2f68997afcb07dd115dc55b564efae87585fcd05bc0e4e91b223bc067cefbef55757c8b1405aa9120e3602f382dac0"

RPROVIDES:${PN} += "python3-pycapnp \
python3.11dist-pycapnp \
python311-pycapnp \
python3dist-pycapnp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcapnp-0.10.4.so \
libcapnp-rpc-0.10.4.so \
libcapnpc-0.10.4.so \
libgcc-s.so.1 \
libkj-0.10.4.so \
libkj-async-0.10.4.so \
libstdc++.so.6 \
python-abi"

inherit rpm
