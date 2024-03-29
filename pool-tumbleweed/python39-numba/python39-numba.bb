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

RPM_NAME = "python39-numba-0.57.1-2.1.aarch64.rpm"
RPM_HASH = "8e4dd4d4f4c761652e0d5d21b849243c4fb54e16e696ad6540f545c826f281c5df70f7f9269471ac822b1343377594c0c9957240317c70729861b194d6ee421f"

RPROVIDES:${PN} += "python3.9dist-numba \
python39-numba \
python3dist-numba"

RDEPENDS:${PN} += "-python39-llvmlite >= 0.40 with python39-llvmlite < 0.41 \
-python39-numpy >= 1.21 with python39-numpy < 1.26 \
/usr/bin/python3.9 \
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
