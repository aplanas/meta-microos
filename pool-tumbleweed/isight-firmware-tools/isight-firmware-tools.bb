SUMMARY = "Tools to manipulate firmware for Built-in iSight"
DESCRIPTION = "This project provide tools to manipulate firmware for Built-in iSight \
found on Apple machine since iMac G5 iSight"
LICENSE = "GPL-2.0"

PV = "1.6"

RPM_NAME = "isight-firmware-tools-1.6-17.29.aarch64.rpm"
RPM_HASH = "6b7776ff532938df93fdb43de76a50b74099783529f23b08156c56c74b9e444babf5957229a2a69387066a0fe56d7004bc0c8760fa442b8324f8e34a1622a141"

RPROVIDES:${PN} += "isight-firmware-tools \
isight-firmware-tools(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libusb-0.1.so.4()(64bit) \
systemd"

inherit rpm
