SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.5"

RPM_NAME = "python39-numexpr-2.8.5-1.1.aarch64.rpm"
RPM_HASH = "5cc9a4dc5e442a3afce7b284018708d1662de9db5403a98cbf765821df726e3c66456af5c25dad83dd7f3234c2d6b6c169097c550f7eabc741277ff313ffdbdb"

RPROVIDES:${PN} += "python3.9dist-numexpr \
python39-numexpr \
python3dist-numexpr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
