SUMMARY = "A Network Traffic Analyser"
DESCRIPTION = "Wireshark is a network protocol analyzer. It allows examining data \
from a live network or from a capture file on disk. You can \
interactively browse the capture data, viewing summary and detailed \
information for each packet. Wireshark has several features, \
including a rich display filter language and the ability to view the \
reconstructed stream of a TCP session."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.6"

RPM_NAME = "wireshark-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "787126e28b144f7d81139b72d31235b4534aee5ae6bc5c4e7855dbff359d88449ad82ef098bd3ad3b0a520ad1dda600523d6233a7d050ff30f5546ce69ae5af5"

RPROVIDES:${PN} += "ethereal \
group(wireshark) \
wireshark \
wireshark(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbcg729.so.0()(64bit) \
libbrotlidec1 \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmaxminddb.so.0()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libopus.so.0()(64bit) \
libpcap.so.1()(64bit) \
libpcre2-8.so.0()(64bit) \
libsbc.so.1()(64bit) \
libsbc.so.1(SBC_1.0)(64bit) \
libspandsp.so.3()(64bit) \
libspeexdsp.so.1()(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_246)(64bit) \
libwireshark.so.16()(64bit) \
libwiretap.so.13()(64bit) \
libwsutil.so.14()(64bit) \
libz.so.1()(64bit) \
permissions \
shadow"

inherit rpm