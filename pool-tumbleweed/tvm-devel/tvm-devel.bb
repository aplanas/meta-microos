SUMMARY = "Headers for the TVM Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators. \
 \
This package contains the headers."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "tvm-devel-0.11.0-2.7.aarch64.rpm"
RPM_HASH = "bd8d6906e06dcbe3f22fc290cb10d912bd87fce4ae9843e025ae45bbbf645b04f49f4188e73432f25d170992c79610624dc182813f777bf06054a0233c35e25f"

RPROVIDES:${PN} += "cmake-tvm \
tvm-devel"

RDEPENDS:${PN} += "libtvm"

inherit rpm
