SUMMARY = "Utility to configure and test X input devices"
DESCRIPTION = "xinput is a utility to configure and test XInput devices."
LICENSE = "HPND & MIT"

PV = "1.6.4"

RPM_NAME = "xinput-1.6.4-1.1.aarch64.rpm"
RPM_HASH = "013dfbed916c28e128d790f82acabadfb162c185b00c6d0bdf4942fbd434c23788c8e6f36e0d266241b2c2fecce449c1da75cbede1f589974440cceac9dd9b3a"

RPROVIDES:${PN} += "xinput"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6"

inherit rpm
