SUMMARY = "Open Neural Network eXchange"
DESCRIPTION = "Open format to represent deep learning models. With ONNX, AI developers can \
more easily move models between state-of-the-art tools and choose the \
combination that is best for them. ONNX is developed and supported by a \
community of partners."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python311-onnx-1.12.0-2.10.aarch64.rpm"
RPM_HASH = "e1f187d01c3d8f0028d861f821b0eb0f945a01e17ed5a4af721ec43c2539c910c721943f1c3229e57aac65f57ea5d7632925ffd8f25795134022cba5d6d278dd"

RPROVIDES:${PN} += "python3-onnx \
python3-onnx-devel \
python3.11dist-onnx \
python311-onnx \
python311-onnx-devel \
python3dist-onnx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libonnx \
libonnx-proto \
libonnxifi-dummy \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
python-abi \
python311-numpy \
python311-protobuf \
python311-typing-extensions \
update-alternatives"

inherit rpm
