SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python311-numexpr-2.8.4-1.7.aarch64.rpm"
RPM_HASH = "582f5a36c84015b4677e30b15850e514733eeda2f7645cba33e7a95921a90c7ba240e330e5d6bb16fb12367480953c92ca25153455a3554222c0c97eec57f085"

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
