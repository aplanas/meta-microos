SUMMARY = "Chinese Lunar calendar library"
DESCRIPTION = "Library to support date conversion from/to chinese lunar calendar"
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "lunar-date-2.9.3-2.14.aarch64.rpm"
RPM_HASH = "dd1fe31237b7f0d5526aced4ef4de312beab9c4e878c2be17b5b32c7d37bc86a0525c41377effedde65d7adbd37b78c579b37da69716681480ddc171ed5c16d5"

RPROVIDES:${PN} += "lunar-date \
lunar-date(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblunar-date-3.0.so.1()(64bit)"

inherit rpm
