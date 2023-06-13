SUMMARY = "A meta-build system that generates build files for Ninja"
DESCRIPTION = "GN is a meta-build system that generates build files for Ninja."
LICENSE = "BSD-3-Clause"

PV = "0.20210811"

RPM_NAME = "gn-0.20210811-4.3.aarch64.rpm"
RPM_HASH = "6788da9231131bcaf81620ef997c9524c9a6e9a9ea6c06fa4e8d63200e34c6cd31f9aaf39dad88f8cddffb2a576c0a0cabbfec842459cb514efb2037ce84ec67"

RPROVIDES:${PN} += "gn \
gn(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
