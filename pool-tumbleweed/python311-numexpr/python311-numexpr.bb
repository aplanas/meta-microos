SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.5"

RPM_NAME = "python311-numexpr-2.8.5-1.1.aarch64.rpm"
RPM_HASH = "ede71c20d6e3a544ff519eaffff3d0d7d1d8eabcada1cf3a61440ab158e21c173b314e69dda1b84b5f13285708a0a4d9700ee7f7826cdc65e0caddf1e9d2fd46"

RPROVIDES:${PN} += "python3-numexpr \
python3.11dist-numexpr \
python311-numexpr \
python3dist-numexpr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
