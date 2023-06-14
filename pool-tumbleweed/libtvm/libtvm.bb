SUMMARY = "Libraries generated for TVM"
DESCRIPTION = "Libraries generated for TVM without any provided soname."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "libtvm-0.11.0-2.6.aarch64.rpm"
RPM_HASH = "8f1f54c5fce599bb61531cb660c28c538fe18d519bfc63881e7e966dbaf9d03f9bc73971b782eba8224368c60b0e8436b0a6d740c9bd0a445f50f04c240a856e"

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
