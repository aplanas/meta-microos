SUMMARY = "Header files of Intel Math Kernel Library"
DESCRIPTION = "Intel Math Kernel Library for Deep Neural Networks (Intel MKL-DNN) is an \
open-source performance library for deep-learning applications. The library \
accelerates deep-learning applications and frameworks on Intel architecture. \
Intel MKL-DNN contains vectorized and threaded building blocks that you can use \
to implement deep neural networks (DNN) with C and C++ interfaces. \
 \
This package includes the required headers and library files to develop software \
with the Intel MKL-DNN."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "onednn-devel-3.0.1-1.2.aarch64.rpm"
RPM_HASH = "3d958a882cbbda4670c88c0f2011951db3634a966a760d7fd1aeea768fb63047e3105f2dc6b519f438076364e606582545f8e4c7febf33602dbcee069219b993"

RPROVIDES:${PN} += "cmake(dnnl) \
mkl-dnn-devel \
oneDNN-devel \
onednn-devel \
onednn-devel(aarch-64)"
RDEPENDS:${PN} += "libdnnl3"

inherit rpm
