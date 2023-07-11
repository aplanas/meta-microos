SUMMARY = "Name Service Caching Daemon"
DESCRIPTION = "Nscd caches name service lookups and can dramatically improve \
performance with NIS, NIS+, and LDAP."
LICENSE = "GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "nscd-2.37-4.4.aarch64.rpm"
RPM_HASH = "6b3bd7dd47c0b68ae41cb96ae332ebf3f759e14530e915e4d68d355cf1f3a4035b1c8533777da398801def2d42b17dcf0fcff2e2b038d33c8ab33f67f0445e7d"

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
