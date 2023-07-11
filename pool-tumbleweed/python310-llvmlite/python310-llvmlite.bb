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

RPM_NAME = "python310-llvmlite-0.40.0-1.2.aarch64.rpm"
RPM_HASH = "87b0cef62c0f4ec3ceb49a3345e7f577099a9a60d41d4c288d177776687fe31cc1bd10fc262ebc5d0966f39d64f8b52685258a73cee773adfd2e367d6b8f0fce"

RPROVIDES:${PN} += "libllvmlite.so \
python3.10dist-llvmlite \
python310-llvmlite \
python3dist-llvmlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
