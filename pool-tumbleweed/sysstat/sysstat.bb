SUMMARY = "Sar and Iostat Commands for Linux"
DESCRIPTION = "Sar and Iostat commands for Linux. The sar command collects and reports \
system activity information. The iostat command reports CPU statistics \
and I/O statistics for TTY devices and disks.  The information \
collected by sar and iostat can be saved in a binary file for future \
inspection. Both commands now support SMP machines when displaying CPU \
utilization."
LICENSE = "GPL-2.0-or-later"

PV = "12.6.2"

RPM_NAME = "sysstat-12.6.2-3.1.aarch64.rpm"
RPM_HASH = "df38f955bb126d83ef2d4c5f9fc37752fe3e61578642c0f405c46a18ece82de63a3657922e606de6a7f63ab6f327e0789e05f802755a68d917d0448932aea784"

RPROVIDES:${PN} += "config-sysstat \
sysstat"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-import.so.1 \
libpcp.so.3 \
libsensors.so.4 \
procmail \
xz"

inherit rpm
