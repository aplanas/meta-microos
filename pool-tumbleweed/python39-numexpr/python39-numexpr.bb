SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python39-numexpr-2.8.4-1.5.aarch64.rpm"
RPM_HASH = "6fc3a1141c732b7a7183aaa97944ffdea72e97390df3fb34ee344a17ad082bd7d1aafd33605f1087ad3ad3cbdfeb0f7c7bd64af127dcce2b994666ff7e178e3d"

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
