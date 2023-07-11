SUMMARY = "Tools to work with Apple Keynote presentations"
DESCRIPTION = "This package contains tools to work with Apple Keynote presentations"
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-tools-0.1.10-1.12.aarch64.rpm"
RPM_HASH = "8fba673687fe15c63be0fb0ff49f204b1fd68c36bb5c5284bfc97dfe24692316bb56aca36b7d37374cc18bc3bb49b6bca31f158a1423a8ec6ee37670ad7629e1"

RPROVIDES:${PN} += "libetonyek-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libetonyek-0.1.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
