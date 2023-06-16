SUMMARY = "SSH agent binary for gcr"
DESCRIPTION = "gcr-ssh-agent as a standalone binary, so that it can easily be \
managed through systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-ssh-agent-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "821cdd8a8f3584d049f4e93db2ff1466bfb258e51d6f2a884b5cbd3a7c053ce0888b0dd95d708405d9bde9859df88625c163429e44f530d4c5bf0eae4689c4d7"

RPROVIDES:${PN} += "gcr-ssh-agent \
gcr3-ssh-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgck-1.so.0 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0 \
libsystemd.so.0"

inherit rpm
