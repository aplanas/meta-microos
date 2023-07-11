SUMMARY = "An end-to-end Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python310-tvm-0.11.0-2.7.aarch64.rpm"
RPM_HASH = "3eb67e23d69803b366a8866f933a0ef1c340cfd5cc64b967cdb8d9660491654f26cc79036915677f94ea0c6d2f6841ba30bd1cb566d277b5cfbf7f853eacb375"

RPROVIDES:${PN} += "libtvm-runtime.so \
libtvm.so \
python3.10dist-tvm \
python310-tvm \
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
python310-attrs \
python310-cloudpickle \
python310-decorator \
python310-numpy \
python310-psutil \
python310-synr"

inherit rpm
