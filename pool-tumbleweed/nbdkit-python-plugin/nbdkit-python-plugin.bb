SUMMARY = "Python 3 plugin for nbdkit"
DESCRIPTION = "This package lets you write Python 3 plugins for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-python-plugin-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "bfde118156c10519095df04a6182f37dc49db4eabcf699da1df6577bbefc228765e049e1f50f2d53f33eddebb43f897e10f8c02b046bd63227d0a9c73aa9a709"

RPROVIDES:${PN} += "nbdkit-python-plugin \
nbdkit-python-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpython3.10.so.1.0()(64bit) \
nbdkit-server"

inherit rpm
