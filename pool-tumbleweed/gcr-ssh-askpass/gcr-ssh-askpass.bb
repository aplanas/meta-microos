SUMMARY = "SSH password callback helper for gcr"
DESCRIPTION = "gcr-ssh-askpass allows an ssh command to callback for a password."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "gcr-ssh-askpass-4.1.0-1.2.aarch64.rpm"
RPM_HASH = "cca8633a2c7a27122539b50c36c375088099f032cd724d4c831d8cc6b8be5321782c0dd9027d6dbd6a9c77f17d7202c3542290d2e789e3155af7b5c4ae0b04e6"

RPROVIDES:${PN} += "gcr-ssh-askpass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
