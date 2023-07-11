SUMMARY = "C++ library API for genders"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with genders. This is the C++ API."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "libgendersplusplus2-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "8a18b1a8812057e74a10f8d2fe53890b5b6134acaef9643e3b4cf73745e943ab96e8507d79efc82590064e0baf7a1edd87460853f7466a410b8db6b49ad845cb"

RPROVIDES:${PN} += "libgendersplusplus.so.2 \
libgendersplusplus2"

RDEPENDS:${PN} += "/sbin/ldconfig \
genders-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgenders.so.0 \
libstdc++.so.6"

inherit rpm
