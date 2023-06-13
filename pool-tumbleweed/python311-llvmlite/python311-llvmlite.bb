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

RPM_NAME = "python311-llvmlite-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "81424220f59d3f47d3b92826334cf118dd05eacc9a12e91f3ece1775e6c1bb97f70d9d9e8e81c867d66d98e135e3185f8b33fd18e43eab19c4c9d2861a31aab9"

RPROVIDES:${PN} += "libllvmlite.so()(64bit) \
python3.11dist(llvmlite) \
python311-llvmlite \
python311-llvmlite(aarch-64) \
python3dist(llvmlite)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.14()(64bit) \
libLLVM.so.14(LLVM_14)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
