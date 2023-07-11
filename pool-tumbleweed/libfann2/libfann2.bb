SUMMARY = "Fast artificial neural network library"
DESCRIPTION = "FANN is a neural network library which implements multilayer \
artificial neural networks in C with support for both fully connected \
and sparsely connected networks. Execution in both fixed and floating \
point are supported. It includes a framework for easy handling of \
training data sets."
LICENSE = "LGPL-2.1+"

PV = "2.2.0"

RPM_NAME = "libfann2-2.2.0-2.26.aarch64.rpm"
RPM_HASH = "829b476655e7ba46d4fd6dfec62cf64a701624f4e5e84daebea46f2b1204c8494fd64e4f97cdb4c9bfe4f09aba3546455a12a73270cbfd8d5e0bec9ab5a63ca2"

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
