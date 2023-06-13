SUMMARY = "Open Neural Network eXchange"
DESCRIPTION = "Open format to represent deep learning models. With ONNX, AI developers can \
more easily move models between state-of-the-art tools and choose the \
combination that is best for them. ONNX is developed and supported by a \
community of partners."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python310-onnx-1.12.0-2.9.aarch64.rpm"
RPM_HASH = "ffa4562dfaaf0d9c86043f5f4910a0a19f572bac5a502ae68d6e277b7ab27f412fe0e9e1c6f113435e1fa846b61f073a5cf626103643fbf18234c8ba8108a95b"

RPROVIDES:${PN} += "python3-onnx \
python3-onnx-devel \
python3.10dist(onnx) \
python310-onnx \
python310-onnx(aarch-64) \
python310-onnx-devel \
python3dist(onnx)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libonnx \
libonnx_proto \
libonnxifi_dummy \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi) \
python310-numpy \
python310-protobuf \
python310-typing_extensions \
update-alternatives"

inherit rpm
