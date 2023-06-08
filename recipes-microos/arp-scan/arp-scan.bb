SUMMARY = "ARP scanning and fingerprinting tool"
DESCRIPTION = "arp-scan is a command-line tool that uses the ARP protocol to discover and fingerprint IP hosts on the local network."
LICENSE = "GPL-3.0-only & LGPL-2.1-only & ISC"

PV = "1.10.0"

RPM_NAME = "arp-scan-1.10.0-1.2.aarch64.rpm"
RPM_HASH = "f1f50f1e5e0d62ae1f9d1958a6b4841dfba5436cbf7b8d706208efc4222377fa15f1ea94d6f5eab0c44f8fb13fdabff4359e9fc1edba60bebe4368ab1c9b334c"

RPROVIDES:${PN} += "arp-scan arp-scan(aarch-64) config(arp-scan)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libpcap.so.1()(64bit) perl(:MODULE_COMPAT_5.36.0) perl(LWP::Simple)"

inherit rpm
