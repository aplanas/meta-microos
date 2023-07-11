SUMMARY = "Chinese Lunar calendar library"
DESCRIPTION = "Library to support date conversion from/to chinese lunar calendar"
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "liblunar-date-3_0-1-2.9.3-2.15.aarch64.rpm"
RPM_HASH = "77ad1e4cdf3c22c67238ee9004cb352fb9bcae422cd392bc05220eca5d39258cf9dbd3f67accdb62a0c0e08283a6306fc5d5057bd727008f7b8ff335e33fd624"

RPROVIDES:${PN} += "liblunar-date-3-0-1 \
liblunar-date-3.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
