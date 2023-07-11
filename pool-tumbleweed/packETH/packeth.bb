SUMMARY = "Packet generator tool for ethernet"
DESCRIPTION = "packETH is tool for generating packets to send over ethernet."
LICENSE = "GPL-3.0-or-later"

PV = "2.1"

RPM_NAME = "packETH-2.1-1.10.aarch64.rpm"
RPM_HASH = "85835220b650d5d92635c719ab916d95d701d44503f21a20c99ab874dbd8ff4fce695196b46f84591d43fafd8f7303f45771738c7543abfc4314148864655c6f"

RPROVIDES:${PN} += "packETH"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6"

inherit rpm
