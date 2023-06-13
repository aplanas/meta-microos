SUMMARY = "Parity Archive File Generator"
DESCRIPTION = "Parchive creates extra parity data over several volumes. These can be \
used to restore the complete archive after some data loss or \
corruption."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "par-1.1-190.15.aarch64.rpm"
RPM_HASH = "1fe612faf7383b6d25c7e0d679fd81534c0909baa426bbe9942774a7692e9968e1df4e46d8506506ffafa5d07d984cb431d2d347042f71a99adc6baed9a2c26b"

RPROVIDES:${PN} += "par \
par(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
