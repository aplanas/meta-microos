SUMMARY = "Open Neural Network eXchange"
DESCRIPTION = "Open format to represent deep learning models. With ONNX, AI developers can \
more easily move models between state-of-the-art tools and choose the \
combination that is best for them. ONNX is developed and supported by a \
community of partners."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python39-onnx-1.12.0-2.9.aarch64.rpm"
RPM_HASH = "63bf6e30cd15d6ad167c9f6275f200e19c6449554baf8571ed958929359363b899a2c44287bf96abe57e37cdd6ca3215be070e7ebe1ea2870748b9556a0324ee"

RPROVIDES:${PN} += "python3.9dist-onnx \
python39-onnx \
python39-onnx-devel \
python3dist-onnx"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
libc.so.6 \
libgcc-s.so.1 \
libonnx \
libonnx-proto \
libonnxifi-dummy \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
python-abi \
python39-numpy \
python39-protobuf \
python39-typing-extensions \
update-alternatives"

inherit rpm
