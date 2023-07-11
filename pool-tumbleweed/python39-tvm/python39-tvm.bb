SUMMARY = "An end-to-end Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python39-tvm-0.11.0-2.7.aarch64.rpm"
RPM_HASH = "7da7ec030a059db8846b95855daddf13e7b7fbb3ec240ee9405fe831a0c2f2c2cc8b99cf92329dae75c20853e70fbfbcd1e8cb1e03f13874a937afdc59e2e002"

RPROVIDES:${PN} += "libtvm-runtime.so \
libtvm.so \
python3.9dist-tvm \
python39-tvm \
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
python39-attrs \
python39-cloudpickle \
python39-decorator \
python39-numpy \
python39-psutil \
python39-synr"

inherit rpm
