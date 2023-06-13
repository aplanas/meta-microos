SUMMARY = "A framework used for deep learning for mobile and embedded devices"
DESCRIPTION = "TensorFlow is an end-to-end open source platform for machine learning. \
The Tensorflow Lite package is a fraction the size of the full tensorflow package \
and includes the bare minimum code required to run inferences with TensorFlow Lite \
 — primarily the Interpreter Python class. This small package is for when all you \
want to do is execute .tflite models and avoid wasting disk space with the large \
TensorFlow library."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT & MPL-2.0"

PV = "2.10.0"

RPM_NAME = "tensorflow-lite-2.10.0-1.1.aarch64.rpm"
RPM_HASH = "095e225bad8c6ac3e9b8fcec3214b5285af75524e1a7b06cb06b7c78c2dc51395f86d1dffdb2961b8b9280ad4a1754b87bc4b49e5fc2340845cb1ed663d39bf5"

RPROVIDES:${PN} += "python3-tflite-runtime \
python3-tflite_runtime \
python3.10dist(tflite-runtime) \
python3dist(tflite-runtime) \
tensorflow-lite \
tensorflow-lite(aarch-64) \
tensorflow2-lite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python3-numpy"

inherit rpm
