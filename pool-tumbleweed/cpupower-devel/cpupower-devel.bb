SUMMARY = "Include files for libcpupower"
DESCRIPTION = "Include files for C/C++ development with libcpupower."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "cpupower-devel-6.4.11-4.22.aarch64.rpm"
RPM_HASH = "42517b333cd3ba344a27e53a3744ca91aae499774209f2dc8e974c687589247a63b791137fb21c4e60d698fd1ae7cbe682b1d19cd4f4e53f6ba5214ad23977fb"

RPROVIDES:${PN} += "cpupower-devel"

RDEPENDS:${PN} += "libcpupower0"

inherit rpm
