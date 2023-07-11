SUMMARY = "Development Files for libmpd"
DESCRIPTION = "This package provides the API documentation and development files needed to \
develop applications based on libmpd."
LICENSE = "GPL-2.0+"

PV = "11.8.17"

RPM_NAME = "libmpd-devel-11.8.17-1.29.aarch64.rpm"
RPM_HASH = "48996420eb55ea25f71b56c2dbc9f8828acc94a17c847b2492ba8712d628591575b01c65ebaf57c2b354b178264fafcabea531f2195543064d47513397e95825"

RPROVIDES:${PN} += "libmpd-devel \
pkgconfig-libmpd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpd1 \
pkgconfig-glib-2.0"

inherit rpm
