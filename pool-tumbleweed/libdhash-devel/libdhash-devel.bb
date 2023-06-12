SUMMARY = "Development files for libdhash"
DESCRIPTION = "A hash table which will dynamically resize to achieve optimal storage & access \
time properties"
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libdhash-devel-0.5.0-27.18.aarch64.rpm"
RPM_HASH = "bb0d286dd72f004354b7af6e4f7715a32071bb3caf6391b7fa89a00aebf7cf38e763dc0d42a1720a7609659b4ea592c311f3b2c6753d4ff73b3e6805fda99b8e"

RPROVIDES:${PN} += "libdhash-devel \
libdhash-devel(aarch-64) \
pkgconfig(dhash)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdhash1"

inherit rpm
