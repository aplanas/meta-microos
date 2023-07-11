SUMMARY = "Tools to determine and set CPU Power related Settings"
DESCRIPTION = "This tool accesses the Linux kernel's processor power subsystems \
like CPU frequency switching (cpufreq) or CPU sleep states (cpuidle)."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "cpupower-6.3.9-4.15.aarch64.rpm"
RPM_HASH = "146be34f09931b8d180ad5ceb74cf3b0ecf074f6f355dc481ff82104778f46ce00c9c099a1d0b4da6aba718b6616349a9a83c4e52657b441a6c80f581f0c8dbc"

RPROVIDES:${PN} += "cpupower"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0"

inherit rpm
