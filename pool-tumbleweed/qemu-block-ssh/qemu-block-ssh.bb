SUMMARY = "SSH (SFTP) block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
SSH network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-ssh-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "a86d06f330064a18db98b24b73ebe9f941b0c0e94c3579d51cd6f72d835b1df02232d8be140a5e9c69fa4f01633bb33dd20b13993b9c60d09306da0e25bc2c0f"

RPROVIDES:${PN} += "qemu-block-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4"

inherit rpm
