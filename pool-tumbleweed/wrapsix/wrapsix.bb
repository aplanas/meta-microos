SUMMARY = "Software implementation of NAT64"
DESCRIPTION = "WrapSix is a NAT64 gateway, implemented in userspace. So far, it is \
faster than than Ecdysis (a kernelspace implementation) and Tayga \
(another userspace implementation)."
LICENSE = "GPL-3.0-only"

PV = "0.2.1"

RPM_NAME = "wrapsix-0.2.1-2.6.aarch64.rpm"
RPM_HASH = "d064912864fc1fcf70eb64471d22ab2622a67c9c82912c662003613d9018d268154439a90beb4d1830c70c9fa440652f65522631660b3d017cf29a9762b2020d"

RPROVIDES:${PN} += "config(wrapsix) \
wrapsix \
wrapsix(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
systemd"

inherit rpm
