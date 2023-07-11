SUMMARY = "User-level library for accessing IPMI services"
DESCRIPTION = "The user-level library that provides a higher-level abstraction of \
IPMI and generic services."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "libOpenIPMIui1-2.0.31-5.13.aarch64.rpm"
RPM_HASH = "c7757eb6a7c475dab76332c9432a1d684b10307e60056791792f647a2504da346daa0492993518285c6b5312cbaa7437d5ddd53ae664ad12aa21b127188d3ff0"

RPROVIDES:${PN} += "libOpenIPMIui.so.1 \
libOpenIPMIui1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIposix.so.0 \
libOpenIPMIutils.so.0 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
