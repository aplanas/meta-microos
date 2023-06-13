SUMMARY = "Linux configuration tool for Logitech mice"
DESCRIPTION = "RatSlap provides a way to configure configurable Logitech mice from \
within Linux. \
 \
Currently, only G300/G300S is supported."
LICENSE = "GPL-2.0-only"

PV = "0.4.1"

RPM_NAME = "ratslap-0.4.1-1.10.aarch64.rpm"
RPM_HASH = "d17aabfd1078c59059f571b4f4ce84c962a315bb459aa82be48a2f68775bca439965c9c96ca358a463f6d3ec554068f9a3f76e39a10d094e0fed630c83a1c68a"

RPROVIDES:${PN} += "ratslap \
ratslap(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
