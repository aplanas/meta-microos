SUMMARY = "An authoritative DNS daemon"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "knot-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "91727ee54d41082cf77aac9823e9264a0186ae1ad8e049a47e95c6a29bcc3223dfc6f907da7ab1922703c8c36bc6282edfb92896e273698df424d190cf546ecc"

RPROVIDES:${PN} += "config-knot \
group-knot \
knot \
user-knot"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libdnssec.so.9 \
libedit.so.0 \
libfstrm.so.0 \
libgnutls.so.30 \
libidn2.so.0 \
libknot.so.13 \
liblmdb-0.9.30.so \
libmaxminddb.so.0 \
libprotobuf-c.so.1 \
libsystemd.so.0 \
liburcu.so.8 \
libzscanner.so.4 \
systemd \
sysuser-shadow"

inherit rpm
