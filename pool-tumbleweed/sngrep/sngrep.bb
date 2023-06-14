SUMMARY = "Ncurses SIP Messages flow viewer"
DESCRIPTION = "sngrep displays SIP Messages grouped by Call-Id into flow \
diagrams. It can be used as an offline pcap viewer or online \
capture using libpcap functions. \
 \
It supports SIP UDP and TCP transports (when each message is \
delivered in one packet)."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.0"

RPM_NAME = "sngrep-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "8fdea3dc0b6169be207ba11d6700e1e5dbf989246c0be5153385b991736b39e8149175e5bddace5cb771be17df06141d95e470560304494b2a32178e22f42219"

RPROVIDES:${PN} += "config-sngrep \
sngrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libformw.so.6 \
libmenuw.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libpcap.so.1 \
libpcre.so.1 \
libssl.so.3 \
libtinfo.so.6"

inherit rpm
