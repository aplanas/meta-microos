SUMMARY = "Signing tool for PE-COFF binaries"
DESCRIPTION = "Signing tool for PE-COFF binaries. It is vaguely compliant \
with the PE and Authenticode specifications."
LICENSE = "GPL-3.0-or-later"

PV = "116"

RPM_NAME = "pesign-116-1.2.aarch64.rpm"
RPM_HASH = "997f83ca0d4793c5bc5d9dcca6a618cc25ce2e1222d415d1f88a08de2aa3ee0b7b443ea2594a12450666f6f3d9a4985f14625e593cc2a1834ce7921d7b965578"

RPROVIDES:${PN} += "config-pesign \
group-pesign \
pesign \
rpm-macro--pesign \
rpm-macro--pesign-client \
rpm-macro-pesign \
user-pesign"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libefivar.so.1 \
libnspr4.so \
libnss3.so \
libpopt.so.0 \
libsmime3.so \
libuuid.so.1 \
systemd \
sysuser-shadow"

inherit rpm
