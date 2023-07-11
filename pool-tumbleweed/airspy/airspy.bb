SUMMARY = "Support programs for Airspy"
DESCRIPTION = "A tiny and efficient software defined radio."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "airspy-1.0.10-1.9.aarch64.rpm"
RPM_HASH = "63a17662b3876cb43a76fffb8d5ac6dac40d3315bb9bad52166d6af37eebc5ce647c9efdcc20b9476b727e3ac5a744dd75b7dbfa639fd350c055c2da75653623"

RPROVIDES:${PN} += "airspy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libairspy.so.0 \
libc.so.6"

inherit rpm
