SUMMARY = "Example plugins for nbdkit"
DESCRIPTION = "This package contains example plugins for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-example-plugins-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "53a2b65e23922c8f841e221434ef768f06c0c8e83e643374658c581d301cbc0724f393a222177f16fd093ad3b4bfd88e6b93064d1bc4c5b4a1033e17117eb70d"

RPROVIDES:${PN} += "nbdkit-example-plugins \
nbdkit-example-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
nbdkit-server"

inherit rpm
