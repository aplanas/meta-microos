SUMMARY = "libarmnnBasePipeServer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnBasePipeServer library from armnn."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "libarmnnBasePipeServer32-23.02-2.1.aarch64.rpm"
RPM_HASH = "7dc326ff34f23c021309a7260b12e7662f8c2b1237307ff854f3ea93ea70c8e69e4925279f7d1ed937cbde8c3e4fe5bbce72646540a492b931387dc5c9763ffa"

RPROVIDES:${PN} += "libarmnnBasePipeServer.so.32 \
libarmnnBasePipeServer32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
