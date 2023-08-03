SUMMARY = "Library for ONNX Interface for Framework Integration"
DESCRIPTION = "This package exists to create libonnx_proto, so you do no want \
to install this package."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libonnxifi_dummy-1.12.0-3.1.aarch64.rpm"
RPM_HASH = "e486aa17d8efe5f13a3f6df13bade87d7210dce8f90980207c2d6500596cbf153ecaad840bc8d5a9439d492d0b1c28a4e550e20a6fde48fa38b81a9b9f7b7742"

RPROVIDES:${PN} += "libonnxifi-dummy \
libonnxifi-dummy.so \
libonnxifi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
