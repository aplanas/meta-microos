SUMMARY = "SSH (SFTP) block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
SSH network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-ssh-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "ac7b7c00bc31cb9283b2379e5d41e81dd0a4fa84b9840ced6df3777e0c46e93c2151402877b0cc6bb6a38e0d63bb4f2dfefb7601ca82220c0a7b90897fb44af8"

RPROVIDES:${PN} += "qemu-block-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4"

inherit rpm
