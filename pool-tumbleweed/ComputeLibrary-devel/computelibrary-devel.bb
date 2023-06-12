SUMMARY = "ARM Compute Library -- devel"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Devel part, including headers."
LICENSE = "MIT"

PV = "23.02"

RPM_NAME = "ComputeLibrary-devel-23.02-2.1.aarch64.rpm"
RPM_HASH = "5b14cb75fae76ce8310093dea4e254d6797eff1f1badffda3ebfb2a374d938ac53c1a83dde12b85864345067760565a0d4be7c9b64a6adbfcc214d4ced0b6de6"

RPROVIDES:${PN} += "ComputeLibrary-devel \
ComputeLibrary-devel(aarch-64)"
RDEPENDS:${PN} += "ComputeLibrary \
libarm_compute30 \
libarm_compute_core30 \
libarm_compute_graph30 \
stb-devel"

inherit rpm
