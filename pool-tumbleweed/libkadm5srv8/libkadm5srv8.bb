SUMMARY = "Server library for Heimdal Kerberos"
DESCRIPTION = "This package contains the server library for Heimdal's kadmin program."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkadm5srv8-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "858c0876394d9d352cb560eb8da0e8749a0ca0ae5a1b80baf4a5cb63396dd8df46225f023e2f7f10684e2c40788e24bb365ddf34c115ca381dbd637b0fcc1172"

RPROVIDES:${PN} += "libkadm5srv.so.8 \
libkadm5srv8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libhdb.so.9 \
libheimbase.so.1 \
libkrb5.so.26 \
libroken.so.18"

inherit rpm
