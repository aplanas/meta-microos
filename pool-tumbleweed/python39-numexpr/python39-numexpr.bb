SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python39-numexpr-2.8.4-2.1.aarch64.rpm"
RPM_HASH = "495b8de848461b139defa1a9d9fc71269d66d69c4451b227907b2248042915de191464d6615a91cab8bbd0832f3e53b04b6decfa5a460633795dc577c4befb42"

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
