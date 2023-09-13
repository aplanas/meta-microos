SUMMARY = "Tools to Manage Multipathed Devices with the device-mapper"
DESCRIPTION = "This package provides the multipath tool and the multipathd daemon \
to manage dm-multipath devices. multipath can detect and set up \
multipath maps. multipathd sets up multipath maps automatically, \
monitors path devices for failure, removal, or addition, and applies \
the necessary changes to the multipath maps to ensure continuous \
availability of the map devices."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "0.9.6+71+suse.f07325e"

RPM_NAME = "multipath-tools-0.9.6+71+suse.f07325e-1.1.aarch64.rpm"
RPM_HASH = "28c1b2bcd31761f003e3b41fda7a0a02ac8a7a26e827a2c9f26a7e0e7a3df06fd9bbef7a68aa1c8aeff504c5f68b9bbcc59b7c6eb3a30544d469e8bc3a10f9d3"

RPROVIDES:${PN} += "multipath-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
device-mapper \
grep \
kpartx \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libmpathcmd.so.0 \
libmpathpersist.so.0 \
libmpathutil.so.0 \
libmultipath.so.0 \
libsystemd.so.0 \
libudev.so.1 \
liburcu.so.8 \
sg3-utils \
suse-module-tools \
systemd"

inherit rpm
