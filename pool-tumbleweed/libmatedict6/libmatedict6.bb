SUMMARY = "Library to look up words in dictionary sources"
DESCRIPTION = "The matedict library is an engine to look up words in dictionary sources."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "libmatedict6-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "aad158c448bc484708247f1f2c9ad3f91e48bd64decdcc5ecab7f50b68891ef74db739f2b174c04d7dfee71979f6ecce34260cee6835e6940744f6124df46a37"

RPROVIDES:${PN} += "libmatedict.so.6 \
libmatedict6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
