SUMMARY = "Ncurses SIP Messages flow viewer"
DESCRIPTION = "sngrep displays SIP Messages grouped by Call-Id into flow \
diagrams. It can be used as an offline pcap viewer or online \
capture using libpcap functions. \
 \
It supports SIP UDP and TCP transports (when each message is \
delivered in one packet)."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.0"

RPM_NAME = "sngrep-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "46107af44cac8370a85c45c0d86556d84de521982b58b766c7027a9e597b69cf5c9bb3002d6c36521262874734163427fe710d8ad830f42071a9c1b706e6d6b2"

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
