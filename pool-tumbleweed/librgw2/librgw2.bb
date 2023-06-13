SUMMARY = "RADOS gateway client library"
DESCRIPTION = "This package provides a library implementation of the RADOS gateway \
(distributed object store with S3 and Swift personalities)."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librgw2-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "8e9441a2ef16e11d36582a17fd8c70c577153852b33b15409d4bc21ea4dc9d47c1ee8dd865c859b1ce61a35d00d8eb0b382d8f045267968be39b6ffc9199b3fe"

RPROVIDES:${PN} += "librgw.so.2()(64bit) \
librgw2 \
librgw2(aarch-64) \
librgw_op_tp.so.2()(64bit) \
librgw_rados_tp.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libceph-common.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
libldap.so.2()(64bit) \
liblttng-ust.so.1()(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
librados.so.2()(64bit) \
librados2 \
libstdc++.so.6()(64bit)"

inherit rpm
