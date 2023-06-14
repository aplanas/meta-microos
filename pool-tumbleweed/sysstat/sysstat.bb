SUMMARY = "Sar and Iostat Commands for Linux"
DESCRIPTION = "Sar and Iostat commands for Linux. The sar command collects and reports \
system activity information. The iostat command reports CPU statistics \
and I/O statistics for TTY devices and disks.  The information \
collected by sar and iostat can be saved in a binary file for future \
inspection. Both commands now support SMP machines when displaying CPU \
utilization."
LICENSE = "GPL-2.0-or-later"

PV = "12.6.2"

RPM_NAME = "sysstat-12.6.2-2.1.aarch64.rpm"
RPM_HASH = "3d6a92110979423b9e3e05f67a4e8b977681c8ea4bfd78c7b672f49e95526fd536ea92ccd40113b74ae42dd3d195175de574af5c062df78861df9e6cf9a33410"

RPROVIDES:${PN} += "config-sysstat \
sysstat"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-import.so.1 \
libpcp.so.3 \
libsensors.so.4 \
procmail \
xz"

inherit rpm
