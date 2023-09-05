SUMMARY = "Include files for libcpupower"
DESCRIPTION = "Include files for C/C++ development with libcpupower."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "cpupower-devel-6.4.12-4.23.aarch64.rpm"
RPM_HASH = "ca3fe0960ee4ae6a2423a9fc3e69995eae6d174636692298447a1230b87e245d8f3695933c62f29f0a53d4f88c30c069679e7733407970c20bbdbe39d878c67e"

RPROVIDES:${PN} += "cpupower-devel"

RDEPENDS:${PN} += "libcpupower0"

inherit rpm
