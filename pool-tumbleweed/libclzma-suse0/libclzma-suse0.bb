SUMMARY = "LZMA stream encoding/decoding library from 7-Zip"
DESCRIPTION = "Library for encoding/decoding LZMA streams, using the 7-Zip library \
implementation."
LICENSE = "LGPL-2.1-only"

PV = "22.01"

RPM_NAME = "libclzma-suse0-22.01-1.3.aarch64.rpm"
RPM_HASH = "efa508aa11166249675c75cde4156cc1e4fc8e2a33ea25308879d94d7efe9bef41f87d31e58c08dd639b78115639c450c97997483446cf73afe7047c6294c0df"

RPROVIDES:${PN} += "libclzma-suse.so.0 \
libclzma-suse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
