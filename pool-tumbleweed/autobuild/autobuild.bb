SUMMARY = "Multiple configuration build tool"
DESCRIPTION = "Configures, builds and tests a source code package whose configuration is \
provided by GNU's autoconf mechanism."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "autobuild-2.11.0-7.16.aarch64.rpm"
RPM_HASH = "c51d45552db223876e945290dac87ca26766a9e77c35ea87e0f00c4f8cfb663d9b638105956190a533b32b55c6b10000b210e2241f949be0aaa15bc908d2891b"

RPROVIDES:${PN} += "autobuild"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libm.so.6"

inherit rpm
