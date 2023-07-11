SUMMARY = "Open Neural Network eXchange"
DESCRIPTION = "Open format to represent deep learning models. With ONNX, AI developers can \
more easily move models between state-of-the-art tools and choose the \
combination that is best for them. ONNX is developed and supported by a \
community of partners."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python310-onnx-1.12.0-2.10.aarch64.rpm"
RPM_HASH = "925bbe72ac49003d97027eb1b41ae734ec6b4f14d212f499a9f100834c43010062c2ed0b22945882043a9d962abe28f8f8d105a023741af1626da1dc6a379eb9"

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
