SUMMARY = "Distributed lock manager library"
DESCRIPTION = "FLoM is a distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "libflom0-1.6.1-1.2.aarch64.rpm"
RPM_HASH = "cd254979e38172559c4a1a8481d8e9f97887b010ee3ddd8b0e7d3297b77dd1f66adf3e7d441dc71626697a633806f12644c6685c4d516321073c678fca9dc5df"

RPROVIDES:${PN} += "libflom.so.0 \
libflom0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libssl.so.3"

inherit rpm
