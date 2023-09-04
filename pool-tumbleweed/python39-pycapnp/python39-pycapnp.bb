SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "python39-pycapnp-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "b3b3edc1d028ce6665ca2cc1717c705b6bb4f33914770b2caa92fcf94fb61fa1c8ccadc799cb427305dc081379fcf67679a74ebd94c131a230e2a326c6620bc1"

RPROVIDES:${PN} += "python3.9dist-pycapnp \
python39-pycapnp \
python3dist-pycapnp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
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
