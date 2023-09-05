SUMMARY = "Python Bindings for OpenColorIO"
DESCRIPTION = "This package contains python bindings for OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python3-OpenColorIO-2.1.2-4.1.aarch64.rpm"
RPM_HASH = "7b930d104ee1dafcdc14912090850b8b7176afe2aa8036fcfa25cbaf63cd52f85d15108ae2ad78c295c05472180358a589689e2231de747e8468a58f1b466f28"

RPROVIDES:${PN} += "python-OpenColorIO \
python3-OpenColorIO"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenColorIO.so.2.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
