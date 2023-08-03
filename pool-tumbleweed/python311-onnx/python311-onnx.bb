SUMMARY = "Open Neural Network eXchange"
DESCRIPTION = "Open format to represent deep learning models. With ONNX, AI developers can \
more easily move models between state-of-the-art tools and choose the \
combination that is best for them. ONNX is developed and supported by a \
community of partners."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python311-onnx-1.12.0-3.1.aarch64.rpm"
RPM_HASH = "33f934e88904fc2da265245026dd23b3caed7648f27109c4ddc1589a8716bd73c8e64d485fba6fadb377f612970e5720d1886dd2eebbc229858455140577b441"

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
