SUMMARY = "C++ library API for genders"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with genders. This is the C++ API."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "libgendersplusplus2-1.28.1-2.3.aarch64.rpm"
RPM_HASH = "fb199a4674412b7cf6731451f624411eb21aff06c7eca51cdefea42e7ec2093e0b45443eab6de5f5fe9680be1e5945238b68b5569a4f1ab5f19cb85083e10618"

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
