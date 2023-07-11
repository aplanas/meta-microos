SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python311-pycapnp-1.2.2-1.8.aarch64.rpm"
RPM_HASH = "afdf06d84035903123234498f721b0554227072fe6b99a6067c31d3200fac5e9465affdb7038bd5004a01e5db3f86d8dcb5360b40f2402cca6cdfdac12029d88"

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
