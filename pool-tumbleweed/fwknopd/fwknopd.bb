SUMMARY = "The fwknop Server"
DESCRIPTION = "fwknop stands for the 'FireWall KNock OPerator', and implements an authorization \
scheme called Single Packet Authorization (SPA)."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "fwknopd-2.6.10-3.8.aarch64.rpm"
RPM_HASH = "bc91b5bc68979d45cff3ed4d2036d7d16b6ca322ba38fca3d497db45f4285575515890e2671ac94d1e946b506011255d83685367a8611e5db0eebb1a7cd6581e"

RPROVIDES:${PN} += "config(fwknopd) \
fwknopd \
fwknopd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfko.so.3()(64bit) \
libpcap.so.1()(64bit) \
systemd"

inherit rpm
