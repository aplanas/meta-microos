SUMMARY = "SSH (SFTP) block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
SSH network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-ssh-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "bb8559a9178e4e52ca1e27b013f4c1f51d35238371fc364faeb7ec57e33df3c8157330b5eb4fb6d9c36671ca44629b4c44cbebdd345b0ae6da679e2448968a0c"

RPROVIDES:${PN} += "qemu-block-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4"

inherit rpm
