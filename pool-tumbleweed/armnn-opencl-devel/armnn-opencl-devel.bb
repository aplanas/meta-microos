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

RPM_NAME = "armnn-opencl-devel-23.05-1.1.aarch64.rpm"
RPM_HASH = "3aa7524aedcf7845d91dde75070aca703a633f390a6aa1ca2b8961ab4dceffee099a64cf9376b787af911a16c42d93b89e75d4fcbc9954206fc1fa47abc6258a"

RPROVIDES:${PN} += "armnn-opencl-devel \
cmake-Armnn"

RDEPENDS:${PN} += "armnn-opencl \
libarmnn32-opencl \
libarmnnBasePipeServer32-opencl \
libarmnnSerializer32-opencl \
libarmnnTestUtils2-opencl \
libarmnnTfLiteParser24-opencl \
libtimelineDecoder32-opencl \
libtimelineDecoderJson32-opencl"

inherit rpm
