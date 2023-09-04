SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.5"

RPM_NAME = "python310-numexpr-2.8.5-1.1.aarch64.rpm"
RPM_HASH = "47f42318c9d8871f494e76d4bd56470a9765e682e53fb0a8d7b302095fd7fe94b16f7b07097e4200224ab50e984aec3dd516fc5c9a502ac260b281702def4174"

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
