SUMMARY = "SSH plugin for nbdkit"
DESCRIPTION = "This package contains SSH support for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-ssh-plugin-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "e5a5151e2f6eb79db29913f2e3285052d7e29198db0464dd21e6e9cdd5bd3921b77a4dcd602213c26936eb673c4d513f20bd8bff23655a545bdc9ca5a5846c4d"

RPROVIDES:${PN} += "nbdkit-ssh-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4 \
nbdkit-server"

inherit rpm
