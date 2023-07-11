SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "noping continuously pings lists of hosts, displays ping statistics 'live' \
and highlights aberrant round-trip times."
LICENSE = "GPL-2.0-only"

PV = "1.10.0"

RPM_NAME = "noping-1.10.0-1.19.aarch64.rpm"
RPM_HASH = "30216dd6baa7ecdbf0aba57c80b40d537c9c2321393a567c553ae0af65e9964be087224ab3e60f5c6591244d50c602d41bf3320e3f3d72a8bda8e4f62ff4fc37"

RPROVIDES:${PN} += "noping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
liboping \
liboping.so.0 \
libtinfo.so.6"

inherit rpm
