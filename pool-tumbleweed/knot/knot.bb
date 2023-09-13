SUMMARY = "An authoritative DNS daemon"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "knot-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "850cb47e8c2665b72bfe88853a03060909664a30e3ad5fb62c84042b5a204e09d117504241ebbed9faa9701896777df0d5b7396d92b98779dd5cef7cc6fabc02"

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
libknot.so.14 \
liblmdb-0.9.30.so \
libmaxminddb.so.0 \
libprotobuf-c.so.1 \
libsystemd.so.0 \
liburcu.so.8 \
libzscanner.so.4 \
systemd \
sysuser-shadow"

inherit rpm
