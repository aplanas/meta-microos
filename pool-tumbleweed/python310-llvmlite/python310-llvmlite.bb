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

RPM_NAME = "python310-llvmlite-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "a2a5e387d485dbb9694b6b1a45994a116a886707e70657f3b7faac44c291d40d10471929401b1de1ac570551441e8c7bcb9af80736ecaa7374baebeed36c10c6"

RPROVIDES:${PN} += "libllvmlite.so()(64bit) \
python3-llvmlite \
python3.10dist(llvmlite) \
python310-llvmlite \
python310-llvmlite(aarch-64) \
python3dist(llvmlite)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.14()(64bit) \
libLLVM.so.14(LLVM_14)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
