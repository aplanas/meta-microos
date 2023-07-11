SUMMARY = "LZMA stream encoding/decoding library from 7-Zip"
DESCRIPTION = "Library for encoding/decoding LZMA streams, using the 7-Zip library \
implementation."
LICENSE = "LGPL-2.1-only"

PV = "22.01"

RPM_NAME = "libclzma-suse0-22.01-1.4.aarch64.rpm"
RPM_HASH = "e4a1d5abf8d9d5fee63d4b1b992401a224f1999f91cb68ce59baf3eec496eb46ebd0ed9d8fbaab878a4e32218e1c7b51fffa60f9293cf2c15f1ed181736440b6"

RPROVIDES:${PN} += "libclzma-suse.so.0 \
libclzma-suse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
