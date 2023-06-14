SUMMARY = "An end-to-end Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python311-tvm-0.11.0-2.6.aarch64.rpm"
RPM_HASH = "a8dcff95fde42bf4753b292c4d73d419056acd2ee71ae0cfcb6910b06d0039f170b7d7c0dd968c33e824142aceaee4a2f8210ed273492a2f550847d668275efe"

RPROVIDES:${PN} += "libtvm-runtime.so \
libtvm.so \
python3.11dist-tvm \
python311-tvm \
python3dist-tvm"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libSPIRV-Tools-2023.3~rc1.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
libvulkan.so.1 \
python-abi \
python311-attrs \
python311-cloudpickle \
python311-decorator \
python311-numpy \
python311-psutil \
python311-synr"

inherit rpm
