SUMMARY = "Name Service Caching Daemon"
DESCRIPTION = "Nscd caches name service lookups and can dramatically improve \
performance with NIS, NIS+, and LDAP."
LICENSE = "GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "nscd-2.37-4.1.aarch64.rpm"
RPM_HASH = "78c421076f5647b618e0b43351092eeee339f18460776587f8f9649a38112294e6bd13573c6e73bb48be26b03dfdf18aac5916134fe291479b07ef32f98a7423"

RPROVIDES:${PN} += "config(nscd) \
glibc:/usr/sbin/nscd \
group(nscd) \
nscd \
nscd(aarch-64) \
user(nscd)"

RDEPENDS:${PN} += "/bin/sh \
glibc \
ld-linux-aarch64.so.1()(64bit) \
libaudit.so.1()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libselinux.so.1()(64bit) \
systemd \
sysuser-shadow"

inherit rpm
