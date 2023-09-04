SUMMARY = "NumPy-aware optimizing compiler for Python using LLVM"
DESCRIPTION = "Numba is a NumPy-aware optimizing compiler for Python. It uses the \
LLVM compiler infrastructure to compile Python syntax to \
machine code. \
 \
It is aware of NumPy arrays as typed memory regions and so can speed-up \
code using NumPy arrays.  Other, less well-typed code will be translated \
to Python C-API calls, effectively removing the 'interpreter', but not removing \
the dynamic indirection. \
 \
Numba is also not a tracing JIT.  It *compiles* your code before it gets \
run, either using run-time type information or type information you provide \
in the decorator. \
 \
Numba is a mechanism for producing machine code from Python syntax and typed \
data structures such as those that exist in NumPy."
LICENSE = "BSD-2-Clause"

PV = "0.57.1"

RPM_NAME = "python310-numba-0.57.1-2.1.aarch64.rpm"
RPM_HASH = "eda8b303467f51a066104c826ff726d84055461098a542bc9142d4bed6854af09a3eda7d2354549961688ed4b9ba0ab491c3398bee46abd55b4ce8de05363945"

RPROVIDES:${PN} += "python3.10dist-numba \
python310-numba \
python3dist-numba"

RDEPENDS:${PN} += "-python310-llvmlite >= 0.40 with python310-llvmlite < 0.41 \
-python310-numpy >= 1.21 with python310-numpy < 1.26 \
/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12 \
python-abi \
update-alternatives"

inherit rpm
