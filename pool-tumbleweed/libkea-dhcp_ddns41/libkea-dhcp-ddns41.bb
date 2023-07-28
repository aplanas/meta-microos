SUMMARY = "Kea DHCP Dynamic DNS library"
DESCRIPTION = "This is a library of classes for sending and receiving requests used \
by ISC's DHCP-DDNS (aka D2) service to carry out DHCP-driven DNS \
updates."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-dhcp_ddns41-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "59829cd7d49b4a3f2dd110cfb21a553068685639f8847664a5038bc12c297efdc8e0a2b7e8bfb810c3931736376446b32afb2558c83079d0bdf35ebf437a0440"

RPROVIDES:${PN} += "libkea-dhcp-ddns.so.41 \
libkea-dhcp-ddns41"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-cryptolink.so.38 \
libkea-dhcp++.so.73 \
libkea-dns++.so.42 \
libkea-exceptions.so.23 \
libkea-log.so.48 \
libkea-stats.so.29 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
