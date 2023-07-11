SUMMARY = "A Common C++ Class Framework for RTP Packets"
DESCRIPTION = "The ccrtp package offers a generic framework for sending and receiving \
real-time streaming data over UDP packets using sending and receiving \
packet queues."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.1.2"

RPM_NAME = "libccrtp3-2.1.2-2.28.aarch64.rpm"
RPM_HASH = "a27d9dcb2fc4b47f6c45df35a8926af049b5cf8b2e108cd3f65da33f905822c9a7b1d694c3de985ac81b5c65340966172f43b4b362fb418442c71c4e510a7c29"

RPROVIDES:${PN} += "libccrtp.so.3 \
libccrtp3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcommoncpp.so.8 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libstdc++.so.6 \
libucommon.so.8"

inherit rpm
