SUMMARY = "Chinese Lunar calendar library"
DESCRIPTION = "Library to support date conversion from/to chinese lunar calendar"
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "lunar-date-2.9.3-2.15.aarch64.rpm"
RPM_HASH = "ace6471778f466c108a233ed9a24ef218c73746f21607d9b6dd1a9a581540d39149c70240a1483a415061c06d77c52fba3b3264c5f68629a8e8c4289ca0ea255"

RPROVIDES:${PN} += "lunar-date"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblunar-date-3.0.so.1"

inherit rpm
