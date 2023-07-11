SUMMARY = "Server library for Heimdal Kerberos"
DESCRIPTION = "This package contains the server library for Heimdal's kadmin program."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkadm5srv8-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "155121aef4bc8bca794361f2af638d49f383c58fdec9f46558c54fb53c2bf1cfe59ff4ab6b72f5b64d516a19f28c51efa03ba7b090419876255864ce71b08fc4"

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
