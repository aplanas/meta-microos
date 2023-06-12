SUMMARY = "SSH (SFTP) block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
SSH network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-ssh-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "9047b4823df8fa66d2b3c77f7336f83a4c7882fed3bc512975f35bc7db91e8c720d6f1122faebe1c894634ae464a34ad1f4b19f4872276bf8660fd92d9514102"

RPROVIDES:${PN} += "qemu-block-ssh \
qemu-block-ssh(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit) \
libssh.so.4(LIBSSH_4_7_0)(64bit)"

inherit rpm
