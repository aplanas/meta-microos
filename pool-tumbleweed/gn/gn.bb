SUMMARY = "A meta-build system that generates build files for Ninja"
DESCRIPTION = "GN is a meta-build system that generates build files for Ninja."
LICENSE = "BSD-3-Clause"

PV = "0.20210811"

RPM_NAME = "gn-0.20210811-4.4.aarch64.rpm"
RPM_HASH = "f80927e6d2fc1aa7fffb0b5df83bb0cac972a38d0b73248a96a0caae20a9bc71b6490276ce208702d110e3ce38ccd2f026ba83feb7496514196f0d1c44f228f4"

RPROVIDES:${PN} += "gn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
