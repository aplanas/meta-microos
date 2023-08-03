SUMMARY = "Tools to determine and set CPU Power related Settings"
DESCRIPTION = "This tool accesses the Linux kernel's processor power subsystems \
like CPU frequency switching (cpufreq) or CPU sleep states (cpuidle)."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "cpupower-6.4.6-4.19.aarch64.rpm"
RPM_HASH = "bfdcab41bd44479bf0cfd70890a2bbc9354198d07ce79b5441570fc0eb589ce9352840cc7fd95e86440f6a74f72d6e7defc1bf27e243d55bb93fe5befd5bf740"

RPROVIDES:${PN} += "cpupower"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0"

inherit rpm
