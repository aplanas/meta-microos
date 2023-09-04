SUMMARY = "SSH (SFTP) block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
SSH network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-block-ssh-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "1aec034fc3d068439b373f2c1d9fca72f593341c1aada8e4faf03a00d9c28669fce6b21fd3eede931405039a9e1a61daf7f5926d4d01dd177e84f4e08287c42c"

RPROVIDES:${PN} += "qemu-block-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4"

inherit rpm
