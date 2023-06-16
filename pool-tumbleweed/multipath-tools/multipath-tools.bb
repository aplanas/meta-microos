SUMMARY = "Tools to Manage Multipathed Devices with the device-mapper"
DESCRIPTION = "This package provides the multipath tool and the multipathd daemon \
to manage dm-multipath devices. multipath can detect and set up \
multipath maps. multipathd sets up multipath maps automatically, \
monitors path devices for failure, removal, or addition, and applies \
the necessary changes to the multipath maps to ensure continuous \
availability of the map devices."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "multipath-tools-0.9.5+68+suse.d1b6a1c-1.1.aarch64.rpm"
RPM_HASH = "a964083b6f524ac4fa61170d8b02e492a72b227efc80e790c304cae2909806f577b67d3bd282f6fdaf45b265c51a28c0bbacbae910f8b383d3050e680d18510a"

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
