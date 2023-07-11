SUMMARY = "Userspace tools for the Linux Pulse Per Second subsystem"
DESCRIPTION = "Userland tools to test Linux kernel PPS API. See Documentations/pps/pps.txt \
for reference."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.0+git.20211122"

RPM_NAME = "pps-tools-0.0.0+git.20211122-1.3.aarch64.rpm"
RPM_HASH = "32f9ee73d75df3c0bc46e199f6ec0f5527f5aeaf12bc815d2c40cf8539d2cb8c0f17c469db3deb534127da2512a61b017a4e84be6f9ca053b5e388fb03095a04"

RPROVIDES:${PN} += "pps-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
pps-udev"

inherit rpm
