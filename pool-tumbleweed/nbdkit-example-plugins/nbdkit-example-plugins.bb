SUMMARY = "Example plugins for nbdkit"
DESCRIPTION = "This package contains example plugins for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-example-plugins-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "1fbf1ccda89b59e77bc35e6f6a8c1b604f4b754ce95e578d84adaf1a530ac76fc7c11f00c9788d400a12edd3e7315fa392db6a220c8216ecc515c9a71fe9164f"

RPROVIDES:${PN} += "nbdkit-example-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
nbdkit-server"

inherit rpm
