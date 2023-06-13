SUMMARY = "D-Bus service to check the availability of dual-GPU"
DESCRIPTION = "switcheroo-control is a D-Bus service to check the availability of dual-GPU."
LICENSE = "GPL-3.0-only"

PV = "2.6"

RPM_NAME = "switcheroo-control-2.6-1.4.aarch64.rpm"
RPM_HASH = "abaee271f06021052a1f77aa7b2259678a91c38da712020ad214d333395287a8eb4f4315fe32cd9a6d74da794b758dac2700d3c86e59ab62fadf3c06cf09e93e"

RPROVIDES:${PN} += "switcheroo-control \
switcheroo-control(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
systemd"

inherit rpm
