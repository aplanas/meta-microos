SUMMARY = "Command line utilities for ZBC/ZAC disk manipulation"
DESCRIPTION = "libzbc is a simple library providing functions for manipulating Zoned \
Block Command (ZBC), Zoned-device ATA command set (ZAC) disks."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "5.13.0"

RPM_NAME = "libzbc-tools-5.13.0-1.4.aarch64.rpm"
RPM_HASH = "9d79349444f334b1073139a92cf4bda5302f46c5772e4f277f1cee36cb7a82c53bcb925662695a59a384fcac5b2e63cebfe266fce5cb94b1d92f5d74ff0ce9ae"

RPROVIDES:${PN} += "libzbc-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzbc.so.5"

inherit rpm
