SUMMARY = "SSH plugin for nbdkit"
DESCRIPTION = "This package contains SSH support for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-ssh-plugin-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "f5a6b1adf2cc1bef87ffc2b649795059d1d4b3c68f8e626e8ce263d469b9f84005a5e47041f7f4c3a7f531deaf98448eeec1e06c9de07b5e1e8c59f79d3bf710"

RPROVIDES:${PN} += "nbdkit-ssh-plugin \
nbdkit-ssh-plugin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit) \
nbdkit-server"

inherit rpm
