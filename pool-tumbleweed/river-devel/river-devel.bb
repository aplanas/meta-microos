SUMMARY = "Development files for river"
DESCRIPTION = "Modules for interacting or modifying the River Wayland compositor."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-devel-0.2.4+g953-2.1.noarch.rpm"
RPM_HASH = "38af17d54332811a933b31d8dea5a65c9fd43c9e3178080323ba5180c0e8a327ee4f86245ea6fdc4816c519fe2a886ea8731e444db5cc2c2a4aea8053db8cb28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-river-protocols \
river-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
river"

inherit rpm
