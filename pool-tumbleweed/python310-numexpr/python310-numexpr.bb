SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python310-numexpr-2.8.4-1.7.aarch64.rpm"
RPM_HASH = "ec3128e9886adceee8d2432e02a6585be7714d976dacca26c0af4951920f8198dada27fbef4349f992ce4ce27dfbf4be9cf92b41acddc9c3fd47e91d07f36e2b"

RPROVIDES:${PN} += "python3.10dist-numexpr \
python310-numexpr \
python3dist-numexpr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
