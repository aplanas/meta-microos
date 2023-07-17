SUMMARY = "Include files for libcpupower"
DESCRIPTION = "Include files for C/C++ development with libcpupower."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "cpupower-devel-6.4.2-4.16.aarch64.rpm"
RPM_HASH = "048b21b7b219a3899a0d5e52d261e16788c03b9a9f2534103834a457bbcc03f42f6e63db801f615859aa04dbefe9972790f04cd357a15789c0444887e0144ce3"

RPROVIDES:${PN} += "cpupower-devel"

RDEPENDS:${PN} += "libcpupower0"

inherit rpm
