SUMMARY = "Signing tool for PE-COFF binaries"
DESCRIPTION = "Signing tool for PE-COFF binaries. It is vaguely compliant \
with the PE and Authenticode specifications."
LICENSE = "GPL-3.0-or-later"

PV = "116"

RPM_NAME = "pesign-116-1.3.aarch64.rpm"
RPM_HASH = "40c67d682531015ce2e5e764d4e7ef2a4a2caa4b41f40484a996ca221d4637a91057bd5f56d3439b969cfca93b5aee8fda5c98be30199da9c62346034eb4d952"

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
