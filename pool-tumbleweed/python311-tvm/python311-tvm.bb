SUMMARY = "An end-to-end Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python311-tvm-0.11.0-2.6.aarch64.rpm"
RPM_HASH = "a8dcff95fde42bf4753b292c4d73d419056acd2ee71ae0cfcb6910b06d0039f170b7d7c0dd968c33e824142aceaee4a2f8210ed273492a2f550847d668275efe"

RPROVIDES:${PN} += "libtvm.so()(64bit) \
libtvm_runtime.so()(64bit) \
python3.11dist(tvm) \
python311-tvm \
python311-tvm(aarch-64) \
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
python311-attrs \
python311-cloudpickle \
python311-decorator \
python311-numpy \
python311-psutil \
python311-synr"

inherit rpm
