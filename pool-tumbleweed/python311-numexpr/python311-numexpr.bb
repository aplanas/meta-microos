SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python311-numexpr-2.8.4-2.1.aarch64.rpm"
RPM_HASH = "0d52343826afb58b710201688bffd62f36d5732e3a11941cb460ebc815cd27baca22a3b50712716dde0e161953ef969f5a3303df846adb00b2e1e275ae34d726"

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
