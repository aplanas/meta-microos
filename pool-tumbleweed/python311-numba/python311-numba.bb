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

RPM_NAME = "python311-numba-0.57.1-2.1.aarch64.rpm"
RPM_HASH = "f62e84933fc3c4afa0aefe97860c5189bea5bb7a1d3591eb71d058cf176f370c8741a9b1d0b240ff7f40f7b8a2dd84155652fc57669850e145a1edc180adf8b2"

RPROVIDES:${PN} += "python3-numba \
python3.11dist-numba \
python311-numba \
python3dist-numba"

RDEPENDS:${PN} += "-python311-llvmlite >= 0.40 with python311-llvmlite < 0.41 \
-python311-numpy >= 1.21 with python311-numpy < 1.26 \
/usr/bin/python3.11 \
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
