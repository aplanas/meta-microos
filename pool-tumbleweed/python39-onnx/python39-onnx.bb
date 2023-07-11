SUMMARY = "Open Neural Network eXchange"
DESCRIPTION = "Open format to represent deep learning models. With ONNX, AI developers can \
more easily move models between state-of-the-art tools and choose the \
combination that is best for them. ONNX is developed and supported by a \
community of partners."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python39-onnx-1.12.0-2.10.aarch64.rpm"
RPM_HASH = "d59d831c8729ee714672eef337f485ce608e1db6648dbfdffdd38bc35c0495134c7419f5e873d37c16741a946bb252eb7320f0ad982545fbced8816014423db3"

RPROVIDES:${PN} += "python3.9dist-onnx \
python39-onnx \
python39-onnx-devel \
python3dist-onnx"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
