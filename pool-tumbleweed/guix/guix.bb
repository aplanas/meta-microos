SUMMARY = "GNU Package manager"
DESCRIPTION = "Purely functional package manager and a distribution thereof. \
It offers transactional upgrades, roll-backs, unprivileged package management. \
As a GNU distribution it contains only free software."
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "guix-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "96ffdbec9c3939d1c54b0bd284d64963f58c125c36767e52ed3235030ae982f7cec84c6632effd008db54574f899942f5298f3d9d2ff409ce00c5802a04a8b8f"

RPROVIDES:${PN} += "/usr/libexec/guix/guile \
guix"

RDEPENDS:${PN} += "/usr/bin/sh \
gnutls-guile \
guile \
guile-gcrypt \
guile-git \
guile-json \
guile-lzlib \
guile-sqlite3 \
guile-ssh-devel \
guile-zlib \
gzip \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt-devel \
libgcrypt.so.20 \
libguile-3.0.so.1 \
libguile-ssh14 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
