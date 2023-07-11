SUMMARY = "Client library for Heimdal Kerberos"
DESCRIPTION = "This package contains the client library for Heimdal's kadmin program."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkadm5clnt7-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "624e53846bd30d2e9509e9287c26f242d60bde8470586fbe48a230d84a9ac533027d57c88bdd4c87e4caf7aa7dd7c7f38be42c9cfb502aeda127d803e5b1db9c"

RPROVIDES:${PN} += "libkadm5clnt.so.7 \
libkadm5clnt7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libkrb5.so.26 \
libroken.so.18"

inherit rpm
