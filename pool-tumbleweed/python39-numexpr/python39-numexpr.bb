SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python39-numexpr-2.8.4-1.7.aarch64.rpm"
RPM_HASH = "dfbc9692a9775796550efaf4f5f9db2be3fe59a4b8a60f702772eea575f7b7c12926f1a5eb4da690eb70c3b5cc2af230fe62e95cf952596cdea74781c91d5876"

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
