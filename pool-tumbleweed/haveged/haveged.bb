SUMMARY = "Daemon for feeding entropy into the random pool"
DESCRIPTION = "The haveged daemon feeds the Linux entropy pool with random \
numbers generated from hidden processor state. \
 \
For more information, see http://www.issihosts.com/haveged/ ."
LICENSE = "GPL-3.0-only"

PV = "1.9.18"

RPM_NAME = "haveged-1.9.18-2.4.aarch64.rpm"
RPM_HASH = "24fdaa62b7e7acd871b5a4398e55f166d83b1aa2e4a9e20bc08e613d320dbd043691a8f23d4f6949893d9dc370dbcaf59aaf9949973938ad6cdc7fc6bca0e310"

RPROVIDES:${PN} += "haveged"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhavege.so.2 \
systemd"

inherit rpm
