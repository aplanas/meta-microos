SUMMARY = "Include files for libcpupower"
DESCRIPTION = "Include files for C/C++ development with libcpupower."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "cpupower-devel-6.3.9-4.15.aarch64.rpm"
RPM_HASH = "a0d59f14446232ed12fed415cac74d62c119f464f83a3bf43e024a729e8f801c1e17f160349da0ab83848d1f32dea6150ab47906ed8004998a7f67b5b1c82277"

RPROVIDES:${PN} += "cpupower-devel"

RDEPENDS:${PN} += "libcpupower0"

inherit rpm
