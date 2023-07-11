SUMMARY = "Portable Computing Language - an OpenCL implementation"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
pocl uses Clang as an OpenCL C frontend and LLVM for the kernel compiler \
implementation, and as a portability layer. If your desired target has an LLVM \
backend, it should be possible to get OpenCL support by using pocl. \
 \
pocl yields improved performance portability by using a kernel compiler that \
can generate multi-work-item work-group functions that exploit various types of \
parallel hardware resources, such as VLIW, superscalar, SIMD, SIMT, multicore \
and multithread."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "pocl-3.1-3.2.aarch64.rpm"
RPM_HASH = "0172a24283b53a86190907316c9e867e287112ae58d7e75ee8afefe3529af9f37759f98cf8cc36b527af8f99df1a18e55b91caf71eefa229d38d840cdeb0f39b"

RPROVIDES:${PN} += "libpocl-devices-basic.so \
libpocl-devices-pthread.so \
pocl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libpocl.so.2"

inherit rpm
