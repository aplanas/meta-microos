SUMMARY = "A framework used for deep learning for mobile and embedded devices"
DESCRIPTION = "TensorFlow is an end-to-end open source platform for machine learning. \
The Tensorflow Lite package is a fraction the size of the full tensorflow package \
and includes the bare minimum code required to run inferences with TensorFlow Lite \
 — primarily the Interpreter Python class. This small package is for when all you \
want to do is execute .tflite models and avoid wasting disk space with the large \
TensorFlow library."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT & MPL-2.0"

PV = "2.10.0"

RPM_NAME = "tensorflow-lite-2.10.0-2.2.aarch64.rpm"
RPM_HASH = "ed535d52f7b4344d24301f239664915e39359e62296c45bf3d2dd2b2d2c4af5872719fbbe45e88deb509a33141a59c186a02d335bff444969daf051236444dd2"

RPROVIDES:${PN} += "python3-tflite-runtime \
python3.11dist-tflite-runtime \
python3dist-tflite-runtime \
tensorflow-lite \
tensorflow2-lite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
python3-numpy"

inherit rpm
