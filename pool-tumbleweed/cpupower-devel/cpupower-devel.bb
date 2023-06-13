SUMMARY = "Include files for libcpupower"
DESCRIPTION = "Include files for C/C++ development with libcpupower."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "cpupower-devel-6.3.4-4.12.aarch64.rpm"
RPM_HASH = "2ef9b8d1d7afe78d8ad3f9227da486b58d8b07341f45136f564af2b518e87b0c64820211bb0cd2aaa98d6721c00cd569ba304e0fc70f04099972541517ee3f4c"

RPROVIDES:${PN} += "cpupower-devel \
cpupower-devel(aarch-64)"

RDEPENDS:${PN} += "libcpupower0"

inherit rpm
