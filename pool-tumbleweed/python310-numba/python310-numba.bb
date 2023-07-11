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

RPM_NAME = "python310-numba-0.57.0-1.3.aarch64.rpm"
RPM_HASH = "2488ece3d5db48b62e84813f89cb92272235dff3678c4bd750b55853c0c5d0736d8a8dd3c7fd64c9f0c2d41e669d8924df68fcb6c178d20c59599d35d0cd6578"

RPROVIDES:${PN} += "python3.10dist-numba \
python310-numba \
python3dist-numba"

RDEPENDS:${PN} += "-python310-llvmlite >= 0.40 with python310-llvmlite < 0.41 \
-python310-numpy >= 1.21 with python310-numpy < 1.25 \
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
