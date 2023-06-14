SUMMARY = "Development headers and libraries for armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the development libraries and headers for armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "armnn-devel-23.02-2.1.aarch64.rpm"
RPM_HASH = "742be326097e35e6ea86f0e615953f6460822a8375878b2a82d23cd077a0d901843a97af21292bf0115a74433979e54c799963f061e39d66aa632e9291c60973"

RPROVIDES:${PN} += "armnn-devel \
cmake-Armnn"

RDEPENDS:${PN} += "armnn \
libarmnn32 \
libarmnnBasePipeServer32 \
libarmnnSerializer32 \
libarmnnTestUtils2 \
libarmnnTfLiteParser24 \
libtimelineDecoder32 \
libtimelineDecoderJson32"

inherit rpm
