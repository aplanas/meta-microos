SUMMARY = "Development files for libddcutil"
DESCRIPTION = "Header files and pkgconfig control file for libddcutil."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libddcutil-devel-1.4.1-2.2.aarch64.rpm"
RPM_HASH = "783a291350bb33e98432c9743612937e0302752f3092ead6aaa74c7a4b1d2c20e83b53549258679f8bf14d070638fdc81a9eea2d9e6d86c3f43d86d163422fd5"

RPROVIDES:${PN} += "libddcutil-devel \
pkgconfig-ddcutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libddcutil4"

inherit rpm
