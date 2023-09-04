SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "noping continuously pings lists of hosts, displays ping statistics 'live' \
and highlights aberrant round-trip times."
LICENSE = "GPL-2.0-only"

PV = "1.10.0"

RPM_NAME = "noping-1.10.0-1.20.aarch64.rpm"
RPM_HASH = "2623cff92bb55a18b9431cb2aa2df8c8953cf66320db1459652d2c04e3140116117261bc75e40d39af9d2a5df0a6a1c3723bf41f8c4b4e82d8b9d58609f104bc"

RPROVIDES:${PN} += "noping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
liboping \
liboping.so.0 \
libtinfo.so.6"

inherit rpm
