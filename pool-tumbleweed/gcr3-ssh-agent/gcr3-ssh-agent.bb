SUMMARY = "SSH agent binary for gcr"
DESCRIPTION = "gcr-ssh-agent as a standalone binary, so that it can easily be \
managed through systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-ssh-agent-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "c9bacb09c2766ea71587339d0cfe4cb269414b4e6fce96b9888d85fa5bc7b3574276293859b918f99cf882394892ebebfbde521e9728a6418c01ddbb8b057161"

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
