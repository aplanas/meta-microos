SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "python310-pycapnp-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "8bcfbf09a37c346cab93fe392ae7c33ca7ec11f233dcec2be0365c4020b0b9875f1696ebc12336ed6a43e74f049aa90f09a540fe67609e4ebdb2f230751de4b5"

RPROVIDES:${PN} += "python3.10dist-pycapnp \
python310-pycapnp \
python3dist-pycapnp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
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
