SUMMARY = "Name Service Caching Daemon"
DESCRIPTION = "Nscd caches name service lookups and can dramatically improve \
performance with NIS, NIS+, and LDAP."
LICENSE = "GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "nscd-2.37-5.1.aarch64.rpm"
RPM_HASH = "9824c14255118c0ae35a8e6b73b4663dd948f81298ff9a7d1250c670f31e211474d29c29090ed1ffd6f915498247161c6aae9b6a3721817ba5840ad52df55153"

RPROVIDES:${PN} += "config-nscd \
glibc-/usr/sbin/nscd \
group-nscd \
nscd \
user-nscd"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcap.so.2 \
libselinux.so.1 \
systemd \
sysuser-shadow"

inherit rpm
