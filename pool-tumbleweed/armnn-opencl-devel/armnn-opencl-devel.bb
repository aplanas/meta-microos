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

RPM_NAME = "armnn-opencl-devel-23.08-1.1.aarch64.rpm"
RPM_HASH = "2640f783e539f4410c8c94f347c0984ddf13343f49f9193e701d3b7748f7b1743af11c863d58ca8e65d6a02d080d5ac747451e00961c877b497933528e638bd4"

RPROVIDES:${PN} += "armnn-opencl-devel \
cmake-Armnn"

RDEPENDS:${PN} += "armnn-opencl \
libarmnn33-opencl \
libarmnnBasePipeServer33-opencl \
libarmnnSerializer33-opencl \
libarmnnTestUtils3-opencl \
libarmnnTfLiteParser24-opencl \
libtimelineDecoder33-opencl \
libtimelineDecoderJson33-opencl"

inherit rpm
