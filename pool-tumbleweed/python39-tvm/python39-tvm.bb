SUMMARY = "An end-to-end Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python39-tvm-0.11.0-2.6.aarch64.rpm"
RPM_HASH = "a9397b4eb87034daa8f031ca6037dbf673e7dd3b3d201df088c0c9c8d3bf2006ebb0ccc5813a463651f544d128e278359797ac03fd92f76090c61e0f81737535"

RPROVIDES:${PN} += "libtvm.so()(64bit) \
libtvm_runtime.so()(64bit) \
python3.9dist(tvm) \
python39-tvm \
python39-tvm(aarch-64) \
python3dist(tvm)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.14()(64bit) \
libLLVM.so.14(LLVM_14)(64bit) \
libSPIRV-Tools-2023.3~rc1.so()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopenblas.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libvulkan.so.1()(64bit) \
python(abi) \
python39-attrs \
python39-cloudpickle \
python39-decorator \
python39-numpy \
python39-psutil \
python39-synr"

inherit rpm
