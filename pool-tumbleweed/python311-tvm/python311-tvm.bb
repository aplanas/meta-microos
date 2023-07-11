SUMMARY = "An end-to-end Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python311-tvm-0.11.0-2.7.aarch64.rpm"
RPM_HASH = "14eb92611383ec1bbc6518331251838d20f1d49806d8b005234ea59a44a421e2f572c81ae0e48a69bf79fb348228810cbc7a61e40a920634f0ca48277126a47b"

RPROVIDES:${PN} += "libtvm-runtime.so \
libtvm.so \
python3-tvm \
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
