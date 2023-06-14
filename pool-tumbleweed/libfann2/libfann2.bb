SUMMARY = "Fast artificial neural network library"
DESCRIPTION = "FANN is a neural network library which implements multilayer \
artificial neural networks in C with support for both fully connected \
and sparsely connected networks. Execution in both fixed and floating \
point are supported. It includes a framework for easy handling of \
training data sets."
LICENSE = "LGPL-2.1+"

PV = "2.2.0"

RPM_NAME = "libfann2-2.2.0-2.25.aarch64.rpm"
RPM_HASH = "8fe9ecb51d5c4e8f95121cb4bc63006fce42dab9848528f2152e58dc2dc58762b61c4aeb5b7353a82d3604b632a366730c9a199c998474905c6e0ea3c279fff7"

RPROVIDES:${PN} += "fann \
libdoublefann.so.2 \
libfann.so.2 \
libfann2 \
libfixedfann.so.2 \
libfloatfann.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
