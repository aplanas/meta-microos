SUMMARY = "Development files for river"
DESCRIPTION = "Modules for interacting or modifying the River Wayland compositor."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-devel-0.2.4+g953-1.1.noarch.rpm"
RPM_HASH = "ce34440d4bde77ad9af229d87a967b3a75cc7746625a039ebda5484120d507e3ea3c69ab57a2467381965394c0c25044c96878ae48d42703c6e156925d67d81e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-river-protocols \
river-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
river"

inherit rpm
