SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python310-numexpr-2.8.4-1.5.aarch64.rpm"
RPM_HASH = "ca6c757ee29dae96d3f28bf70096cf625df1420281b6af75b08edbb23ecdf73e3d065fb6ac7e4b9c44b2c478308a04aca4136bf96a47411ab32289610cda89fb"

RPROVIDES:${PN} += "python3-numexpr \
python3.10dist-numexpr \
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
