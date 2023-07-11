SUMMARY = "Utilities for configuring gaming mice"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the ratbag utilities allowing to inspect and configure \
mice."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "libratbag-tools-0.17-2.2.aarch64.rpm"
RPM_HASH = "672e1475523c31237a7af2295f53f4e2315f9fa76c08ddadb72c72ebad4be3f2ba9df1beff3c9df284c4dc6b252f712cdb7a8b07b6504d9497110d4641561c6c"

RPROVIDES:${PN} += "libratbag-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblur.so.3 \
python3-evdev \
ratbagd"

inherit rpm
