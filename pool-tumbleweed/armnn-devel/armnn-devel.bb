SUMMARY = "Development headers and libraries for armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the development libraries and headers for armnn."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "armnn-devel-23.08-1.1.aarch64.rpm"
RPM_HASH = "1f0add40791cebb5a7643a5e1c3c38017bb85edc43bb5e6eb528e583c063c2dd71f370c3b9af63efbc3d72b1685d44f625030e03abac23b20fb67f996efd73e8"

RPROVIDES:${PN} += "armnn-devel \
cmake-Armnn"

RDEPENDS:${PN} += "armnn \
libarmnn33 \
libarmnnBasePipeServer33 \
libarmnnSerializer33 \
libarmnnTestUtils3 \
libarmnnTfLiteParser24 \
libtimelineDecoder33 \
libtimelineDecoderJson33"

inherit rpm
