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

PV = "0.57.0"

RPM_NAME = "python310-numba-0.57.0-1.1.aarch64.rpm"
RPM_HASH = "dcba5206d30dffdba6cf6c253a7fb5628eba2583b061fb6bfa01996bbd80663eba100b92653cb2028cb30f7771547874963870a842f2c0ac5b8b6c7ca7c890fa"

RPROVIDES:${PN} += "python3-numba \
python3.10dist-numba \
python310-numba \
python3dist-numba"

RDEPENDS:${PN} += "-python310-llvmlite >= 0.40 with python310-llvmlite < 0.41 \
-python310-numpy >= 1.21 with python310-numpy < 1.25 \
/bin/sh \
/usr/bin/python3.10 \
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
