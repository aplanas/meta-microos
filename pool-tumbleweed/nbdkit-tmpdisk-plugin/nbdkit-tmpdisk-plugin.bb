SUMMARY = "Remote temporary filesystem disk plugin for nbdkit"
DESCRIPTION = "This package is a remote temporary filesystem disk plugin for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-tmpdisk-plugin-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "d17423bb249b5e06971357fba073c527f4c4c2849b18497b849c5a145968fc9fe4d6a1da2863cf41d87a97e349a3211bb894ab973fd5f4b570ea8325f0708461"

RPROVIDES:${PN} += "nbdkit-tmpdisk-plugin \
nbdkit-tmpdisk-plugin(aarch-64)"

RDEPENDS:${PN} += "e2fsprogs \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
nbdkit-server \
util-linux"

inherit rpm
