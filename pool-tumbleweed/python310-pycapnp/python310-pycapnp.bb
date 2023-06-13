SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python310-pycapnp-1.2.2-1.6.aarch64.rpm"
RPM_HASH = "e160ffd17e4598255a4a6247edd51e5b7f0f0576d6cb417567007181d04d7c66c5a149b522e71e8700470254a6d7dbe7137e133c76637d11fdb58a6395defdfe"

RPROVIDES:${PN} += "python3-pycapnp \
python3.10dist(pycapnp) \
python310-pycapnp \
python310-pycapnp(aarch-64) \
python3dist(pycapnp)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcapnp-0.10.4.so()(64bit) \
libcapnp-rpc-0.10.4.so()(64bit) \
libcapnpc-0.10.4.so()(64bit) \
libgcc_s.so.1()(64bit) \
libkj-0.10.4.so()(64bit) \
libkj-async-0.10.4.so()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
