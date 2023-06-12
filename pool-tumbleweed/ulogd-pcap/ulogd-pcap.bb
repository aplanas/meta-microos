SUMMARY = "pcap output target for ulogd"
DESCRIPTION = "pcap output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.7"

RPM_NAME = "ulogd-pcap-2.0.7-6.8.aarch64.rpm"
RPM_HASH = "a87722a29806f322aa55593d6900bf3f4833e9164af3bb4a0ff75c03910c715a2693f39b73612f6f2a2eac3351720cf5efe99a44ebebcde53d0e7fd94af73788"

RPROVIDES:${PN} += "ulogd-pcap \
ulogd-pcap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
ulogd"

inherit rpm
