SUMMARY = "ARM Compute Library -- devel"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Devel part, including headers."
LICENSE = "MIT"

PV = "23.08"

RPM_NAME = "ComputeLibrary-devel-23.08-1.1.aarch64.rpm"
RPM_HASH = "6b93f45b28ef84652fcfc402d904888b8ac79976a618fcc157d8855e4c5e497a1428951ed2ca40a5dd65ef35a4e4167ab05dad99d8bc54b88ecba09e4c7eed5e"

RPROVIDES:${PN} += "ComputeLibrary-devel"

RDEPENDS:${PN} += "ComputeLibrary \
libarm-compute-core32 \
libarm-compute-graph32 \
libarm-compute32 \
stb-devel"

inherit rpm
