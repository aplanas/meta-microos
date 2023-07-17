SUMMARY = "Tools to determine and set CPU Power related Settings"
DESCRIPTION = "This tool accesses the Linux kernel's processor power subsystems \
like CPU frequency switching (cpufreq) or CPU sleep states (cpuidle)."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "cpupower-6.4.2-4.16.aarch64.rpm"
RPM_HASH = "3da9ccebf6be9ccd3d69d8cefe0a0fbba333148e51156dee45eea6757cb116f395afa34ce362d45c09ff8186b7f093630904c4be10de48e39d5f8e6065c41b07"

RPROVIDES:${PN} += "cpupower"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0"

inherit rpm
