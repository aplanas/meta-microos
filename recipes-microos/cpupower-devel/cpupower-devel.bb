SUMMARY = "Include files for libcpupower"
DESCRIPTION = "Include files for C/C++ development with libcpupower."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "cpupower-devel-6.3.1-4.10.aarch64.rpm"
RPM_HASH = "bdd51c04677b68d8a97fbc3675499056802a6b37de6c3f54dccbde0b2e7621199d57f575f8e10189b769cedef827e4b613d0730200b8ac01731445aa55df8bfd"

RPROVIDES:${PN} += "cpupower-devel cpupower-devel(aarch-64)"
RDEPENDS:${PN} += "libcpupower0"

inherit rpm
