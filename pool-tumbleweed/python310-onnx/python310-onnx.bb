SUMMARY = "Open Neural Network eXchange"
DESCRIPTION = "Open format to represent deep learning models. With ONNX, AI developers can \
more easily move models between state-of-the-art tools and choose the \
combination that is best for them. ONNX is developed and supported by a \
community of partners."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python310-onnx-1.12.0-3.1.aarch64.rpm"
RPM_HASH = "136dcc42d058355d2c8db7c706841ed5b895bfc0d3bb8ac82dbfb20681a8ce23a9dbb4f8624c5a3cb3698f63e72f35d7a852af721e4d8d15a9d8d94d98e0ae5a"

RPROVIDES:${PN} += "python3.10dist-onnx \
python310-onnx \
python310-onnx-devel \
python3dist-onnx"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libonnx \
libonnx-proto \
libonnxifi-dummy \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
python-abi \
python310-numpy \
python310-protobuf \
python310-typing-extensions \
update-alternatives"

inherit rpm
