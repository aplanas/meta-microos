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

RPM_NAME = "onednn-devel-3.0.1-1.3.aarch64.rpm"
RPM_HASH = "85f9c4dff03bb0402c3ee5d6e6b6dc4046b38449cb5f6482a18a6f83add1fba3af228b8febde5350b5ed1ab4d1cb202e22f0e1e8c7fbb76a34f6943c95c983b2"

RPROVIDES:${PN} += "cmake-dnnl \
mkl-dnn-devel \
oneDNN-devel \
onednn-devel"

RDEPENDS:${PN} += "libdnnl3"

inherit rpm
