SUMMARY = "Network UPS Tools - Extra Networking Drivers (for Network Monitoring)"
DESCRIPTION = "Networking drivers for the Network UPS Tools. You will need them \
together with nut to provide UPS networking support. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-drivers-net-2.8.0-2.1.aarch64.rpm"
RPM_HASH = "b72db8046b15719d621d0495972e6f5dcd7e4b596c6008ecc7fbce6b510a26416f7966083cacee05ac9050ad21e9f196414128bdaf7c01719a00c806aae5f857"

RPROVIDES:${PN} += "nut-drivers-net \
nut-drivers-net(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libneon.so.27()(64bit) \
libnetsnmp.so.40()(64bit) \
nut"

inherit rpm
