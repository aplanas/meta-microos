SUMMARY = "RADOS gateway client library"
DESCRIPTION = "This package provides a library implementation of the RADOS gateway \
(distributed object store with S3 and Swift personalities)."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librgw2-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "8e9441a2ef16e11d36582a17fd8c70c577153852b33b15409d4bc21ea4dc9d47c1ee8dd865c859b1ce61a35d00d8eb0b382d8f045267968be39b6ffc9199b3fe"

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
