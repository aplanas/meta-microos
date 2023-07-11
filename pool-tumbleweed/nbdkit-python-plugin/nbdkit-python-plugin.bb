SUMMARY = "Python 3 plugin for nbdkit"
DESCRIPTION = "This package lets you write Python 3 plugins for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-python-plugin-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "eaa770932e58a7c0e79bc5c8ebe355055275ab25ae202af5c2b890d612c9b4387b6c5ae85f91dc9d13090019a87ff614ca0b00d175ccce25b8508ad80aad4dde"

RPROVIDES:${PN} += "nbdkit-python-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
nbdkit-server"

inherit rpm
