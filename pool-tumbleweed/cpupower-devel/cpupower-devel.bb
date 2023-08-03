SUMMARY = "Include files for libcpupower"
DESCRIPTION = "Include files for C/C++ development with libcpupower."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "cpupower-devel-6.4.6-4.19.aarch64.rpm"
RPM_HASH = "6256fe8ab5dd1fc5aab25f325c3e24179b8ca3ce3654b66de43bd311a3bbc98bc67fe559caecf24a16657789e6350bc9968153272402af37adf967c95e61298f"

RPROVIDES:${PN} += "cpupower-devel"

RDEPENDS:${PN} += "libcpupower0"

inherit rpm
