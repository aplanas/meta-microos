SUMMARY = "ARM Compute Library -- devel"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Devel part, including headers."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "ComputeLibrary-devel-23.05-1.2.aarch64.rpm"
RPM_HASH = "297e0380366d5fe565a781cfe553a05413be4aef3bc65a025fc29c08475640074ecf3096572accb924eb3b914170dd67d24c48ff28a0a7328c09d3e45a550d9c"

RPROVIDES:${PN} += "ComputeLibrary-devel"

RDEPENDS:${PN} += "ComputeLibrary \
libarm-compute-core31 \
libarm-compute-graph31 \
libarm-compute31 \
stb-devel"

inherit rpm
