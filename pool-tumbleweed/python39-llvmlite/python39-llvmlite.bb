SUMMARY = "Lightweight wrapper around basic LLVM functionality"
DESCRIPTION = "A lightweight LLVM python binding for writing JIT compilers \
 \
The old llvmpy  binding exposes a lot of LLVM APIs but the mapping of \
C++-style memory management to Python is error prone. Numba_ and many JIT \
compilers do not need a full LLVM API.  Only the IR builder, optimizer, \
and JIT compiler APIs are necessary. \
 \
llvmlite is a project originally tailored for Numba's needs, using the \
following approach: \
 \
* A small C wrapper around the parts of the LLVM C++ API we need that are \
  not already exposed by the LLVM C API. \
* A ctypes Python wrapper around the C API. \
* A pure Python implementation of the subset of the LLVM IR builder that we \
  need for Numba."
LICENSE = "BSD-2-Clause"

PV = "0.40.0"

RPM_NAME = "python39-llvmlite-0.40.0-1.2.aarch64.rpm"
RPM_HASH = "0bca6ebcc79a07f515e9a2147dc07a33c783520b33b52d9508d14e9b3200dc3018569710c039dd41b4edf2f32ad3b51a6cbe330d75315df2638452eb0da20ac3"

RPROVIDES:${PN} += "libllvmlite.so \
python3.9dist-llvmlite \
python39-llvmlite \
python3dist-llvmlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
