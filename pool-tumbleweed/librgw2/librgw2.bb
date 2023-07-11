SUMMARY = "RADOS gateway client library"
DESCRIPTION = "This package provides a library implementation of the RADOS gateway \
(distributed object store with S3 and Swift personalities)."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librgw2-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "5565a201cc4faa6152dfc41134d4ffab2cfd627b1eb2a257d41df40a0b3bb68ab3641aa9371cd38af7978e7383d7319b6c21ac64ed14b33d83cf54373d104e51"

RPROVIDES:${PN} += "librgw-op-tp.so.2 \
librgw-rados-tp.so.2 \
librgw.so.2 \
librgw2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libicuuc.so.73 \
libldap.so.2 \
liblttng-ust.so.1 \
liblua5.4.so.5 \
libm.so.6 \
librados.so.2 \
librados2 \
libstdc++.so.6"

inherit rpm
