SUMMARY = "Library to look up words in dictionary sources"
DESCRIPTION = "The matedict library is an engine to look up words in dictionary sources."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "libmatedict6-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "aad158c448bc484708247f1f2c9ad3f91e48bd64decdcc5ecab7f50b68891ef74db739f2b174c04d7dfee71979f6ecce34260cee6835e6940744f6124df46a37"

RPROVIDES:${PN} += "libmatedict.so.6()(64bit) \
libmatedict6 \
libmatedict6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
