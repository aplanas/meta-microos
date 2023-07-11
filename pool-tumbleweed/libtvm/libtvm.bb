SUMMARY = "Libraries generated for TVM"
DESCRIPTION = "Libraries generated for TVM without any provided soname."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "libtvm-0.11.0-2.7.aarch64.rpm"
RPM_HASH = "e7bae3c2b62519967c28fe362488bb1e6b04ab4b8c4aba29c054993cbe71ec09e6a2d3e924afb82498f34de5a8b8f0b0239d45751e8868c0ca54ae5d2887d994"

RPROVIDES:${PN} += "libtvm \
libtvm-runtime.so \
libtvm.so \
tvm"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libSPIRV-Tools-2023.3~rc1.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
libvulkan.so.1"

inherit rpm
