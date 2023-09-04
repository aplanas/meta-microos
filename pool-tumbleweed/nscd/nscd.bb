SUMMARY = "Name Service Caching Daemon"
DESCRIPTION = "Nscd caches name service lookups and can dramatically improve \
performance with NIS, NIS+, and LDAP."
LICENSE = "GPL-2.0-or-later"

PV = "2.38"

RPM_NAME = "nscd-2.38-1.1.aarch64.rpm"
RPM_HASH = "f4a45ae59f74fc574e786a438a2626d16dd0027e75118ff26e3f9f7d33d5ec814d7c8275254439262178285ac8624d9a4e901bd3334a6e206768c83965081787"

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
