SUMMARY = "Development headers and libraries for armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the development libraries and headers for armnn."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "armnn-devel-23.05-1.1.aarch64.rpm"
RPM_HASH = "9a9a995e15aeaf2827c8816d01cba3ead3de58fbcaa85e3f70fbf6bc9809a43381b62310580201cd43a055576b706176869e02e3227366bf21bbedef5640d4bd"

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
