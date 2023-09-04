SUMMARY = "An authoritative DNS daemon"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.9"

RPM_NAME = "knot-3.2.9-1.1.aarch64.rpm"
RPM_HASH = "3011f59e5103f3def5458f591bace62b537c981d1af9766af0111509986597204c470837a596acbe49c1138207712c8442b318cc203110278a6fa6a83133d408"

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
