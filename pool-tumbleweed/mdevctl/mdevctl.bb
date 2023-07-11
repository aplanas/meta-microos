SUMMARY = "Mediated device management and persistence utility"
DESCRIPTION = "mdevctl is a utility for managing and persisting devices in the mediated device \
framework of the Linux kernel. Mediated devices are sub-devices of a parent \
device (e.g. a vGPU) which can be dynamically created and potentially used by \
drivers like vfio-mdev for assignment to virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "mdevctl-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "eb2e56cc6707e8f923f03d381fa0ce70216ffb1ac5423a54d3df00ba1e72115220ceaf5e4b88fb03fa032a7828a8df19226d5d99ea55f3547d701cf536741f2c"

RPROVIDES:${PN} += "mdevctl"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
