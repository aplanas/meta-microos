SUMMARY = "C++ library API for genders"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with genders. This is the C++ API."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "libgendersplusplus2-1.28.1-2.6.aarch64.rpm"
RPM_HASH = "0187594cc8e1d6de12c3b6dd55342a963c1bd7f9091d52f677e0db2561777f20d196751c035e771154cef8f2df16f2b14d2ef7ed13609ec596ef4cfb63769957"

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
