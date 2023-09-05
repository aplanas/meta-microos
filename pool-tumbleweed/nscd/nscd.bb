SUMMARY = "Name Service Caching Daemon"
DESCRIPTION = "Nscd caches name service lookups and can dramatically improve \
performance with NIS, NIS+, and LDAP."
LICENSE = "GPL-2.0-or-later"

PV = "2.38"

RPM_NAME = "nscd-2.38-2.1.aarch64.rpm"
RPM_HASH = "2936160b5dfe4153e2018d3e1b31057cef756595d22412d047e3d56405c4357a6c1ec8c14827561f80ba6ae229f5f5cec53ada832467c9c1b6be96f9b24009ac"

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
