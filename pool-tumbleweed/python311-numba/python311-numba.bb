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

RPM_NAME = "python311-numba-0.57.0-1.1.aarch64.rpm"
RPM_HASH = "532d4299e8e35eb3ebe95335a9c477df600fb6fc684cabd9daa0b33ea4402bb84a684a82dc63fd7498ee531b5242484d295e726fb11cafb3eed8d61ea18f65b6"

RPROVIDES:${PN} += "python3.11dist-numba \
python311-numba \
python3dist-numba"

RDEPENDS:${PN} += "-python311-llvmlite >= 0.40 with python311-llvmlite < 0.41 \
-python311-numpy >= 1.21 with python311-numpy < 1.25 \
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
