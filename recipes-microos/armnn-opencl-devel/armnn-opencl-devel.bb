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

RPM_NAME = "armnn-opencl-devel-23.02-2.1.aarch64.rpm"
RPM_HASH = "f8ed2b9d658c56068c1ae4082053ac541ad0f05ef9be555e166fc16c793636d6ab9b3568d76ef98c125dfb683a3b9aa622d209ada2c705c1292cf267eff55194"

RPROVIDES:${PN} += "armnn-opencl-devel \
armnn-opencl-devel(aarch-64) \
cmake(Armnn)"
RDEPENDS:${PN} += "armnn-opencl \
libarmnn32-opencl \
libarmnnBasePipeServer32-opencl \
libarmnnSerializer32-opencl \
libarmnnTestUtils2-opencl \
libarmnnTfLiteParser24-opencl \
libtimelineDecoder32-opencl \
libtimelineDecoderJson32-opencl"

inherit rpm
