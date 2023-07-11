SUMMARY = "A Network Traffic Analyser"
DESCRIPTION = "Wireshark is a network protocol analyzer. It allows examining data \
from a live network or from a capture file on disk. You can \
interactively browse the capture data, viewing summary and detailed \
information for each packet. Wireshark has several features, \
including a rich display filter language and the ability to view the \
reconstructed stream of a TCP session."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.6"

RPM_NAME = "wireshark-4.0.6-3.1.aarch64.rpm"
RPM_HASH = "a9426adf9a051925ffa12bed372c519c29025e09a26443204cbab57ee73a410119c78eec7de12e9728af0d25c1a6398ce2e7ecd2cfab73df032a8b823b4b6b21"

RPROVIDES:${PN} += "ethereal \
group-wireshark \
wireshark"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbcg729.so.0 \
libbrotlidec1 \
libc.so.6 \
libcap.so.2 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libmaxminddb.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libopus.so.0 \
libpcap.so.1 \
libpcre2-8.so.0 \
libsbc.so.1 \
libspandsp.so.3 \
libspeexdsp.so.1 \
libssh.so.4 \
libsystemd.so.0 \
libwireshark.so.16 \
libwiretap.so.13 \
libwsutil.so.14 \
libz.so.1 \
permissions \
shadow"

inherit rpm
