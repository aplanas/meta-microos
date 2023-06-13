SUMMARY = "Open Neural Network eXchange"
DESCRIPTION = "Open format to represent deep learning models. With ONNX, AI developers can \
more easily move models between state-of-the-art tools and choose the \
combination that is best for them. ONNX is developed and supported by a \
community of partners."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python311-onnx-1.12.0-2.9.aarch64.rpm"
RPM_HASH = "22a83ee39ad68a260f0d0fc99e300272c658e8d1b5279d620598d3e50a479303798f737312b005e6bd2e78581966540db67cd7334a7963bf285dfee31bfd38f2"

RPROVIDES:${PN} += "python3.11dist(onnx) \
python311-onnx \
python311-onnx(aarch-64) \
python311-onnx-devel \
python3dist(onnx)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libonnx \
libonnx_proto \
libonnxifi_dummy \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-numpy \
python311-protobuf \
python311-typing_extensions \
update-alternatives"

inherit rpm
