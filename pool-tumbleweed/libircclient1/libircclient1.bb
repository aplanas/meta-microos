SUMMARY = "Library implementing client-server IRC protocol"
DESCRIPTION = "It is designed to be small, fast, portable and compatible to RFC standards and most IRC clients."
LICENSE = "LGPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "libircclient1-1.10-1.15.aarch64.rpm"
RPM_HASH = "cf572b95020bf29f34136467176cb6fa8a860f108f250e923354691d34201df05e3bb53b166c96cbd57b14c8735eb6d67fdd43a416c6992aa20ed7113143208b"

RPROVIDES:${PN} += "libircclient.so.1 \
libircclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
