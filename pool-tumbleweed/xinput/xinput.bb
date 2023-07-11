SUMMARY = "Utility to configure and test X input devices"
DESCRIPTION = "xinput is a utility to configure and test XInput devices."
LICENSE = "HPND & MIT"

PV = "1.6.4"

RPM_NAME = "xinput-1.6.4-1.2.aarch64.rpm"
RPM_HASH = "3710659cdfd9aeb07ba1fd7dd4aeda327d0533839d2c131c956c2469ab55f336f454372509283d10837e78096a949d30a2df0e393fff1da80275789afd688124"

RPROVIDES:${PN} += "xinput"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6"

inherit rpm
