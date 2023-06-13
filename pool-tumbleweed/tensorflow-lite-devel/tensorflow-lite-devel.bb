SUMMARY = "Header files of tensorflow"
DESCRIPTION = "TensorFlow is an end-to-end open source platform for machine learning. \
The Tensorflow Lite package is a fraction the size of the full tensorflow package \
and includes the bare minimum code required to run inferences with TensorFlow Lite \
 — primarily the Interpreter Python class. This small package is for when all you \
want to do is execute .tflite models and avoid wasting disk space with the large \
TensorFlow library. \
 \
This package provides necessary headers for the C/C++ Api using TensorFlow Lite. \
As well as the static libtensorflow-lite.a for use in your own projects without the \
Python interpreter."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT & MPL-2.0"

PV = "2.10.0"

RPM_NAME = "tensorflow-lite-devel-2.10.0-1.1.aarch64.rpm"
RPM_HASH = "15220eb5c98ecbd28e6dbfdcbf87edfff2d914793e04492359e3f166dc14239bc80c05aa7cc6aee4644fe6c20fd542767d5f74f53f66f5b9daf5018b73e1220e"

RPROVIDES:${PN} += "pkgconfig(tensorflow-lite) \
pkgconfig(tensorflow2-lite) \
tensorflow-lite-devel \
tensorflow-lite-devel(aarch-64) \
tensorflow2-lite-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
tensorflow-lite"

inherit rpm
