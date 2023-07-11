SUMMARY = "Development files for libzbc, a ZBC/ZAC disk manipulation library"
DESCRIPTION = "libzbc is a simple library providing functions for manipulating Zoned \
Block Command (ZBC), Zoned-device ATA command set (ZAC) disks. \
 \
This subpackage contains the files needed to build against libzbc."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "5.13.0"

RPM_NAME = "libzbc-devel-5.13.0-1.4.aarch64.rpm"
RPM_HASH = "16890c9f33c1af795793da02ebd062ec4bb8a20d4692f82395fea22e4cb2b6ccd8cbd4ab4aa9986b700192a630a7a288aa751803abb0509455478b439058c8cf"

RPROVIDES:${PN} += "libzbc-devel \
pkgconfig-libzbc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzbc5"

inherit rpm
