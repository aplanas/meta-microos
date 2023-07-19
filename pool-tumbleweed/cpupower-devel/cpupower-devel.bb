SUMMARY = "Include files for libcpupower"
DESCRIPTION = "Include files for C/C++ development with libcpupower."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "cpupower-devel-6.4.3-4.17.aarch64.rpm"
RPM_HASH = "53e3d7cc83d16f4c19dce0e185845d92365ad6fd637c13f74769f48a109b8cf6630e5607fd5a627104848ebddccfb53d0eb93017752c795445c5834aba7f383f"

RPROVIDES:${PN} += "cpupower-devel"

RDEPENDS:${PN} += "libcpupower0"

inherit rpm
