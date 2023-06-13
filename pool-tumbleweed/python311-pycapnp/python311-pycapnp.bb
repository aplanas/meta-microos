SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python311-pycapnp-1.2.2-1.6.aarch64.rpm"
RPM_HASH = "e982ead90b90a33c4035bd6417009a1b507210c1ff90a1a02569c38c61f4ccca75e4e1ff0bfb059b1762f70271ad2f56f1f3039615a76fa562d339d815232f60"

RPROVIDES:${PN} += "python3.11dist(pycapnp) \
python311-pycapnp \
python311-pycapnp(aarch-64) \
python3dist(pycapnp)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
