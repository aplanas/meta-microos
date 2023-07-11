SUMMARY = "An authentication service for creating and validating credentials"
DESCRIPTION = "MUNGE (MUNGE Uid 'N' Gid Emporium) is an authentication service for \
creating and validating user credentials.  It is designed to be highly \
scalable for use in an HPC cluster environment.  It provides a portable \
API for encoding the user's identity into a tamper-proof credential \
that can be obtained by an untrusted client and forwarded by untrusted \
intermediaries within a security realm.  Clients within this realm can \
create and validate credentials without the use of root privileges, \
reserved ports, or platform-specific methods."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.5.15"

RPM_NAME = "munge-0.5.15-2.5.aarch64.rpm"
RPM_HASH = "9f7bdcb185823c75862a0de9b3ed62d8deb150dcd40f430696a6226fc2a6fdeb32ba56c97815b8014e392a31dab06e617afc43d64fa5ea48420493d2d34b61bf"

RPROVIDES:${PN} += "config-munge \
group-munge \
munge \
user-munge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libmunge.so.2 \
libz.so.1 \
logrotate \
shadow \
systemd"

inherit rpm
