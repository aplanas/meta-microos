SUMMARY = "SSH agent binary for gcr"
DESCRIPTION = "gcr-ssh-agent as a standalone binary, so that it can easily be \
managed through systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "gcr-ssh-agent-4.1.0-1.2.aarch64.rpm"
RPM_HASH = "d6bdc2e9b1f74f38c4473cc182e030aa93138a7b1659ce5cec9a164f5ffa4f182e148b325eed8419dc2a2d02d6eef96b86d290e2892fbca2304aaa2e6d9cac37"

RPROVIDES:${PN} += "gcr-ssh-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgck-2.so.2 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0 \
libsystemd.so.0"

inherit rpm
