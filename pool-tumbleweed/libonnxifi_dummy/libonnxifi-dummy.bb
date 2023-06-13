SUMMARY = "Library for ONNX Interface for Framework Integration"
DESCRIPTION = "This package exists to create libonnx_proto, so you do no want \
to install this package."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libonnxifi_dummy-1.12.0-2.9.aarch64.rpm"
RPM_HASH = "4ae40683451726a65ce46d851f05338ae959b5d61b497697d9fa26701a8135091b2f2658f6be55b0f436212ed78cc4ce1eace8e0b3aabdeaa73677b3c54b90b1"

RPROVIDES:${PN} += "libonnxifi.so()(64bit) \
libonnxifi_dummy \
libonnxifi_dummy(aarch-64) \
libonnxifi_dummy.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
