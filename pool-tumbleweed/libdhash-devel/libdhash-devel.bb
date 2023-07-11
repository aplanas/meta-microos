SUMMARY = "Development files for libdhash"
DESCRIPTION = "A hash table which will dynamically resize to achieve optimal storage & access \
time properties"
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libdhash-devel-0.5.0-28.1.aarch64.rpm"
RPM_HASH = "454b226c7eb212ad5fb49b0852af5fb04b1a37a9db53213a474a65f4c889402eb549453bf552c8d7cc6a436b181b6102c147f16d9a0ba917678adfc46ce0a71f"

RPROVIDES:${PN} += "libdhash-devel \
pkgconfig-dhash"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdhash1"

inherit rpm
