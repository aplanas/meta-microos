SUMMARY = "Utilities for Amazon S3 service"
DESCRIPTION = "A command-line frontend for Amazon S3 access."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "4.1.git277"

RPM_NAME = "libs3-tools-4.1.git277-1.16.aarch64.rpm"
RPM_HASH = "f6cffaaa7e59341ee28cb0a096ccef3aecaec7bfb81997df76dc429f45546cd5acf5500a3fa4069969d002e29c29efb53c90d624bfb30c7969d5bbacac5b2d9b"

RPROVIDES:${PN} += "libs3-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libs3.so.4"

inherit rpm
