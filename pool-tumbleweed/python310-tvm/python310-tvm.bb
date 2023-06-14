SUMMARY = "An end-to-end Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python310-tvm-0.11.0-2.6.aarch64.rpm"
RPM_HASH = "1d61d51b3d990f86762ebee7898eb5405a3e1997f3dc533881d4037c8f63002fe36469748c29c1afb0c8cf7ef48377d95a927a55d8574045cd306702d91bdab7"

RPROVIDES:${PN} += "libtvm-runtime.so \
libtvm.so \
python3-tvm \
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
