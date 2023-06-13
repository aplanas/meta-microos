SUMMARY = "A Common C++ Class Framework for RTP Packets"
DESCRIPTION = "The ccrtp package offers a generic framework for sending and receiving \
real-time streaming data over UDP packets using sending and receiving \
packet queues."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.1.2"

RPM_NAME = "libccrtp3-2.1.2-2.27.aarch64.rpm"
RPM_HASH = "3958177e6ba00cb26b35fe0bfd809b244205e48a9f1d0e7dcfc4a935a10f3493fe00191cf9b9d0419b52375f961d16cfe4eb84b289df2926389074ddee18f9ed"

RPROVIDES:${PN} += "libccrtp.so.3()(64bit) \
libccrtp3 \
libccrtp3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcommoncpp.so.8()(64bit) \
libgcc_s.so.1()(64bit) \
libgcrypt.so.20()(64bit) \
libstdc++.so.6()(64bit) \
libucommon.so.8()(64bit)"

inherit rpm
