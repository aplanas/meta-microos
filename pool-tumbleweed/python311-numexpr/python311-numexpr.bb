SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python311-numexpr-2.8.4-1.5.aarch64.rpm"
RPM_HASH = "c2a1d31bea2c16dac7feb12cd0d766635c656e9d2c69f2d4fb036221d4952a8597873a3a41cbbad1eaa8f783ac4761fe3494b5341587992cc4715973889f6559"

RPROVIDES:${PN} += "python3.11dist-numexpr \
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
