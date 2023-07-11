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

RPM_NAME = "tensorflow-lite-devel-2.10.0-2.2.aarch64.rpm"
RPM_HASH = "ca01f5c5e632dbb8d73ec199e56d4ba5e18e86cd797c516bd333f969240a42491d5ebc870fe9b53185b55ed4f9118bb565752cc27808dc85ce1bf8676cecea31"

RPROVIDES:${PN} += "pkgconfig-tensorflow-lite \
pkgconfig-tensorflow2-lite \
tensorflow-lite-devel \
tensorflow2-lite-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
tensorflow-lite"

inherit rpm
