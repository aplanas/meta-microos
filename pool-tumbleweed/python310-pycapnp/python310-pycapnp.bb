SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python310-pycapnp-1.2.2-1.8.aarch64.rpm"
RPM_HASH = "1924f88991fa38bc676e9f93b0fa9614e37eef0e2e8d11d57864fe5fe5066fbc71b9b6c380e7964d68aab3441326b10099702aa9095f3efaa2f89179a0c112e0"

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
