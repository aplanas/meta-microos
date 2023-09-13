SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python310-numexpr-2.8.4-2.1.aarch64.rpm"
RPM_HASH = "d8a9d28ace320422e5c9cf168db22512d92791eda88b144ab2cf358453cf023bbe08d5201954c1e8bede0535ad53f7733aa2199aaaacff7297cd9a84ab993b9c"

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
