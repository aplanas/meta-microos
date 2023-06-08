SUMMARY = "Broadcasts a DVB Stream over the Network"
DESCRIPTION = "dvbstream can broadcast either a (subset of a) DVB transport stream or \
a DVB program stream over a LAN using the rtp protocol. It attempts to \
be compliant with RFCs 1889, 1890, 2038, and 2250. It can also dump the \
stream to stdout, for example, for local software decoding when using \
DVB cards without a hardware MPEG decoder."
LICENSE = "GPL-2.0+"

PV = "0.6"

RPM_NAME = "dvbstream-0.6-163.8.aarch64.rpm"
RPM_HASH = "e6e8340dd741b90c8af4f8248151ba6ade2e4561317a8267fcb568d8d813a43bf93a772077d1e3ccf1a1411f6af5e91db3aea3f122550a4069ac9ce9f8029505"

RPROVIDES:${PN} += "dvbstream dvbstream(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
